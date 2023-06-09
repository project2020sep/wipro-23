package com.example.demo.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
	@OneToMany (cascade = CascadeType.ALL)
	private List<Employee> emp = new ArrayList<Employee>(); 
	
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
		  this.deptid = deptid; this.dname = dname; this.dcity = dcity; 
	  }
	 
	
	
	
	public int getDeptid() {
		return deptid;
	}
	public Department(int deptid, String dname, String dcity, List<Employee> emp) {
		super();
		this.deptid = deptid;
		this.dname = dname;
		this.dcity = dcity;
		this.emp = emp;
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
	
	

	public Department(int deptid, List<Employee> emp) {
		super();
		this.deptid = deptid;
		this.emp = emp;
	}

	public List<Employee> getEmp() {
		return emp;
	}

	public void setEmp(List<Employee> emp) {
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "Department [deptid=" + deptid + ", dname=" + dname + ", dcity=" + dcity +  "]";
	}
	

}
