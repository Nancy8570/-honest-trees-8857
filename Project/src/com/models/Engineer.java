package com.models;

public class Engineer {
	private int engineerId;
	private String name;
	private String department;
	private int email;
	private int password;
	public Engineer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Engineer(int engineerId, String name, String department, int email, int password) {
		super();
		this.engineerId = engineerId;
		this.name = name;
		this.department = department;
		this.email = email;
		this.password = password;
	}
	public int getEngineerId() {
		return engineerId;
	}
	public void setEngineerId(int engineerId) {
		this.engineerId = engineerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getEmail() {
		return email;
	}
	public void setEmail(int email) {
		this.email = email;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Engineer [engineerId=" + engineerId + ", name=" + name + ", department=" + department + ", email="
				+ email + ", password=" + password + "]";
	}
	
	
	
	
	

}
