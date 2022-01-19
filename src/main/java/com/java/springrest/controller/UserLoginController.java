package com.java.springrest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.springrest.entity.UserLogin;
import com.java.springrest.entity.UserRegi;
import com.java.springrest.service.UserLoginService;
import com.java.springrest.service.UserService;
@RestController
public class UserLoginController {
	
	@Autowired
	UserLoginService loginservice;
	
	@Autowired
	UserService service;
	
	@PostMapping("/login")
	public String getLogin(@RequestBody UserLogin login) {
		loginservice.save(login);
		String result = null;
		List<UserRegi> userList = new ArrayList<UserRegi>( service.findAll());
		for(UserRegi user1:userList) {		
		if(user1.getUserFirstName().equals(login.getUserName()) & user1.getUserPassword().equals(login.getUserPassword()))
			result =  "User Authentication successfull";
		else 
			result =  "Invalid creditential";
			}
			
		
			
		return result; 
		
	}

}
