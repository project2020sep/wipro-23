package com.example.demo.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;
import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeRepository employeeRepository;

	public List<Employee> getEmployees() {
		List<Employee> elist = employeeRepository.findAll();
		return elist;
	}

	
	public Employee addEmployee(Employee a) {
		Employee emp = employeeRepository.save(a);
		return emp;
	}


	@Override
	public Optional<Employee> getEmployeeById(int id) {
		Optional<Employee> emp = employeeRepository.findById(id);
		return emp;
	}


	@Override
	public Optional<Employee> getEmployeeByName(String name) {
		// TODO Auto-generated method stub
		
		return null;
	}


	@Override
	public Employee updateEmployee(Employee e) {
		employeeRepository.save(e);
		return e;
	}

}
