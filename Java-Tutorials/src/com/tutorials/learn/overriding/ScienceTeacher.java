package com.tutorials.learn.overriding;

public class ScienceTeacher extends Teacher {
	
	private String subject;
	
	public ScienceTeacher(String name, int age, String address, String subject) {
		super(name, age, address);
	
		this.subject = subject;
	}
	
	@Override
	public String getDetails() {
		return super.getDetails() + " ; science = "+ this.subject;
	}
	
	public static void main(String[] args) {
		Teacher t = new Teacher("Elon", 50, "London");
		System.out.println(t.getDetails());
		
		Teacher p = new Principal("Musk", 45, "New York", "Elite");
		System.out.println(p.getDetails());
		
		Teacher s = new ScienceTeacher("XAE012", 35, "Paris", "General Science");
		System.out.println(s.getDetails());
	}

}
