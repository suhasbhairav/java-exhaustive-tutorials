package com.tutorials.learn.enums;

public enum TouristPlaces {
	
	INDIA("Wow!"),
	UK("Amazing!"),
	SWEDEN("BEAUTIFUL");
	
	private String description;
	
	private TouristPlaces(String d) {
		description = d;
	}
	
	public String getDesc() {
		return description;
	}

}
