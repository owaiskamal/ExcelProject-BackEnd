package com.example.excelProj.Service;

import com.example.excelProj.Dto.UserDataDTO;
import com.example.excelProj.Model.User;
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
        userData.setActivityStatus("Active");
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
        userData.setoEmbassyGardens(userDataDTO.isoEmbassyGardens());
        userData.setoTheGallery(userDataDTO.isoTheGallery());
        userData.setoTheResidence(userDataDTO.isoTheResidence());
        userData.setoCliftonCourt(userDataDTO.isoCliftonCourt());
        userData.setoCliftonPalace(userDataDTO.isoCliftonPalace());
        userData.setoKaiVIllas(userDataDTO.isoKaiVIllas());
        userData.setoAddyVillas(userDataDTO.isoAddyVillas());
        userData.setTotal(userDataDTO.getTotal());
        userData.settEmbassyGardens(userDataDTO.istEmbassyGardens());
        userData.settTheGallery(userDataDTO.istTheGallery());
        userData.settTheResidence(userDataDTO.istTheResidence());
        userData.settCliftonCourt(userDataDTO.istCliftonCourt());
        userData.settCLiftonPalace(userDataDTO.istCLiftonPalace());
        userData.settKaiVillas(userDataDTO.istKaiVillas());
        userData.settAddyVillas(userDataDTO.istAddyVillas());
        userDataRepository.save(userData);
        return "{\"Added successfully\":1}";

    }
    public List<UserData>  deleteUser(Long id)
    {
        Optional<UserData> userData = this.userDataRepository.findById(id);
        if(userData.isPresent()){
            UserData data = userData.get();
                data.setActivityStatus("InActive");
                userDataRepository.save(data);
        }
        return this.getUsers();

    }

    public UserData getUserById(Long id)
    {
        Optional <UserData> userData = this.userDataRepository.findById(id);
        if(userData.isPresent())
        {
            UserData data = userData.get();

            return data;

        }


        return null;
    }
    public List<UserData> getUsers()
    {
            List <UserData> userData = userDataRepository.findAll();
            return userData;
    }


    public String updateUser(Long id , UserDataDTO userDataDTO)
    {
       // UserData userData = new UserData();
        Optional<UserData> optionalUserData = this.userDataRepository.findById(id);
        if(optionalUserData.isPresent())
        {
            UserData userData = optionalUserData.get();
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
            userData.setoEmbassyGardens(userDataDTO.isoEmbassyGardens());
            userData.setoTheGallery(userDataDTO.isoTheGallery());
            userData.setoTheResidence(userDataDTO.isoTheResidence());
            userData.setoCliftonCourt(userDataDTO.isoCliftonCourt());
            userData.setoCliftonPalace(userDataDTO.isoCliftonPalace());
            userData.setoKaiVIllas(userDataDTO.isoKaiVIllas());
            userData.setoAddyVillas(userDataDTO.isoAddyVillas());
            userData.setTotal(userDataDTO.getTotal());
            userData.settEmbassyGardens(userDataDTO.istEmbassyGardens());
            userData.settTheGallery(userDataDTO.istTheGallery());
            userData.settTheResidence(userDataDTO.istTheResidence());
            userData.settCliftonCourt(userDataDTO.istCliftonCourt());
            userData.settCLiftonPalace(userDataDTO.istCLiftonPalace());
            userData.settKaiVillas(userDataDTO.istKaiVillas());
            userData.settAddyVillas(userDataDTO.istAddyVillas());
            userDataRepository.save(userData);
            return "{\"Updated successfully\":1}";

        }
        else
        {
            return "{\"No User with This ID\":0}";
        }
    }


}