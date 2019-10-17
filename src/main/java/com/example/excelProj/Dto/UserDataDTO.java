package com.example.excelProj.Dto;

import java.util.Date;

public class UserDataDTO {
    private Long id;
    private String name;
    private String  email1;
    private String email2;
    private String phone1;
    private String phone2;
    private String company;
    private String nationality;
    private String countryOfResidence;
    private String status1;
    private String status2;
    private String status3;
    private Date dateOffc;
    private String firstPointOfContact;
    private String details;
    private String oEmbassyGardens;
    private String oTheGallery;
    private String oTheResidence;
    private String oCliftonPalace;
    private String oCliftonCourt;
    private String oKaiVIllas;
    private String oAddyVillas;
    private Long Total;
    private String tEmbassyGardens;
    private String tTheGallery;
    private String tTheResidence;
    private String tCLiftonPalace;
    private String tCliftonCourt;
    private String tKaiVillas;
    private String tAddyVillas;

    public UserDataDTO(Long id, String email1, String email2, String phone1, String phone2, String company, String nationality, String countryOfResidence, String status1, String status2, String status3, Date dateOffc, String firstPointOfContact, String details, String oEmbassyGardens, String oTheGallery, String oCliftonPalace, String oCliftonCourt, String oKaiVIllas, String oAddyVillas, Long total, String tEmbassyGardens, String tTheGallery, String tCLiftonPalace, String tCliftonCourt, String tKaiVillas, String tAddyVillas) {
        this.id = id;
        this.email1 = email1;
        this.email2 = email2;
        this.phone1 = phone1;
        this.phone2 = phone2;
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
        this.oCliftonPalace = oCliftonPalace;
        this.oCliftonCourt = oCliftonCourt;
        this.oKaiVIllas = oKaiVIllas;
        this.oAddyVillas = oAddyVillas;
        Total = total;
        this.tEmbassyGardens = tEmbassyGardens;
        this.tTheGallery = tTheGallery;
        this.tCLiftonPalace = tCLiftonPalace;
        this.tCliftonCourt = tCliftonCourt;
        this.tKaiVillas = tKaiVillas;
        this.tAddyVillas = tAddyVillas;
    }

    public UserDataDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail1() {
        return email1;
    }

    public void setEmail1(String email1) {
        this.email1 = email1;
    }

    public String getEmail2() {
        return email2;
    }

    public void setEmail2(String email2) {
        this.email2 = email2;
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
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

    public Date getDateOffc() {
        return dateOffc;
    }

    public void setDateOffc(Date dateOffc) {
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

    public String getoEmbassyGardens() {
        return oEmbassyGardens;
    }

    public void setoEmbassyGardens(String oEmbassyGardens) {
        this.oEmbassyGardens = oEmbassyGardens;
    }

    public String getoTheGallery() {
        return oTheGallery;
    }

    public void setoTheGallery(String oTheGallery) {
        this.oTheGallery = oTheGallery;
    }

    public String getoCliftonPalace() {
        return oCliftonPalace;
    }

    public void setoCliftonPalace(String oCliftonPalace) {
        this.oCliftonPalace = oCliftonPalace;
    }

    public String getoCliftonCourt() {
        return oCliftonCourt;
    }

    public void setoCliftonCourt(String oCliftonCourt) {
        this.oCliftonCourt = oCliftonCourt;
    }

    public String getoKaiVIllas() {
        return oKaiVIllas;
    }

    public void setoKaiVIllas(String oKaiVIllas) {
        this.oKaiVIllas = oKaiVIllas;
    }

    public String getoAddyVillas() {
        return oAddyVillas;
    }

    public void setoAddyVillas(String oAddyVillas) {
        this.oAddyVillas = oAddyVillas;
    }

    public Long getTotal() {
        return Total;
    }

    public void setTotal(Long total) {
        Total = total;
    }

    public String gettEmbassyGardens() {
        return tEmbassyGardens;
    }

    public void settEmbassyGardens(String tEmbassyGardens) {
        this.tEmbassyGardens = tEmbassyGardens;
    }

    public String gettTheGallery() {
        return tTheGallery;
    }

    public void settTheGallery(String tTheGallery) {
        this.tTheGallery = tTheGallery;
    }

    public String gettCLiftonPalace() {
        return tCLiftonPalace;
    }

    public void settCLiftonPalace(String tCLiftonPalace) {
        this.tCLiftonPalace = tCLiftonPalace;
    }

    public String gettCliftonCourt() {
        return tCliftonCourt;
    }

    public void settCliftonCourt(String tCliftonCourt) {
        this.tCliftonCourt = tCliftonCourt;
    }

    public String gettKaiVillas() {
        return tKaiVillas;
    }

    public void settKaiVillas(String tKaiVillas) {
        this.tKaiVillas = tKaiVillas;
    }

    public String gettAddyVillas() {
        return tAddyVillas;
    }

    public void settAddyVillas(String tAddyVillas) {
        this.tAddyVillas = tAddyVillas;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String gettTheResidence() {
        return tTheResidence;
    }

    public void settTheResidence(String tTheResidence) {
        this.tTheResidence = tTheResidence;
    }

    public String getoTheResidence() {
        return oTheResidence;
    }

    public void setoTheResidence(String oTheResidence) {
        this.oTheResidence = oTheResidence;
    }
}
