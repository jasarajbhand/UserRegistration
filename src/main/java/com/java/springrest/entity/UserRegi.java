package com.java.springrest.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "USER_REGISTRATION")

public class UserRegi {
	
	@Id
	private Integer userId;
	private String userFirstName;
	private String userLastName;
	private Integer userAge;
	private String userEmail;
	private String userGender;
	private String userAddress;
	private Long userMobileNo;
	private String userPassword;
	private String userConfirmpassword;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserFirstName() {
		return userFirstName;
	}
	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}
	public String getUserLastName() {
		return userLastName;
	}
	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}
	public Integer getUserAge() {
		return userAge;
	}
	public void setUserAge(Integer userAge) {
		this.userAge = userAge;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserGender() {
		return userGender;
	}
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public Long getUserMobileNo() {
		return userMobileNo;
	}
	public void setUserMobileNo(Long userMobileNo) {
		this.userMobileNo = userMobileNo;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserConfirmpassword() {
		return userConfirmpassword;
	}
	public void setUserConfirmpassword(String userConfirmpassword) {
		this.userConfirmpassword = userConfirmpassword;
	}
	@Override
	public String toString() {
		return "UserRegi [userId=" + userId + ", userFirstName=" + userFirstName + ", userLastName=" + userLastName
				+ ", userAge=" + userAge + ", userEmail=" + userEmail + ", userGender=" + userGender + ", userAddress="
				+ userAddress + ", userMobileNo=" + userMobileNo + ", userPassword=" + userPassword
				+ ", userConfirmpassword=" + userConfirmpassword + "]";
	}
	public UserRegi(Integer userId, String userFirstName, String userLastName, Integer userAge, String userEmail,
			String userGender, String userAddress, Long userMobileNo, String userPassword, String userConfirmpassword) {
		super();
		this.userId = userId;
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		this.userAge = userAge;
		this.userEmail = userEmail;
		this.userGender = userGender;
		this.userAddress = userAddress;
		this.userMobileNo = userMobileNo;
		this.userPassword = userPassword;
		this.userConfirmpassword = userConfirmpassword;
	}
	public UserRegi() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	

}
