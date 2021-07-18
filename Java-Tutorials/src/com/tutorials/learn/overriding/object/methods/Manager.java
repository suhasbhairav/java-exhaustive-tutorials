package com.tutorials.learn.overriding.object.methods;

public class Manager extends Employee{
	
	private String dept;
	
	public Manager(String name, String address, String dept) {
		super(name, address);
		this.dept = dept;
	}
	
	@Override
	public String toString() {
		return super.toString() + "; dept = " + this.dept;
	}
	
	public static void main(String[] args) {
		Employee e = new Employee("Elon", "London");
		System.out.println(e.toString());
		
		Employee m = new Manager("Musk", "London", "Logistics");
		System.out.println(m.toString());
	}

}
