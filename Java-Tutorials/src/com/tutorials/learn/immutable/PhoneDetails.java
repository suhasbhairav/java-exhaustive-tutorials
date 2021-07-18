package com.tutorials.learn.immutable;

public class PhoneDetails {
	
	private final String name;
	private final String number;
	
	public PhoneDetails(String name, String number) {
		this.name = name;
		this.number = number;
	}
	
	
	public String toString() {
		return this.name + " - " + this.number;
	}


	public String getName() {
		return name;
	}


	public String getNumber() {
		return number;
	}

}
