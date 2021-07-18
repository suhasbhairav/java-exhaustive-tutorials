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
	
	@Override
	public boolean equals(Object o) {
		boolean res = false;
		if(o != null && o instanceof Manager) {
			if(o.toString().contains("s")) {
				res = true;
			}
		}
		
		return res;
	}
	
	@Override
	public int hashCode() {
		return 20 * 20;
	}
	
	public static void main(String[] args) {
		Employee e = new Employee("Elon", "London");
		System.out.println(e.toString());
		
		Employee m = new Manager("Musk", "London", "Logistics");
		System.out.println(m.toString());
	}

}
