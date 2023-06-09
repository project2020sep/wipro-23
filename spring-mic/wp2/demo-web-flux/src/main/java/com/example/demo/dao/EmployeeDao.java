package com.example.demo.dao;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.stereotype.Component;

import com.example.demo.dto.Employee;

import reactor.core.publisher.Flux;
@Component
public class EmployeeDao {

	public Flux<Employee> getEmployees(){
		
			return Flux.range(1,50)
					.doOnNext(i -> System.out.println("count = " +i))
					.map(i -> new Employee(i, "Employee:" +i));
		
	}
	
	public List<Employee> getEmployee(){
		
		return IntStream.rangeClosed(1, 50)
						.peek( i -> System.out.println("count : " +i))
						.mapToObj(i -> new Employee(i, "Employee :" +i))
						.collect(Collectors.toList());
	}
	
}
