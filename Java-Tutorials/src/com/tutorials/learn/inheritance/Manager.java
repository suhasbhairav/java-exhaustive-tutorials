package com.tutorials.learn.inheritance;

public class Manager extends Employee {
	
	private String officeLocation;

	public Manager(String name, int id, String dept, String officeLocation) {
		super(name, id, dept);
		
		this.officeLocation = officeLocation;		
	}

}
