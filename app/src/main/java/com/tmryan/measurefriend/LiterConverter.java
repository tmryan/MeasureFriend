package com.tmryan.measurefriend;

public class LiterConverter {
	
	// self conversion
	public static String toLiter(String numEntry) {
		return numEntry;
	}
	
	// to quart = 1.05669
	public static String toQuart(String numEntry) {
		return String.valueOf(Double.valueOf(numEntry) * 1.05669);
	}
	
	// to pint = 2.11338
	public static String toPint(String numEntry) {
		return String.valueOf(Double.valueOf(numEntry) * 2.11338);
	}
	
	// to cup = 4.22675
	public static String toCup(String numEntry) {
		return String.valueOf(Double.valueOf(numEntry) * 4.22675);
	}
	
	// to tablespoon = 67.628
	public static String toTbsp(String numEntry) {
		return String.valueOf(Double.valueOf(numEntry) * 67.628);
	}
	
	// to teaspoon = 202.884
	public static String toTsp(String numEntry) {
		return String.valueOf(Double.valueOf(numEntry) * 202.884);
	}
	
	// to gallon = 0.264172
	public static String toGallon(String numEntry) {
		return String.valueOf(Double.valueOf(numEntry) * 0.264172);
	}
	
	// to ml = 1000
	public static String toMl(String numEntry) {
		return String.valueOf(Double.valueOf(numEntry) * 1000);
	}
	
	// to fluid ounce = 33.814
	public static String toFlOz(String numEntry) {
		return String.valueOf(Double.valueOf(numEntry) * 33.814);
	}
	
}

