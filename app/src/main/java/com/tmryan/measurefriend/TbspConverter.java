package com.tmryan.measurefriend;

public class TbspConverter {

	// self conversion
	public static String toTbsp(String numEntry) {
		return numEntry;
	}
	
	// to quart = .015625
	public static String toQuart(String numEntry) {
		return String.valueOf(Double.valueOf(numEntry) * .015625);
	}
	
	// to pint = .03125
	public static String toPint(String numEntry) {
		return String.valueOf(Double.valueOf(numEntry) * .03125);
	}
	
	// to cup = .0625
	public static String toCup(String numEntry) {
		return String.valueOf(Double.valueOf(numEntry) * .0625);
	}
	
	// to gallon = .00390625
	public static String toGallon(String numEntry) {
		return String.valueOf(Double.valueOf(numEntry) * .00390625);
	}
	
	// to teaspoon = 3
	public static String toTsp(String numEntry) {
		return String.valueOf(Double.valueOf(numEntry) * 3);
	}
	
	// to liter = .0147868
	public static String toLiter(String numEntry) {
		return String.valueOf(Double.valueOf(numEntry) * .0147868);
	}
	
	// to ml = 14.7868
	public static String toMililiter(String numEntry) {
		return String.valueOf(Double.valueOf(numEntry) * 14.7868);
	}
	
	// to fluid ounce = .5
	public static String toFluidOunce(String numEntry) {
		return String.valueOf(Double.valueOf(numEntry) * .5);
	}
	
}
