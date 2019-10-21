package com.example.excelProj.Controller;

import com.example.excelProj.Dto.UserDataDTO;
import com.example.excelProj.Model.ActivityLogs;
import com.example.excelProj.Model.UserData;
import com.example.excelProj.Service.UserDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/data")
public class UserDataController {
    @Autowired
    UserDataService dataService;


    @PostMapping(value = "/")
    public String postUser(@RequestBody UserDataDTO userDataDTO ){
        return dataService.saveUserData(userDataDTO);
    }

    @DeleteMapping(value = "/{id}")
    public List<UserData> deleteUser(@PathVariable Long id)
    {
        return dataService.deleteUser(id);
    }

    @DeleteMapping(value = "/user/{id}")
    public List<UserData> deleteUserData(@PathVariable Long id)
    {
        return dataService.deleteUserDataIfUserLoggedIn(id);
    }

    @GetMapping(value ="/")
    public List<UserData> getUsersData()
    {
        return dataService.getUsersData();

    }

    @GetMapping(value ="/active")
    public List<UserData> getActive()
    {
        return dataService.getActiveUserData();

    }
    @PutMapping( value = "/{id}")
    public String updateUser(@PathVariable Long id , @RequestBody UserDataDTO userDataDTO)
    {
        return this.dataService.updateUser(id , userDataDTO);
    }

    @GetMapping( value = "/{id}")
    public UserData getUserById(@PathVariable Long id)
    {
        return this.dataService.getUserById(id);
    }

    @GetMapping(value = "/activityLogs/{id}")
    public List<ActivityLogs> getActivityLogs(@PathVariable Long id){
        return this.dataService.getActivityLogs(id);
    }

    @DeleteMapping(value = "/reactive/{id}")
    public List<UserData> reactiveUser(@PathVariable Long id)
    {
        return dataService.reactiveUser(id);
    }

//    @GetMapping(value ="/")
//    public List<UserData> getUserDataByIfUserIs()
//    {
//        return dataService.getUsersData();
//
//    }
}
