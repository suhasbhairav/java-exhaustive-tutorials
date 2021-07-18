package com.tutorials.learn.overriding;

public class Principal extends Teacher {
	
	private String school;
	
	public Principal(String name, int age, String address, String school) {
		super(name, age, address);
		
		this.school = school;
	}
	
	@Override
	public String getDetails() {
		return super.getDetails() + " ; principl = "+ this.school;
	}

}
