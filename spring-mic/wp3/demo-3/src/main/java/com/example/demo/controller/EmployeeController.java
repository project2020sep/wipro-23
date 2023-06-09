package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/emp")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping("/hello")
	public String hello() {
		
		return "hello";
	}

	@RequestMapping("/getall")
	List<Employee> getAll(){
		
		List<Employee> emplist = employeeService.getEmployees();
		return emplist;
	}
	
	@RequestMapping("/addemp")
	Employee addEmp(@RequestParam int eid,@RequestParam String ename,@RequestParam String city,@RequestParam int ph) {
		Employee empreq = new Employee(eid,ename,ph,city);
		Employee empres= employeeService.addEmployee(empreq);
		return empres;
	}
	
	@RequestMapping("/getbyid/{id}")
	Optional<Employee> getEmpById(@PathVariable int id){
		Optional<Employee> e = employeeService.getEmployeeById(id);
		return e;
	}
	
	@RequestMapping("/getbyname/{id}")
	Optional<Employee> getEmpById(@PathVariable String name){
		Optional<Employee> e = employeeService.getEmployeeByName(name);
		return e;
	}
	
}
