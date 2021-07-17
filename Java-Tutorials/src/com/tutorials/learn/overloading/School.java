package com.tutorials.learn.overloading;

public class School {
	
	private String principal;
	private String teacher;
	private int teacherCount;
	private String students;
	private int studentCount;
	
	public School() {
		
	}
	
	public void print(String teacherOrStudent) {
		System.out.println(teacherOrStudent);
	}
	
	public void print(int teacherOrStudentCount) {
		System.out.println(teacherOrStudentCount);
	}

}
