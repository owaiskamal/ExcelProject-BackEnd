package com.example.excelProj.Dto;

public class UserDto {

    private String name;
    private String email;
    private String password;
    private Boolean active ;
    private String userType;
    private Long clientId;

	public UserDto(String name, String email, String password, Boolean active, String userType, Long clientId) {
		this.name = name;
		this.email = email;
		this.password = password;
		this.active = active;
		this.userType = userType;
		this.clientId = clientId;
	}

	public UserDto() {
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public Long getClientId() {
		return clientId;
	}

	public void setClientId(Long clientId) {
		this.clientId = clientId;
	}
}
