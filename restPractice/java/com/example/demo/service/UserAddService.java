package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserAddService {
	
	public UserAddService() {
		super();
	}
	
	@Autowired
	private UserRepository userRepository;
	
	public void userAdd(User user) {	
	    userRepository.save(user);
	}
}
