package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.example.demo.dao.Employeedao;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class} )
public class Demo1Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
		System.out.println("hello");
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		Employeedao dao = (Employeedao) ctx.getBean("employeedao");
		
		dao.show();
	}

}
