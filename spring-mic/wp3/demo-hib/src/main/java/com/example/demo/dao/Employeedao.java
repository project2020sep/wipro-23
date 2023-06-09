package com.example.demo.dao;

import java.util.Collection;

import javax.sql.DataSource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.jdbc.core.JdbcTemplate;

public class Employeedao {
	
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
		
	}

	public Collection loadEmployees() {
		return this.sessionFactory.openSession()
				   .createSelectionQuery("from Employees")
				   .list();
				
	}
}