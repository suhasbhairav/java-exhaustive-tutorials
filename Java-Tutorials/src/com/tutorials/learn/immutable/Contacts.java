package com.tutorials.learn.immutable;

public class Contacts {
	
	private final String fName;
	private final String lName;
	
	public Contacts(String fName, String lName) {
		this.fName = fName;
		this.lName = lName;
	}
	
	
	
	public String getfName() {
		return fName;
	}



	public String getlName() {
		return lName;
	}



	@Override
	public String toString() {
		return this.fName + this.lName;
	}

}
