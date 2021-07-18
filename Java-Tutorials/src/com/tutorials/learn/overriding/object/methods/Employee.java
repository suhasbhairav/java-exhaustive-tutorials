package com.tutorials.learn.overriding.object.methods;

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
