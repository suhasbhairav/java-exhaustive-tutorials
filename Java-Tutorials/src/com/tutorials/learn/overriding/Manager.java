package com.tutorials.learn.overriding;

public class Manager extends Employee {
	
	private String deptName;
	
	public Manager(String name, int empId, String address, String deptName) {
		super(name, empId, address);
		
		this.deptName = deptName;
	}
	
	@Override
	public String getDetails() {
		return super.getDetails() + " ; manager = " + this.deptName;
	}
	
	public static void main(String[] args) {
		Employee e = new Employee("Suhas", 10, "London");
		System.out.println(e.getDetails());
		
		Employee m = new Manager("Ajay", 20, "London", "Street");
		System.out.println(m.getDetails());
		
		Employee admin = new Administrator("Raj", 30, "London", "Awesome");
		System.out.println(admin.getDetails());
	}

}
