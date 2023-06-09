package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Department;
import com.example.demo.repository.DepartmentRepository;
@Service
public class DepartmentServiceImpl implements DepartmentService{
	
	@Autowired
	DepartmentRepository departmentRepository;

	@Override
	public List<Department> getDepartments() {
		List<Department> dlist = departmentRepository.findAll();
		return dlist;
	}

	@Override
	public Department addDepartment(Department a) {
		Department d =departmentRepository.save(a);
		return d;
	}

	@Override
	public Optional<Department> getDepartmentById(int id) {
		Optional<Department> dep = departmentRepository.findById(id);
		return dep;
	}

	@Override
	public Optional<Department> getDepartmentByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
