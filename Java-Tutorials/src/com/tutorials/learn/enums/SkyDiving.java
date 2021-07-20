package com.tutorials.learn.enums;

public enum SkyDiving {
	BEGINNER("Just beginning"),
	NOVICE("Just reaching the sky");
	
	private String value;
	private SkyDiving(String v) {
		value = v;
	}
	
	public String getValue() {
		return value;
	}

}
