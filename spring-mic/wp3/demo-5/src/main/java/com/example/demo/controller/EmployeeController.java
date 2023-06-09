package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;
@RestController
@RequestMapping(value = "/emp")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/hello")
	public String hello() {
		
		return "hello";
	}

	@GetMapping("/getall")
	List<Employee> getAll(){
		
		List<Employee> emplist = employeeService.getEmployees();
		return emplist;
	}
	
	@PostMapping("/addemp")
	Employee addEmp(@RequestParam int eid,@RequestParam String ename,@RequestParam String city,@RequestParam int ph) {
		Employee empreq = new Employee(eid,ename,ph,city);
		Employee empres= employeeService.addEmployee(empreq);
		return empres;
	}
	
	@PostMapping("/addempobj")
	Employee addEmp(@RequestBody Employee e) {
		
		Employee empres= employeeService.addEmployee(e);
		return empres;
	}
	
	@PutMapping("/updateempobj")
	Employee updateEmp(@RequestBody Employee e) {
		
		Employee empres= employeeService.updateEmployee(e);
		return empres;
	}
	
	@GetMapping("/getbyid/{id}")
	Optional<Employee> getEmpById(@PathVariable int id){
		Optional<Employee> e = employeeService.getEmployeeById(id);
		return e;
	}
	
	@GetMapping("/getbyname/{id}")
	Optional<Employee> getEmpById(@PathVariable String name){
		Optional<Employee> e = employeeService.getEmployeeByName(name);
		return e;
	}
	
}
