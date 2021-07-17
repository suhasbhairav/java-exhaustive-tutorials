package com.tutorials.learn.encapsulation;

import java.util.List;

public class FullTimeTeacher extends Teacher {
	
	private double teachingHours;

	public FullTimeTeacher(int teacherId, String name, List<Integer> classes, String address, double teachingHours) {
		super(teacherId, name, classes, address);
		this.teachingHours = teachingHours;
	}
	
	public void changeTeachingHours(double newTeachingHours) {
		if(newTeachingHours > 20) {
			this.teachingHours = newTeachingHours;
		}
	}

}
