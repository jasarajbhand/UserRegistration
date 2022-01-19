package com.java.springrest.service;

import org.springframework.data.jpa.repository.JpaRepository;


import com.java.springrest.entity.UserLogin;


public interface UserLoginService extends JpaRepository<UserLogin, Integer> {
	

}
