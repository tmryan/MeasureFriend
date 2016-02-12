package com.tmryan.measurefriend;

public class CupConverter {

	// self conversion
	public static String toCup(String numEntry) {
		return numEntry;
	}
	
	//to quart = .25
	public static String toQuart(String numEntry) {
		return String.valueOf(Double.valueOf(numEntry) * .25);
	}
	
	//to pint = .5
	public static String toPint(String numEntry) {
		return String.valueOf(Double.valueOf(numEntry) * .5);
	}
	
	//to gallon = .0625
	public static String toGallon(String numEntry) {
		return String.valueOf(Double.valueOf(numEntry) * .0625);
	}
	
	//to tablespoon = 16
	public static String toTbsp(String numEntry) {
		return String.valueOf(Double.valueOf(numEntry) * 16);
	}
	
	//to teaspoon = 48
	public static String toTsp(String numEntry) {
		return String.valueOf(Double.valueOf(numEntry) * 48);
	}
	
	//to liter = .236588
	public static String toLiter(String numEntry) {
		return String.valueOf(Double.valueOf(numEntry) * .236588);
	}
	
	//to ml = 236.588
	public static String toMililiter(String numEntry) {
		return String.valueOf(Double.valueOf(numEntry) * 236.588);
	}
	
	//to fluid ounce = 8
	public static String toFluidOunce(String numEntry) {
		return String.valueOf(Double.valueOf(numEntry) * 8);
	}
	
}
