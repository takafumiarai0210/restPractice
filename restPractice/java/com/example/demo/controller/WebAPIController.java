package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;

@RestController
@RequestMapping("api")
public class WebAPIController {
	
	@RequestMapping("hello")
	private String hello() {
		return "SpringBoot!";
	}
	
//	@RequestMapping("user")
//	private User getUser() {
//		return new User("takafumi", 29);
//	}
	
	@RequestMapping("error")
	public String testException() throws Exception{
		throw new RuntimeException("Errorî≠ê∂");
	}
	
	@ExceptionHandler
	private ResponseEntity<String> onError( Exception ex ) {
		
		HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;

		return new ResponseEntity<String>("{'a':'aaa'}", status );
		
	}
	

}
