package com.example.excelProj.Repository;

import com.example.excelProj.Model.UserData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.NamedNativeQuery;
import java.util.List;

@Repository
public interface UserDataRepository extends JpaRepository <UserData , Long> {

    List<UserData> findByActivityStatus(String activityStatus);
}
