package com.tutorials.learn.overriding;

public class Manager extends Employee {
	
	private String deptName;
	
	public Manager(String name, int empId, String address, String deptName) {
		super(name, empId, address);
		
		this.deptName = deptName;
	}
	
	@Override
	public String getDetails() {
		return super.getDetails() + " ; " + this.deptName;
	}

}
