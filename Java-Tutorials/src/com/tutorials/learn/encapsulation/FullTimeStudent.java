package com.tutorials.learn.encapsulation;

import java.util.Date;
import java.util.List;

public class FullTimeStudent extends Student {
	
	private List<String> subjects;
	private List<String> sports;

	public FullTimeStudent(int studId, String name, Date dob, String address, List<String> subjects, List<String> sports) {
		super(studId, name, dob, address);
		
		this.subjects = subjects;
		this.sports = sports;
		
	}
	
	public void changeSubjects(List<String> newSubjects) {
		if(newSubjects != null && newSubjects.size() > 0) {
			this.subjects = newSubjects;
		}
	}
	
	public void changeSports(List<String> newSports) {
		if(newSports != null && newSports.size() > 0) {
			this.sports = newSports;
		}
	}

}
