package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.dto.Employee;

import reactor.core.publisher.Flux;
@Service
public class EmployeeService {
    @Autowired
    EmployeeDao employeeDao;

    public List<Employee> loadEmployee(){
    	 long start = System.currentTimeMillis();
    	List<Employee> elist = employeeDao.getEmployee();
    	long end = System.currentTimeMillis();
        System.out.println("Total execution time : " + (end - start));
    	return elist;
    }
    
    public Flux<Employee> loadAllEmp(){
    	long start = System.currentTimeMillis();
    	Flux<Employee> emp = employeeDao.getEmployees();
    	long end = System.currentTimeMillis();
        System.out.println("Total execution time : " + (end - start));
    	return emp;
    	
    }
}
