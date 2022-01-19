package com.java.springrest.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "LOGIN_DETAIL")
public class UserLogin {
	
	@Id
	@GeneratedValue
	private int userId;
	private String userName;
	private String userPassword;
	
	public UserLogin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public UserLogin(String userName, String userPassword) {
		super();
		this.userName = userName;
		this.userPassword = userPassword;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	@Override
	public String toString() {
		return "UserLogin [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword + "]";
	}
	
	
	

}
