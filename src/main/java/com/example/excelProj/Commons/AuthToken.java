package com.example.excelProj.Commons;

public class AuthToken {

    private String token;
    private String username;
    private String userType;
    private  String email;

    public AuthToken(String token, String username, String userType) {
        this.token = token;
        this.username = username;
        this.userType = userType;
    }

    public AuthToken(String token, String username, String userType, String email) {
        this.token = token;
        this.username = username;
        this.userType = userType;
        this.email = email;
    }

    public AuthToken(){

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public AuthToken(String token){
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
