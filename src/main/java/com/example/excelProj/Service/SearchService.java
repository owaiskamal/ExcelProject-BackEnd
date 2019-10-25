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
        if(searchDTO.getoAddyVillas()){
          resultList= resultList.stream()
           .filter(data->searchDTO.getoAddyVillas().equals(data.isoAddyVillas()))
           .collect(Collectors.toList());

        }
        if(searchDTO.getoCliftonCourt()){       // ocliftoncourt
            resultList= resultList.stream()
                    .filter(data->searchDTO.getoCliftonCourt().equals(data.isoCliftonCourt()))
                    .collect(Collectors.toList());

        }
        if(searchDTO.getoCliftonPlace()){                      //
            resultList= resultList.stream()
                    .filter(data->searchDTO.getoCliftonPlace().equals(data.isoCliftonPlace()))
                    .collect(Collectors.toList());

        }
        if(searchDTO.getoEmbassyGardens()){
            resultList= resultList.stream()
                    .filter(data->searchDTO.getoEmbassyGardens().equals(data.isoEmbassyGardens()))
                    .collect(Collectors.toList());

        }
        if(searchDTO.getoKaiVillas()){
            resultList= resultList.stream()
                    .filter(data->searchDTO.getoKaiVillas().equals(data.isoKaiVillas()))
                    .collect(Collectors.toList());

        }
        if(searchDTO.getoTheGallery()){
            resultList= resultList.stream()
                    .filter(data->searchDTO.getoTheGallery().equals(data.isoTheGallery()))
                    .collect(Collectors.toList());

        }
        if(searchDTO.getoTheResidence()){
            resultList= resultList.stream()
                    .filter(data->searchDTO.getoTheResidence().equals(data.isoTheResidence()))
                    .collect(Collectors.toList());

        }
        if(searchDTO.gettAddyVillas()){
            resultList= resultList.stream()
                    .filter(data->searchDTO.gettAddyVillas().equals(data.istAddyVillas()))
                    .collect(Collectors.toList());

        }
        if(searchDTO.gettCliftonCourt()){
            resultList= resultList.stream()
                    .filter(data->searchDTO.gettCliftonCourt().equals(data.istCliftonCourt()))
                    .collect(Collectors.toList());

        }
        if(searchDTO.gettCliftonPlace()){
            resultList= resultList.stream()
                    .filter(data->searchDTO.getoCliftonPlace().equals(data.istCLiftonPalace()))
                    .collect(Collectors.toList());

        }
        if(searchDTO.gettEmbassyGardens()){
            resultList= resultList.stream()
                    .filter(data->searchDTO.gettEmbassyGardens().equals(data.istEmbassyGardens()))
                    .collect(Collectors.toList());

        }
        if(searchDTO.gettKaiVillas()){
            resultList= resultList.stream()
                    .filter(data->searchDTO.gettKaiVillas().equals(data.istKaiVillas()))
                    .collect(Collectors.toList());

        }
        if(searchDTO.gettTheGallery()){
            resultList= resultList.stream()
                    .filter(data->searchDTO.gettTheGallery().equals(data.istTheGallery()))
                    .collect(Collectors.toList());

        }
        if(searchDTO.gettTheResidence()){
            resultList= resultList.stream()
                    .filter(data->searchDTO.gettTheResidence().equals(data.istTheResidence()))
                    .collect(Collectors.toList());

        }





        return resultList;
    }
}
