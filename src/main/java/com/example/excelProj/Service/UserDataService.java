package com.example.excelProj.Service;

import com.example.excelProj.Dto.UserDataDTO;
import com.example.excelProj.Model.ActivityLogs;
import com.example.excelProj.Model.User;
import com.example.excelProj.Model.UserData;
import com.example.excelProj.Repository.ActivityLogsRepository;
import com.example.excelProj.Repository.UserDaoRepository;
import com.example.excelProj.Repository.UserDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
//import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.text.DateFormat;
@Service
public class UserDataService {
@Autowired
    UserDataRepository userDataRepository;


    @Autowired
    ActivityLogsRepository activityLogsRepository;

    @Autowired
    UserDaoRepository userDaoRepository;




    public String saveUserData(UserDataDTO userDataDTO){

        UserData userData = new UserData();
        populateUserData(userDataDTO, userData);
        userData = userDataRepository.save(userData);

        //ActivityLogs
        String shortDate = short_Date(new Date());

        ActivityLogs activityLogs = new ActivityLogs();
        populateActivityLogs(userData,activityLogs);

        activityLogs.setCreatedAt(shortDate);
        activityLogs.setCreatedBy(username());
        activityLogs.setUpdatedBy(username());
        activityLogs.setUpdatedAt(shortDate);
        activityLogsRepository.save(activityLogs);

        return "{\"Added successfully\":1}";

    }

    private String short_Date(Date date) {
        DateFormat getDate = DateFormat.getDateInstance(DateFormat.SHORT);
        DateFormat getTime = DateFormat.getTimeInstance(DateFormat.SHORT);
        String formattedDate =  getDate.format(date) +" " + getTime.format(date) ;
        return  formattedDate;
    }

    private void populateActivityLogs(UserData userData, ActivityLogs activityLogs) {


        activityLogs.setUserDataId(userData.getId());
        activityLogs.setActivityStatus("Active");
        activityLogs.setName(userData.getName());
        activityLogs.setEmail1(userData.getEmail1());
        activityLogs.setEmail2(userData.getEmail2());
        activityLogs.setPhoneNo1(userData.getPhoneNo1());
        activityLogs.setPhoneNo2(userData.getPhoneNo2());
        activityLogs.setCompany(userData.getCompany());
        activityLogs.setNationality(userData.getNationality());
        activityLogs.setCountryOfResidence(userData.getCountryOfResidence());
        activityLogs.setStatus1(userData.getStatus1());
        activityLogs.setStatus2(userData.getStatus2());
        activityLogs.setStatus3(userData.getStatus3());
        activityLogs.setDateOffc(userData.getDateOffc());
        activityLogs.setFirstPointOfContact(userData.getFirstPointOfContact());
        activityLogs.setDetails(userData.getDetails());
        activityLogs.setoEmbassyGardens(userData.isoEmbassyGardens());
        activityLogs.setoTheGallery(userData.isoTheGallery());
        activityLogs.setoTheResidence(userData.isoTheResidence());
        activityLogs.setoCliftonCourt(userData.isoCliftonCourt());
        activityLogs.setoCliftonPlace(userData.isoCliftonPlace());
        activityLogs.setoKaiVillas(userData.isoKaiVillas());
        activityLogs.setoAddyVillas(userData.isoAddyVillas());
        activityLogs.setTotal(userData.getTotal());
        activityLogs.settEmbassyGardens(userData.istEmbassyGardens());
        activityLogs.settTheGallery(userData.istTheGallery());
        activityLogs.settTheResidence(userData.istTheResidence());
        activityLogs.settCliftonCourt(userData.istCliftonCourt());
        activityLogs.settCLiftonPalace(userData.istCLiftonPalace());
        activityLogs.settKaiVillas(userData.istKaiVillas());
        activityLogs.settAddyVillas(userData.istAddyVillas());
//        activityLogs.setCreatedAt(new Date());
//        activityLogs.setCreatedBy("System");
//        activityLogs.setUpdatedAt(new Date());
//        activityLogs.setUpdatedBy("System");

    }


    private void populateUserData(UserDataDTO userDataDTO, UserData userData) {
        userData.setActivityStatus("Active");
        userData.setName(userDataDTO.getName());
        userData.setEmail1(userDataDTO.getEmail1());
        userData.setEmail2(userDataDTO.getEmail2());
        userData.setPhoneNo1(userDataDTO.getPhoneNo1());
        userData.setPhoneNo2(userDataDTO.getPhoneNo2());
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
        userData.setoCliftonPlace(userDataDTO.isoCliftonPlace());
        userData.setoKaiVillas(userDataDTO.isoKaiVillas());
        userData.setoAddyVillas(userDataDTO.isoAddyVillas());
        userData.setTotal(userDataDTO.getTotal());
        userData.settEmbassyGardens(userDataDTO.istEmbassyGardens());
        userData.settTheGallery(userDataDTO.istTheGallery());
        userData.settTheResidence(userDataDTO.istTheResidence());
        userData.settCliftonCourt(userDataDTO.istCliftonCourt());
        userData.settCLiftonPalace(userDataDTO.istCLiftonPalace());
        userData.settKaiVillas(userDataDTO.istKaiVillas());
        userData.settAddyVillas(userDataDTO.istAddyVillas());
    }

    public List<UserData> deleteUser(Long id)
    {
        Optional<UserData> userData = this.userDataRepository.findById(id);
        if(userData.isPresent()){
            String createdBy = "";
            UserData data = userData.get();
                data.setActivityStatus("InActive");
                if(data.getId()!=null){
                  List<ActivityLogs> activityLogs = this.activityLogsRepository.findByUserDataId(data.getId());
                    for (ActivityLogs a:activityLogs){
                        if(a.getCreatedBy()!=null){
                            createdBy = a.getCreatedBy();
                            break;
                        }

                    }
                }
                data=userDataRepository.save(data);
            ActivityLogs activityLogs = new ActivityLogs();
            activityLogs.setUpdatedAt(short_Date(new Date()));
            activityLogs.setUpdatedBy(username());
            activityLogs.setCreatedBy(createdBy);
            populateActivityLogs(data,activityLogs);
            activityLogsRepository.save(activityLogs);

        }
        return this.getUsersData();

    }


    public List<UserData> deleteUserDataIfUserLoggedIn(Long id)
    {
        Optional<UserData> userData = this.userDataRepository.findById(id);
        if(userData.isPresent()){
            String createdBy = "";
            UserData data = userData.get();
            data.setActivityStatus("InActive");
            if(data.getId()!=null){
                List<ActivityLogs> activityLogs = this.activityLogsRepository.findByUserDataId(data.getId());
                for (ActivityLogs a:activityLogs){
                    if(a.getCreatedBy()!=null){
                        createdBy = a.getCreatedBy();
                        break;
                    }

                }
            }
            data=userDataRepository.save(data);
            ActivityLogs activityLogs = new ActivityLogs();
            activityLogs.setUpdatedAt(short_Date(new Date()));
            activityLogs.setUpdatedBy(username());
            activityLogs.setCreatedBy(createdBy);
            populateActivityLogs(data,activityLogs);
            activityLogsRepository.save(activityLogs);

        }

       return  this.getActiveUserData();


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
    public List<UserData> getUsersData()
    {
            List <UserData> userData = userDataRepository.findAll();
            return userData;
    }

    public List<UserData> getActiveUserData()
    {
        List <UserData> userData = userDataRepository.findByActivityStatus("Active");
        return userData;
    }



    public String updateUser(Long id , UserDataDTO userDataDTO)
    {
        String createdBy = "";
       // UserData userData = new UserData();
        Optional<UserData> optionalUserData = this.userDataRepository.findById(id);
        if(optionalUserData.isPresent())
        {
            UserData userData = optionalUserData.get();

            userData.setName(userDataDTO.getName());
            userData.setEmail1(userDataDTO.getEmail1());
            userData.setEmail2(userDataDTO.getEmail2());
            userData.setPhoneNo1(userDataDTO.getPhoneNo1());
            userData.setPhoneNo2(userDataDTO.getPhoneNo2());
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
            userData.setoCliftonPlace(userDataDTO.isoCliftonPlace());
            userData.setoKaiVillas(userDataDTO.isoKaiVillas());
            userData.setoAddyVillas(userDataDTO.isoAddyVillas());
            userData.setTotal(userDataDTO.getTotal());
            userData.settEmbassyGardens(userDataDTO.istEmbassyGardens());
            userData.settTheGallery(userDataDTO.istTheGallery());
            userData.settTheResidence(userDataDTO.istTheResidence());
            userData.settCliftonCourt(userDataDTO.istCliftonCourt());
            userData.settCLiftonPalace(userDataDTO.istCLiftonPalace());
            userData.settKaiVillas(userDataDTO.istKaiVillas());
            userData.settAddyVillas(userDataDTO.istAddyVillas());
            userData = userDataRepository.save(userData);

            if(userData.getId()!=null){
                List<ActivityLogs> activityLogs = this.activityLogsRepository.findByUserDataId(userData.getId());
                for (ActivityLogs a:activityLogs){
                    if(a.getCreatedBy()!=null){
                        createdBy = a.getCreatedBy();
                        break;
                    }

                }
            }

            ActivityLogs activityLogs = new ActivityLogs();
            activityLogs.setCreatedBy(createdBy);
            activityLogs.setUpdatedBy(username());
            activityLogs.setUpdatedAt(short_Date(new Date()));
            populateActivityLogs(userData,activityLogs);
            activityLogsRepository.save(activityLogs);
            return "{\"Updated successfully\":1}";

        }
        else
        {
            return "{\"No User with This ID\":0}";
        }
    }

    public List<ActivityLogs> getActivityLogs(Long id){
        List<ActivityLogs> activityLogs = activityLogsRepository.findByUserDataId(id);
        return activityLogs;
    }

    public List<UserData> reactiveUser(Long id)
    {
        Optional<UserData> userData = this.userDataRepository.findById(id);
        if(userData.isPresent()){
            String createdBy = "";
            UserData data = userData.get();
            data.setActivityStatus("Active");
            if(data.getId()!=null){
                List<ActivityLogs> activityLogs = this.activityLogsRepository.findByUserDataId(data.getId());
                for (ActivityLogs a:activityLogs){
                    if(a.getCreatedBy()!=null){
                        createdBy = a.getCreatedBy();
                        break;
                    }

                }
            }
            data=userDataRepository.save(data);
            ActivityLogs activityLogs = new ActivityLogs();
            activityLogs.setUpdatedAt(short_Date(new Date()));
            activityLogs.setUpdatedBy(username());
            activityLogs.setCreatedBy(createdBy);
            populateActivityLogs(data,activityLogs);
            activityLogsRepository.save(activityLogs);

        }
        return this.getUsersData();

    }
    public String username()
    {
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication()
                .getPrincipal();
        String username = userDetails.getUsername();
        User user = userDaoRepository.findByEmail(username);
        return  user.getName();

    }


}
