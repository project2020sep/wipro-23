package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Employee;
import com.example.demo.service.EmployeeService;

import reactor.core.publisher.Flux;

@RestController
public class EmployeeController {
    @Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/getalllist")
    public List<Employee> getAll(){
		
		return employeeService.loadEmployee();
	}
	@GetMapping("/getallflux")
	public Flux<Employee> getAllEmp(){
		
		return employeeService.loadAllEmp();
	}
}
