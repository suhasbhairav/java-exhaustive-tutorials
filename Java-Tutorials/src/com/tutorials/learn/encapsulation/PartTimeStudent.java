package com.tutorials.learn.encapsulation;

import java.util.Date;
import java.util.List;

public class PartTimeStudent extends Student {
	private List<String> subjects;

	public PartTimeStudent(int studId, String name, Date dob, String address, List<String> subjects) {
		super(studId, name, dob, address);
		
		this.subjects = subjects;
	}
	
	public void changeSubjects(List<String> newSubjects) {
		if(newSubjects.size() > 0) {
			this.subjects = newSubjects;
		}
	}

}
