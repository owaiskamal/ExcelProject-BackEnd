package com.example.excelProj.Service;

import com.example.excelProj.Repository.UserDao;
import com.example.excelProj.Commons.ApiResponse;
import com.example.excelProj.Dto.UserDto;
import com.example.excelProj.Model.User;
import com.example.excelProj.Repository.UserDao;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.xml.ws.Response;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;


@Service(value = "userService")
public class UserServiceImpl implements UserDetailsService {
	
	@Autowired
	private UserDao userDao;

	@Autowired
	private BCryptPasswordEncoder bcryptEncoder;

	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userDao.findByEmail(username);
		if(user == null){
			throw new UsernameNotFoundException("Invalid username or password.");
		}
		return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), getAuthority(user.getUserType()));
	}

	private List<SimpleGrantedAuthority> getAuthority(String role) {
		return Arrays.asList(new SimpleGrantedAuthority(role));
	}

	public List<User> findAll() {
		List<User> list = new ArrayList<>();
		userDao.findByActive().iterator().forEachRemaining(list::add);
		return list;
	}

	public ApiResponse<List<User>> delete(Long id) {
		Optional<User> userOptional = userDao.findById(id);
		if(userOptional.isPresent()){
			userDao.deleteById(id);
		}
		return new ApiResponse<>(HttpStatus.OK.value(), "User saved successfully.",	userDao.findAll());
	}

	public User findOne(String username) {

		 User user = userDao.findByEmailAndActive(username,Boolean.TRUE);
		 return user;

	}

	public User findById(Long id) {
		Optional<User> optionalUser = userDao.findById(id);

		return optionalUser.isPresent() ?  optionalUser.get() : null;
	}

    public UserDto update(UserDto userDto, Long id) {
        User user = findById(id);
        if(user != null) {
            BeanUtils.copyProperties(userDto, user, "password");
            userDao.save(user);
        }
        return userDto;
    }

    public ApiResponse save(UserDto user) {
		User founduser = userDao.findByEmail(user.getEmail());
		if(founduser == null) {
			User newUser = new User();
			newUser.setEmail(user.getEmail());
			newUser.setName(user.getName());
			newUser.setClientId(user.getClientId());
			newUser.setPassword(bcryptEncoder.encode(user.getPassword()));
			newUser.setUserType(user.getUserType());
			newUser.setActive(user.getActive());
			return new ApiResponse<>(HttpStatus.OK.value(), "User saved successfully.",	userDao.save(newUser));//return ;
		}else{
			return new ApiResponse<>(HttpStatus.NOT_FOUND.value(), "User Already exsist.",null);//return ;
		}
    }


	public List<User> getActiveUsers(Long id){
		Optional<User> user = userDao.findById(id);
		if(user.isPresent()){
			User user1 = user.get();
			user1.setActive(false);
			userDao.save(user1);

			List<User> activeUsers = userDao.findByActive();
			return activeUsers;
 		}

		return null;
	}


}
