package com.example.demo.model;

import java.io.Serializable;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Table(name ="dept5")
@Entity
public class Department implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int deptid;
	String dname;
	String dcity;
	@OneToOne(mappedBy = "deptmt", cascade = CascadeType.ALL)
	Employee emp;
	
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Department(int deptid) {
		super();
		this.deptid = deptid;
	}

	public Department(int deptid, String dname, String dcity) {
		super();
		this.deptid = deptid;
		this.dname = dname;
		this.dcity = dcity;
	}
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getDcity() {
		return dcity;
	}
	public void setDcity(String dcity) {
		this.dcity = dcity;
	}
	@Override
	public String toString() {
		return "Department [deptid=" + deptid + ", dname=" + dname + ", dcity=" + dcity + "]";
	}
	

}
