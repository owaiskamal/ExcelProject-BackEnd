package com.example.excelProj.Repository;

import com.example.excelProj.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao extends JpaRepository<User, Long> {

    User findByEmail(String username);
    @Query(value = "select * from user where active=true",nativeQuery = true)
    public List<User> findByActive();
}
