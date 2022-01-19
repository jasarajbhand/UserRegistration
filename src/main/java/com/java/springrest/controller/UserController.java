package com.java.springrest.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.java.springrest.entity.UserLogin;
import com.java.springrest.entity.UserRegi;
import com.java.springrest.service.UserService;

@RestController
public class UserController {
	
	//@Autowired
	//UserLogin login;
	@Autowired
	UserService userservice;
	
	
	
	@GetMapping("/")
	public String home() {
		
		return "Welcome to User Registration Home page";
	}
	
	@PostMapping("/add")
	public String addUser(@RequestBody UserRegi user) {
		userservice.save(user);
		return "User record save successfully";
		
	}
	/*@PostMapping("/login")
	public String userLogin(@RequestBody UserLogin userlogin) {
		
		if(userlogin!=null) {
			List<UserRegi> userList = new ArrayList<UserRegi>( userservice.findAll());
			for(UserRegi user1:userList) {
				
				boolean result = (user1.getUserFirstName() == userlogin.getUserName() && user1.getUserPassword()==userlogin.getUserPassword());
				if(result == true)
					return "User Authentication successfull";
				break;
			}
			
		} return "Invalid creditential";
		
	}*/
	
	@GetMapping("/{userId}")
	public UserRegi searchUser(@PathVariable("userId") int userId) {
		Optional<UserRegi> userRecord =  userservice.findById(userId);
		return userRecord.orElseGet(null);
	}
	
	@PutMapping("/{userId}")
	public UserRegi updateUser(@PathVariable("userId") int userId,@RequestBody UserRegi user) {
		Optional<UserRegi> userDetail = userservice.findById(userId);
		if (userDetail.isPresent()) {
			UserRegi user1 = new UserRegi();
			user1.setUserId(user.getUserId());
			user1.setUserFirstName(user.getUserFirstName());
			user1.setUserLastName(user.getUserLastName());
			user1.setUserAge(user.getUserAge());
			user1.setUserGender(user.getUserGender());
			user1.setUserAddress(user.getUserAddress());
			user1.setUserMobileNo(user.getUserMobileNo());
			user1.setUserPassword(user.getUserPassword());
			user1.setUserConfirmpassword(user.getUserConfirmpassword());
			userservice.save(user1);
			return user1;
	}
		 return null;
		
	}
	
	@DeleteMapping("/{userId}")
	public String deleteUser(@PathVariable("userId") int userId) {
		userservice.deleteById(userId);
		return "successfully deleted";
	}
	
	@GetMapping("/getAll")
	public List<UserRegi> getAllUser(){
		return userservice.findAll();
	}
	
	@PutMapping("/changepassword/{userId}")
	public String ChangePassword(@RequestBody String userPassword,@PathVariable("userId") int userId) {
		
		
		Optional<UserRegi> userdb = userservice.findById(userId);
		UserRegi user3 = userservice.getById(userId);
		if (userdb.isPresent()) {
			UserRegi user2 = new UserRegi();
			user2.setUserId(user3.getUserId());
			user2.setUserFirstName(user3.getUserFirstName());
			user2.setUserLastName(user3.getUserLastName());
			user2.setUserAge(user3.getUserAge());
			user2.setUserGender(user3.getUserGender());
			user2.setUserAddress(user3.getUserAddress());
			user2.setUserMobileNo(user3.getUserMobileNo());
			user2.setUserPassword(userPassword);
			user2.setUserConfirmpassword(userPassword);
			userservice.save(user2);
			return "password changed successfully";
	}
		 return null;
		
	}

}
