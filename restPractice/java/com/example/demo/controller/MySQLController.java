package com.example.demo.controller;

//import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.entity.User;
import com.example.demo.service.UserAddService;
import com.example.demo.service.UserDeleteService;
import com.example.demo.service.UserFindService;

@Controller // This means that this class is a Controller
@RequestMapping(path="/user") // This means URL's start with /demo (after Application path)
public class MySQLController {
  
  @Autowired
  private UserFindService userFindService;
  
  @Autowired
  private UserAddService userAddService;
  
  @Autowired
  private UserDeleteService userDeleteService;
  

  @PostMapping(path="/add")
  public @ResponseBody String addNewUser (@RequestBody User user) {
	userAddService.userAdd(user);
    return "Saved";
  }

  @GetMapping(path="/get/all")
  public @ResponseBody Iterable<User> getAllUsers() {
    return userFindService.UserFindAll();
  }
  
  
  @GetMapping(path="/get/{id}")
  public @ResponseBody Optional<User> getUserById( @PathVariable int id ) {
	  return userFindService.UserFindById(id);
  }
  
  @DeleteMapping(path="/delete/{id}")
  public @ResponseBody String deleteUserById( @PathVariable int id ) {
//	  return userDeleteService.userDelete(id);
	  userDeleteService.userDelete(id);
	  return "Deleted";
  }
  

  
}