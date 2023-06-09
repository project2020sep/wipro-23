package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.*;
@Table(name ="employee5")
@Entity
public class Employee implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int empid;
	String ename;
	int phone;
	String city;
	
	@OneToOne(cascade = javax.persistence.CascadeType.ALL)
	@JoinColumn(name = "deptid")
	Department deptmt;

	

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int empid, String ename, int phone, String city) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.phone = phone;
		this.city = city;
		
	}
	
	

	public Employee(int empid, String ename, int phone, String city, Department deptmt) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.phone = phone;
		this.city = city;
		this.deptmt = deptmt;
	}

	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public Department getDeptmt() {
		return deptmt;
	}

	public void setDeptmt(Department deptmt) {
		this.deptmt = deptmt;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", phone=" + phone + ", city=" + city + ", deptmt="
				+ deptmt + "]";
	}

	
 
	

}
