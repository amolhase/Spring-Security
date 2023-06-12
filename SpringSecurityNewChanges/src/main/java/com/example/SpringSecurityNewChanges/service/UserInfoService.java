package com.example.SpringSecurityNewChanges.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.SpringSecurityNewChanges.entities.UserInfo;
import com.example.SpringSecurityNewChanges.repository.UserInfoRepository;

@Service
public class UserInfoService {
	
	@Autowired
	private UserInfoRepository repo;
	
	@Autowired
	private PasswordEncoder encoder;
	
	public UserInfo addUser(UserInfo user) {
		user.setPassword(encoder.encode(user.getPassword()));
		return repo.save(user);
	}

}
