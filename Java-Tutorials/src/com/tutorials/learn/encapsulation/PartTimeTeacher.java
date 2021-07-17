package com.tutorials.learn.encapsulation;

import java.util.List;

public class PartTimeTeacher extends Teacher {
	
	private double teachingHours;

	public PartTimeTeacher(int teacherId, String name, List<Integer> classes, String address, double teachingHours) {
		super(teacherId, name, classes, address);
		
		this.teachingHours = teachingHours;
	}
	
	public void changeTeachingHours(double newTeachingHours) {
		if(newTeachingHours > 0 && newTeachingHours < 20) {
			this.teachingHours = newTeachingHours;
		}
	}

}
