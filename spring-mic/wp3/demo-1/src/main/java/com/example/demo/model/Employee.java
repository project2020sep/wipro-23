package com.example.demo.model;



public class Employee {
	
	int empid;
	String ename;
	int phone;
	String city;
	

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
	
	

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", phone=" + phone + ", city=" + city + "]";
	}
 
	

}
