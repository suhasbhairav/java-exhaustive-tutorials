package com.tutorials.learn.encapsulation;

import java.util.Date;

public class Student {
	
	private int studId;
	private String name;
	private Date dob;
	private String address;
	
	public Student(int studId, String name, Date dob, String address) {
		this.studId = studId;
		this.name = name;
		this.dob = dob;
		this.address = address;
	}
	
	public void changeName(String newName) {
		if(newName != null) {
			this.name = newName;
		}
	}
	
	public void changeAddress(String newAddress) {
		if(newAddress != null) {
			this.address = newAddress;
		}
	}

}
