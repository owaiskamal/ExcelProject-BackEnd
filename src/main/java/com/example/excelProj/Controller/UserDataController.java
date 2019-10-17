package com.example.excelProj.Controller;

import com.example.excelProj.Dto.UserDataDTO;
import com.example.excelProj.Model.UserData;
import com.example.excelProj.Service.UserDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/data")
public class UserDataController {
    @Autowired
    UserDataService dataService;


    @PostMapping(value = "/")
    public String postUser(@RequestBody UserDataDTO userDataDTO ){
        return dataService.saveUserData(userDataDTO);
    }

    @DeleteMapping(value = "/{id}")
    public String deleteUser(@PathVariable Long id)
    {
        return dataService.deleteUser(id);
    }
    @GetMapping(value ="/")
    public List<UserData> getUsersData()
    {
        return dataService.getUsers();

    }
}
