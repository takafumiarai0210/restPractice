package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserDeleteService {
	
	public UserDeleteService() {
		super();
	}
	
	@Autowired
	private UserRepository userRepository;
	
	public void userDelete(int id) {
	    userRepository.deleteById(id);
	}
}
