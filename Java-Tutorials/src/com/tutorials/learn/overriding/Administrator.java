package com.tutorials.learn.overriding;

public class Administrator extends Employee{
	
	private String headOffice;

	public Administrator(String name, int empId, String address, String headOffice) {
		super(name, empId, address);
		
		this.headOffice = headOffice;
	}
	
	@Override
	public String getDetails() {
		return super.getDetails() + " ; admin = " + headOffice;
	}

}
