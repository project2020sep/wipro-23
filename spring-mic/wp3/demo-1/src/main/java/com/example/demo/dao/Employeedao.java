package com.example.demo.dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class Employeedao {
	
	JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
		
	
public void show(){
	System.out.println(jdbcTemplate.getDataSource());
}






	

}
