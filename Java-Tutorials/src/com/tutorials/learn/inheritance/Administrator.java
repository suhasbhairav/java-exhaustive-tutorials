package com.tutorials.learn.inheritance;

public class Administrator extends Employee {
	
	private String headOfficeAddress;

	public Administrator(String name, int id, String dept, String headOfficeAddress) {
		super(name, id, dept);
		
		this.headOfficeAddress = headOfficeAddress;
	}
	
	public void changeOfAddress(String newAddress) {
		if(newAddress != null) {
			this.headOfficeAddress = newAddress;
		}
	}

}
