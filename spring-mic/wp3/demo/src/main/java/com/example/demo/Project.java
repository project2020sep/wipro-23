package com.example.demo;

import java.util.Date;

import org.springframework.stereotype.Component;
@Component
public class Project {
	int projectid;
	String pname;
	Date start;
	Date end;
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Project(int projectid, String pname, Date start, Date end) {
		super();
		this.projectid = projectid;
		this.pname = pname;
		this.start = start;
		this.end = end;
	}
	public int getProjectid() {
		return projectid;
	}
	public void setProjectid(int projectid) {
		this.projectid = projectid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Date getStart() {
		return start;
	}
	public void setStart(Date start) {
		this.start = start;
	}
	public Date getEnd() {
		return end;
	}
	public void setEnd(Date end) {
		this.end = end;
	}
	
	  @Override public String toString() { return "Project [projectid=" + projectid
	  + ", pname=" + pname + ", start=" + start + ", end=" + end + "]"; }
	 
	
}
