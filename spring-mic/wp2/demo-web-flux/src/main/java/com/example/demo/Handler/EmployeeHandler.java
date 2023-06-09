package com.example.demo.Handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.dto.Employee;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@Service
public class EmployeeHandler {
	
	@Autowired
	private EmployeeDao employeeDao;

	public Mono<ServerResponse> getEmployeeList(ServerRequest request) {
		Flux<Employee> estream = employeeDao.getEmployees();
		return ServerResponse.ok()
				.contentType(MediaType.TEXT_EVENT_STREAM)
				.body(estream,Employee.class);
	}
}
