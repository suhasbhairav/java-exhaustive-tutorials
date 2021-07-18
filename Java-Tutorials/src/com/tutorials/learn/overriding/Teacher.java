package com.tutorials.learn.overriding;

public class Teacher {
	
	private String name;
	private int age;
	private String address;
	
	public Teacher(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public String getDetails() {
		return this.name + " ; " + String.valueOf(age) + " ; " + this.address;
	}

}
