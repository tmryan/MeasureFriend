package com.tmryan.measurefriend;

public class PintConverter {
	
	// self conversion
	public static String toPint(String numEntry) {
		return numEntry;
	}

	// to quart = .5
	public static String toQuart(String numEntry) {
		return String.valueOf(Double.valueOf(numEntry) * .5);
	}

	// to gallon = .125
	public static String toGallon(String numEntry) {
		return String.valueOf(Double.valueOf(numEntry) * .125);
	}
	
	// to cup = 2
	public static String toCup(String numEntry) {
		return String.valueOf(Double.valueOf(numEntry) * 2);
	}
	
	// to tablespoon = 32
	public static String toTbsp(String numEntry) {
		return String.valueOf(Double.valueOf(numEntry) * 32);
	}
	
	// to teaspoon = 96
	public static String toTsp(String numEntry) {
		return String.valueOf(Double.valueOf(numEntry) * 96);
	}
	
	// to liter = .473176
	public static String toLiter(String numEntry) {
		return String.valueOf(Double.valueOf(numEntry) * .473176);
	}
	
	// to ml = 473.176
	public static String toMililiter(String numEntry) {
		return String.valueOf(Double.valueOf(numEntry) * 473.176);
	}
	
	// to fluid ounce = 16
	public static String toFluidOunce(String numEntry) {
		return String.valueOf(Double.valueOf(numEntry) * 16);
	}
	
}
