package com.example.demo;

public class Department {
	int deptid;
	String deptname;
	String loc;
	
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(int deptid, String deptname, String loc) {
		super();
		this.deptid = deptid;
		this.deptname = deptname;
		this.loc = loc;
	}

	public int getDeptid() {
		return deptid;
	}

	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	@Override
	public String toString() {
		return "Department [deptid=" + deptid + ", deptname=" + deptname + ", loc=" + loc + "]";
	}
	
	
	
	

}
