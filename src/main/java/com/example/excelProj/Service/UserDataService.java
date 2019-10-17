package com.example.excelProj.Service;

import com.example.excelProj.Dto.UserDataDTO;
import com.example.excelProj.Model.UserData;
import com.example.excelProj.Repository.UserDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserDataService {
@Autowired
    UserDataRepository userDataRepository;

    public String saveUserData(UserDataDTO userDataDTO){

        UserData userData = new UserData();
        userData.setName(userDataDTO.getName());
        userData.setEmail1(userDataDTO.getEmail1());
        userData.setEmail2(userDataDTO.getEmail2());
        userData.setPhone1(userDataDTO.getPhone1());
        userData.setPhone2(userDataDTO.getPhone2());
        userData.setCompany(userDataDTO.getCompany());
        userData.setNationality(userDataDTO.getNationality());
        userData.setCountryOfResidence(userDataDTO.getCountryOfResidence());
        userData.setStatus1(userDataDTO.getStatus1());
        userData.setStatus2(userDataDTO.getStatus2());
        userData.setStatus3(userDataDTO.getStatus3());
        userData.setDateOffc(userDataDTO.getDateOffc());
        userData.setFirstPointOfContact(userDataDTO.getFirstPointOfContact());
        userData.setDetails(userDataDTO.getDetails());
        userData.setoEmbassyGardens(userDataDTO.getoEmbassyGardens());
        userData.setoTheGallery(userDataDTO.getoTheGallery());
        userData.setoTheResidence(userDataDTO.getoTheResidence());
        userData.setoCliftonCourt(userDataDTO.getoCliftonCourt());
        userData.setoCliftonPalace(userDataDTO.getoCliftonPalace());
        userData.setoKaiVIllas(userDataDTO.getoKaiVIllas());
        userData.setoAddyVillas(userDataDTO.getoAddyVillas());
        userData.setTotal(userDataDTO.getTotal());
        userData.settEmbassyGardens(userDataDTO.gettEmbassyGardens());
        userData.settTheGallery(userDataDTO.gettTheGallery());
        userData.settTheResidence(userDataDTO.gettTheResidence());
        userData.settCliftonCourt(userDataDTO.gettCliftonCourt());
        userData.settCLiftonPalace(userDataDTO.gettCLiftonPalace());
        userData.settKaiVillas(userDataDTO.gettKaiVillas());
        userData.settAddyVillas(userDataDTO.gettAddyVillas());
        userDataRepository.save(userData);
        return "{\"Added successfully\":1}";

    }
    public String  deleteUser(Long id)
    {
        Optional<UserData> userData = this.userDataRepository.findById(id);
        if(userData.isPresent()){
            this.userDataRepository.deleteById(id);
        }
        return "{\"Deleted successfully\":1}";

    }
    public List<UserData> getUsers()
    {
            List <UserData> userData = userDataRepository.findAll();
            return userData;
    }


}