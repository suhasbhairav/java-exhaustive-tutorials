package com.tutorials.learn.enums;

public enum CarRacing {
	
	SPEED("This is speedy!"),
	CRAZY("This is crazy!"),
	SURE("Are your Sure?");
	
	private String val;
	private CarRacing(String v) {
		val = v;
	}
	
	public String getValue() {
		return val;
	}

}
