package com.tutorials.learn.encapsulation;

public class DeputyManager extends Employee {
	
	private String projectName;
	
	public DeputyManager(int empId, 
			String name, 
			String ssn, 
			double salary, 
			String projectName) {
		super(empId, name, ssn, salary);
		this.projectName = projectName;
	}

	
	public void changeProject(String newProjectName) {
		if(newProjectName != null) {
			this.projectName = newProjectName;
		}
	}

}
