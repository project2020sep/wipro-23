package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.dao.Employeedao;
import com.example.demo.model.Employees;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class} )
public class DemoHibApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoHibApplication.class, args);
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		Employeedao dao = (Employeedao) ctx.getBean("employeedao");
		
		List<Employees> elist = (List<Employees>) dao.loadEmployees();
		System.out.println(elist);
	}

}
