package com.tutorials.learn.overriding;

public class Employee {

	private String name;
	private int empId;
	private String address;
	
	public Employee(String name, int empId, String address) {
		this.name = name;
		this.empId = empId;
		this.address = address;
	}
	
	public String getDetails() {
		return this.name + " ; " + String.valueOf(this.empId) + " ; " + this.address;
	}
	
}
