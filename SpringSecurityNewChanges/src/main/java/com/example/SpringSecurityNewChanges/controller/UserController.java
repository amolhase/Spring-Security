package com.example.SpringSecurityNewChanges.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringSecurityNewChanges.entities.UserInfo;
import com.example.SpringSecurityNewChanges.service.UserInfoService;

@RestController
public class UserController {
	
	@Autowired
	private UserInfoService service;
	
	@PostMapping("/addUser")
	public UserInfo addUser(@RequestBody UserInfo user) {
		return service.addUser(user);
	}

}
