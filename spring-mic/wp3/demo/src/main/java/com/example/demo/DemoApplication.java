package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{
	
	@Autowired
	Project p1;
	
	

	public static void main(String[] args){
		
			
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("hello");
		
		
		/*
		 * ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		 * 
		 * Employee e3 = (Employee) ctx.getBean("emp3"); //setter based injection
		 * System.out.println(e3);
		 */
	}
		
		
		@Override
		public void run(String... args) throws Exception {
			// TODO Auto-generated method stub
			
			System.out.println(p1);
			p1.setProjectid(0);
			p1.setPname(null);
			
		}
		
		
		
	}


