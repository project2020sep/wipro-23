package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Department;

import com.example.demo.service.DepartmentService;
@RestController
@RequestMapping(value = "/dept")
public class DepartmentController {
	
	@Autowired
	DepartmentService departmentService;
	
	@GetMapping("/hello")
	public String hello() {
		
		return "hello";
	}

	@GetMapping("/getall")
	List<Department> getAll(){
		
		List<Department> deplist = departmentService.getDepartments();
		return deplist;
	}
	
	@PostMapping("/adddep")
	Department addDep(@RequestParam int deptid,@RequestParam String dname,@RequestParam String dcity) {
		Department depreq = new Department(deptid,dname,dcity);
		Department depres= departmentService.addDepartment(depreq);
		return depres;
	}
	
	@PostMapping("/adddepobj")
	Department addDep(@RequestBody Department d) {
		
		Department depres= departmentService.addDepartment(d);
		return depres;
	}
	
	@PutMapping("/updatedepobj")
	Department updateEmp(@RequestBody Department d) {
		
		Department depres= departmentService.updateDepartment(d);
		return depres;
	}
	
	@GetMapping("/getbyid/{id}")
	Optional<Department> getDeptById(@PathVariable int id){
		Optional<Department> e = departmentService.getDepartmentById(id);
		return e;
	}
	
	@GetMapping("/getbyname/{id}")
	Optional<Department> getDeptById(@PathVariable String name){
		Optional<Department> d = departmentService.getDepartmentByName(name);
		return d;
	}
	
	@DeleteMapping("/deletedepobj/{id}")
	void deleteDep(@PathVariable int id) {
		
		departmentService.deletedep(id);
		
	}

}
