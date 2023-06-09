package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService userService;
	
	 @GetMapping("/login")
	 String validateUser(User user) {
		 return userService.getUser(user);
	    	
	    }
	
    @RequestMapping("/hello")
	public String hello() {
		return "hello";
	}
    
   
}
