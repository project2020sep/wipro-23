package com.example.demo.service;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

public interface UserService {
	 User getUser(User user);
}
