package com.java.springrest.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.springrest.entity.UserRegi;

public interface UserService extends JpaRepository<UserRegi, Integer> {
	
		

}
