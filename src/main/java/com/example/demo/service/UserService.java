package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.User;
import com.example.demo.Repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
	
	private final UserRepository userRepository;
	
	
	public void createUser(User user) {
		User setuser=new User();
		setuser.setUserName(user.getUserName());
		setuser.setPassword(user.getPassword());
		userRepository.save(setuser);
		
		
	}
	

}
