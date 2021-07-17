package com.tutorials.learn.encapsulation;

import java.util.List;

public class Teacher {

	private int teacherId;
	private String name;
	private List<Integer> classes;
	private String address;
	
	public Teacher(int teacherId, String name, List<Integer> classes, String address) {
		this.teacherId = teacherId;
		this.name = name;
		this.classes = classes;
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
	
	public void changeClasses(List<Integer> newClasses) {
		if(newClasses.size() > 0) {
			this.classes = newClasses;
		}
	}
	
}
