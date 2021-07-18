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
	
	@Override
	public boolean equals(Object o) {
		boolean res = false;
		if(o != null && o instanceof Employee) {
			if(o.toString().contains("a")) {
				res = true;
			}
		}
		
		return res;
	}
}
