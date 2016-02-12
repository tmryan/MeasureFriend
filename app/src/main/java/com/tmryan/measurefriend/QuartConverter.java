package com.tmryan.measurefriend;

public class QuartConverter {

	// self conversion
	public static String toQuart(String numEntry) {
		return numEntry;
	}
	
	// to gallon = .25
	public static String toGallon(String numEntry) {
		return String.valueOf(Double.valueOf(numEntry) * .25);
	}

	// to pint = 2
	public static String toPint(String numEntry) {
		return String.valueOf(Integer.valueOf(numEntry) * 2);
	}
	
	// to cup = 4
	public static String toCup(String numEntry) {
		return String.valueOf(Integer.valueOf(numEntry) * 4);
	}
	
	// to tbsp = 64
	public static String toTbsp(String numEntry) {
		return String.valueOf(Integer.valueOf(numEntry) * 64);
	}
	
	// to tsp = 192
	public static String toTsp(String numEntry) {
		return String.valueOf(Integer.valueOf(numEntry) * 192);
	}
	
	// to liter = .946353
	public static String toLiter(String numEntry) {
		return String.valueOf(Double.valueOf(numEntry) * .946353);
	}
	
	// to ml = 946.353
	public static String toMl(String numEntry) {
		return String.valueOf(Double.valueOf(numEntry) * 946.353);
	}
	
	// to fl oz = 32
	public static String toFlOz(String numEntry) {
		return String.valueOf(Integer.valueOf(numEntry) * 32);
	}
	
}
