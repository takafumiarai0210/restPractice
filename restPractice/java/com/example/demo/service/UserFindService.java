package com.example.demo.service;

import java.util.Optional;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserFindService {
	
	public UserFindService() {
		super();
	}

	@Autowired
	private UserRepository userRepository;
	
	public Optional<User> UserFindById(int id) {
		// ErrorèàóùÇÃLogicì¸ÇÍÇÈ
		return userRepository.findById(id);
	}
	
	public Iterable<User> UserFindAll() {
		return userRepository.findAll();
	}
			

}
