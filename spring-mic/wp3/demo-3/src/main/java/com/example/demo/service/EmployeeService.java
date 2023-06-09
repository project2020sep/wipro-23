package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Employee;

public interface EmployeeService {

	List<Employee> getEmployees();
	Employee addEmployee(Employee a);
	Optional<Employee> getEmployeeById(int id);
	Optional<Employee> getEmployeeByName(String name);
}