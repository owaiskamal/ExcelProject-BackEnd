package com.example.excelProj.Service;

import com.example.excelProj.Dto.SearchDTO;
import com.example.excelProj.Model.UserData;
import com.example.excelProj.Repository.UserDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SearchService {
    @Autowired
    UserDataRepository userDataRepository;

    public List<UserData> searchAllData(SearchDTO searchDTO){
        List<UserData> userData=userDataRepository.findAll();

        return null;
    }
}
