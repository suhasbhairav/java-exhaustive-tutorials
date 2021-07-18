package com.tutorials.learn.cast.object;

public class Manager extends Employee {
	private String dept;

	public Manager(String name, String address, String dept) {
		super(name, address);
		
		this.dept = dept;
	}
	
	@Override
	public String toString() {
		return super.toString() + " ; dept = "+ this.dept;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public static void main(String[] args) {
		Employee m = new Manager("Elon", "London", "Logistics");
		
		System.out.println(m.toString());
		
		if(m instanceof Manager) {
			Manager q = (Manager) m;
			q.setDept("Truck");
			
			System.out.println(q.toString());
		}
	}

}
