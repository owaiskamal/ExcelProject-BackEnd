package com.example.excelProj.Dto;

public class SearchDTO {
    String name;
    String email;
    String status;
    String phoneNumber;
    String date;

    public SearchDTO() {
    }

    public SearchDTO(String name, String email, String status, String phoneNumber, String date) {
        this.name = name;
        this.email = email;
        this.status = status;
        this.phoneNumber = phoneNumber;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}

