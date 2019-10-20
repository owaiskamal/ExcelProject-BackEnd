package com.example.excelProj.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "UserData")
public class UserData {


    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String  email1;
    private String activityStatus;
    private String email2;
    private String phoneNo1;
    private String phoneNo2;
    private String company;
    private String nationality;
    private String countryOfResidence;
    private String status1;
    private String status2;
    private String status3;
    private String  dateOffc;
    private String firstPointOfContact;
    private String details;
    private boolean oEmbassyGardens;
    private boolean oTheGallery;
    private boolean oTheResidence;
    private boolean oCliftonPlace;
    private boolean oCliftonCourt;
    private boolean oKaiVillas;
    private boolean oAddyVillas;
    private Long Total;
    private boolean tEmbassyGardens;
    private boolean tTheGallery;
    private boolean tTheResidence;
    private boolean tCLiftonPalace;
    private boolean tCliftonCourt;
    private boolean tKaiVillas;
    private boolean tAddyVillas;

    public UserData() {
    }

    public UserData(String name, String email1, String activityStatus, String email2, String phoneNo1, String phoneNo2, String company, String nationality, String countryOfResidence, String status1, String status2, String status3, String dateOffc, String firstPointOfContact, String details, boolean oEmbassyGardens, boolean oTheGallery, boolean oTheResidence, boolean oCliftonPlace, boolean oCliftonCourt, boolean oKaiVillas, boolean oAddyVillas, Long total, boolean tEmbassyGardens, boolean tTheGallery, boolean tTheResidence, boolean tCLiftonPalace, boolean tCliftonCourt, boolean tKaiVillas, boolean tAddyVillas) {
        this.name = name;
        this.email1 = email1;
        this.activityStatus = activityStatus;
        this.email2 = email2;
        this.phoneNo1 = phoneNo1;
        this.phoneNo2 = phoneNo2;
        this.company = company;
        this.nationality = nationality;
        this.countryOfResidence = countryOfResidence;
        this.status1 = status1;
        this.status2 = status2;
        this.status3 = status3;
        this.dateOffc = dateOffc;
        this.firstPointOfContact = firstPointOfContact;
        this.details = details;
        this.oEmbassyGardens = oEmbassyGardens;
        this.oTheGallery = oTheGallery;
        this.oTheResidence = oTheResidence;
        this.oCliftonPlace = oCliftonPlace;
        this.oCliftonCourt = oCliftonCourt;
        this.oKaiVillas = oKaiVillas;
        this.oAddyVillas = oAddyVillas;
        Total = total;
        this.tEmbassyGardens = tEmbassyGardens;
        this.tTheGallery = tTheGallery;
        this.tTheResidence = tTheResidence;
        this.tCLiftonPalace = tCLiftonPalace;
        this.tCliftonCourt = tCliftonCourt;
        this.tKaiVillas = tKaiVillas;
        this.tAddyVillas = tAddyVillas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail1() {
        return email1;
    }

    public void setEmail1(String email1) {
        this.email1 = email1;
    }

    public String getActivityStatus() {
        return activityStatus;
    }

    public void setActivityStatus(String activityStatus) {
        this.activityStatus = activityStatus;
    }

    public String getEmail2() {
        return email2;
    }

    public void setEmail2(String email2) {
        this.email2 = email2;
    }

    public String getPhoneNo1() {
        return phoneNo1;
    }

    public void setPhoneNo1(String phoneNo1) {
        this.phoneNo1 = phoneNo1;
    }

    public String getPhoneNo2() {
        return phoneNo2;
    }

    public void setPhoneNo2(String phoneNo2) {
        this.phoneNo2 = phoneNo2;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getCountryOfResidence() {
        return countryOfResidence;
    }

    public void setCountryOfResidence(String countryOfResidence) {
        this.countryOfResidence = countryOfResidence;
    }

    public String getStatus1() {
        return status1;
    }

    public void setStatus1(String status1) {
        this.status1 = status1;
    }

    public String getStatus2() {
        return status2;
    }

    public void setStatus2(String status2) {
        this.status2 = status2;
    }

    public String getStatus3() {
        return status3;
    }

    public void setStatus3(String status3) {
        this.status3 = status3;
    }

    public String getDateOffc() {
        return dateOffc;
    }

    public void setDateOffc(String dateOffc) {
        this.dateOffc = dateOffc;
    }

    public String getFirstPointOfContact() {
        return firstPointOfContact;
    }

    public void setFirstPointOfContact(String firstPointOfContact) {
        this.firstPointOfContact = firstPointOfContact;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public boolean isoEmbassyGardens() {
        return oEmbassyGardens;
    }

    public void setoEmbassyGardens(boolean oEmbassyGardens) {
        this.oEmbassyGardens = oEmbassyGardens;
    }

    public boolean isoTheGallery() {
        return oTheGallery;
    }

    public void setoTheGallery(boolean oTheGallery) {
        this.oTheGallery = oTheGallery;
    }

    public boolean isoTheResidence() {
        return oTheResidence;
    }

    public void setoTheResidence(boolean oTheResidence) {
        this.oTheResidence = oTheResidence;
    }

    public boolean isoCliftonPlace() {
        return oCliftonPlace;
    }

    public void setoCliftonPlace(boolean oCliftonPlace) {
        this.oCliftonPlace = oCliftonPlace;
    }

    public boolean isoCliftonCourt() {
        return oCliftonCourt;
    }

    public void setoCliftonCourt(boolean oCliftonCourt) {
        this.oCliftonCourt = oCliftonCourt;
    }

    public boolean isoKaiVillas() {
        return oKaiVillas;
    }

    public void setoKaiVillas(boolean oKaiVillas) {
        this.oKaiVillas = oKaiVillas;
    }

    public boolean isoAddyVillas() {
        return oAddyVillas;
    }

    public void setoAddyVillas(boolean oAddyVillas) {
        this.oAddyVillas = oAddyVillas;
    }

    public Long getTotal() {
        return Total;
    }

    public void setTotal(Long total) {
        Total = total;
    }

    public boolean istEmbassyGardens() {
        return tEmbassyGardens;
    }

    public void settEmbassyGardens(boolean tEmbassyGardens) {
        this.tEmbassyGardens = tEmbassyGardens;
    }

    public boolean istTheGallery() {
        return tTheGallery;
    }

    public void settTheGallery(boolean tTheGallery) {
        this.tTheGallery = tTheGallery;
    }

    public boolean istTheResidence() {
        return tTheResidence;
    }

    public void settTheResidence(boolean tTheResidence) {
        this.tTheResidence = tTheResidence;
    }

    public boolean istCLiftonPalace() {
        return tCLiftonPalace;
    }

    public void settCLiftonPalace(boolean tCLiftonPalace) {
        this.tCLiftonPalace = tCLiftonPalace;
    }

    public boolean istCliftonCourt() {
        return tCliftonCourt;
    }

    public void settCliftonCourt(boolean tCliftonCourt) {
        this.tCliftonCourt = tCliftonCourt;
    }

    public boolean istKaiVillas() {
        return tKaiVillas;
    }

    public void settKaiVillas(boolean tKaiVillas) {
        this.tKaiVillas = tKaiVillas;
    }

    public boolean istAddyVillas() {
        return tAddyVillas;
    }

    public void settAddyVillas(boolean tAddyVillas) {
        this.tAddyVillas = tAddyVillas;
    }
    public boolean checkAllEmail(String email){
        if(email.equalsIgnoreCase(this.email1) || email.equalsIgnoreCase(this.email2)){
            return true;
        }
        return false;

    }
    public boolean checkAllStatus(String status){
        if(status.equalsIgnoreCase(this.status1)||status.equalsIgnoreCase(this.status2)||status.equalsIgnoreCase(this.status3))
        {
            return true;

        }
        return false;

    }

    public boolean checkAllPhoneNumber(String phoneNo){
        if(phoneNo.equalsIgnoreCase(this.phoneNo1)||phoneNo.equalsIgnoreCase(this.phoneNo1)){return true;}
        return false;

    }
}
