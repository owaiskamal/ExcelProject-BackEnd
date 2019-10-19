package com.example.excelProj.Service;

import com.example.excelProj.Dto.SearchDTO;
import com.example.excelProj.Model.UserData;
import com.example.excelProj.Repository.UserDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class SearchService {
    @Autowired
    UserDataRepository userDataRepository;

    public List<UserData> searchAllData(SearchDTO searchDTO){
        List<UserData> userData=userDataRepository.findAll();
        List<UserData> resultList = new ArrayList<>();
        resultList.addAll(userData);

        if(!StringUtils.isEmpty(searchDTO.getName())){
            resultList = resultList.stream()
                    .filter(p->p.getName().equalsIgnoreCase(searchDTO.getName()))
                    .collect(Collectors.toList());
        }

        if(!StringUtils.isEmpty(searchDTO.getEmail())){
            resultList = resultList.stream()
                    .filter(p->(p.checkAllEmail(searchDTO.getEmail()))                                )
                    .collect(Collectors.toList());
        }

        if(!StringUtils.isEmpty(searchDTO.getStatus())){
            resultList=resultList.stream()
                    .filter(data->data.checkAllStatus(searchDTO.getStatus()))
                    .collect(Collectors.toList());
        }
        if (!StringUtils.isEmpty(searchDTO.getPhoneNumber())){
            resultList=resultList.stream()
                    .filter(data->data.checkAllPhoneNumber(searchDTO.getPhoneNumber()))
                    .collect(Collectors.toList());


        }
        if(!StringUtils.isEmpty(searchDTO.getDate())){
          resultList=resultList.stream()
                    .filter(data->data.getDateOffc().equalsIgnoreCase(searchDTO.getDate()))
                    .collect(Collectors.toList());
        }



        return resultList;
    }
}
