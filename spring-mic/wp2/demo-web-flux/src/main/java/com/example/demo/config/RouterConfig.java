package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.example.demo.Handler.EmployeeHandler;
@Configuration
public class RouterConfig {
	@Autowired
	EmployeeHandler employeeHandler;
	
	@Bean
	public RouterFunction<ServerResponse> routerFunction(){
		
		return RouterFunctions.route()
				.GET("/router/employees", employeeHandler::getEmployeeList)
				.build();
	}
	
	
	
}
