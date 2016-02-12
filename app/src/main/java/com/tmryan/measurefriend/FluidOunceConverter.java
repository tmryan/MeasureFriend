package com.tmryan.measurefriend;

public class FluidOunceConverter {

	// self conversion
	public static String toFlOz(String numEntry) {
		return numEntry;
	}
	
	// to quart = .03125
	public static String toQuart(String numEntry) {
		return String.valueOf(Double.valueOf(numEntry) * .03125);
	}
	
	// to pint = .0625
	public static String toPint(String numEntry) {
		return String.valueOf(Double.valueOf(numEntry) * .0625);
	}
	
	// to cup = .125
	public static String toCup(String numEntry) {
		return String.valueOf(Double.valueOf(numEntry) * .125);
	}
	// to tablespoon = 2
	public static String toTbsp(String numEntry) {
		return String.valueOf(Integer.valueOf(numEntry) * 2);
	}
	
	// to teaspoon = 6
	public static String toTsp(String numEntry) {
		return String.valueOf(Integer.valueOf(numEntry) * 6);
	}
	
	// to liter = .0295735
	public static String toLiter(String numEntry) {
		return String.valueOf(Double.valueOf(numEntry) * .0295735);
	}
	
	// to ml = 29.5735
	public static String toMl(String numEntry) {
		return String.valueOf(Double.valueOf(numEntry) * 9.5735);
	}
	
	// to gallon = .0078125
	public static String toGallon(String numEntry) {
		return String.valueOf(Double.valueOf(numEntry) * .0078125);
	}
	
}
