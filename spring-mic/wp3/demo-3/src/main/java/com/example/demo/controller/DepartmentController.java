package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.Department;
import com.example.demo.service.DepartmentService;
@Controller
@ResponseBody
@RequestMapping("/dept")
public class DepartmentController {
	
	@Autowired
	DepartmentService DepartmentService;
	
	@RequestMapping("/hello")
	public String hello() {
		
		return "hello";
	}

	@RequestMapping("/getall")
	List<Department> getAll(){
		
		List<Department> deplist = DepartmentService.getDepartments();
		return deplist;
	}
	
	@RequestMapping("/adddep")
	Department addEmp(@RequestParam int deptid,@RequestParam String dname,@RequestParam String dcity) {
		Department depreq = new Department(deptid,dname,dcity);
		Department depres= DepartmentService.addDepartment(depreq);
		return depres;
	}
	
	@RequestMapping("/getbyid/{id}")
	Optional<Department> getDeptById(@PathVariable int id){
		Optional<Department> e = DepartmentService.getDepartmentById(id);
		return e;
	}
	
	@RequestMapping("/getbyname/{id}")
	Optional<Department> getDeptById(@PathVariable String name){
		Optional<Department> d = DepartmentService.getDepartmentByName(name);
		return d;
	}

}
