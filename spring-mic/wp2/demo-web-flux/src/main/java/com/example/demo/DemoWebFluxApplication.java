package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.demo.dto.Employee;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@SpringBootApplication
public class DemoWebFluxApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoWebFluxApplication.class, args);
		
		WebClient client = WebClient.create("https://example.org");

		Mono<ResponseEntity<Employee>> result = client.get()
				.uri("/getallflux/{id}",1).accept(MediaType.APPLICATION_JSON)
				.retrieve()
				.toEntity(Employee.class);
		
	}

}
