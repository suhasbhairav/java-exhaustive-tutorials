package com.tutorials.learn.encapsulation;

public class Manager extends Employee {
	
	private String deptName;

	public Manager(int empId, String name, String ssn, double salary, String deptName) {
		super(empId, name, ssn, salary);
		this.deptName = deptName;
	}
	
	public void changeDepartment(String newDeptName) {
		if(newDeptName != null) {
			this.deptName = newDeptName;
		}
	}

}
