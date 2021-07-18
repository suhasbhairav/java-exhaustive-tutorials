package com.tutorials.learn.cast.object;

public class Employee {
	
	private String name;
	private String address;
	
	public Employee(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	@Override
	public String toString() {
		return this.name + " ; " + this.address;
	}

}
