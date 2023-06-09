package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

import com.example.demo.repository.UserRepository;

public class UserServiceImpl {
    @Autowired
	UserRepository userRepository;
    
    User getUser(User user) {
    	return userRepository.getById(user.getName());
    }
}
