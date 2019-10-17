package com.example.excelProj.Repository;

import com.example.excelProj.Model.UserData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDataRepository extends JpaRepository <UserData , Long> {
}
