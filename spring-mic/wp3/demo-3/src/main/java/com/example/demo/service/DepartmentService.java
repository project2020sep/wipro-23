package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Department;

public interface DepartmentService {


	List<Department> getDepartments();
	Department addDepartment(Department a);
	Optional<Department> getDepartmentById(int id);
	Optional<Department> getDepartmentByName(String name);
}
