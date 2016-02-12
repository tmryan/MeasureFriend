package com.tmryan.measurefriend;

public class MililiterConverter {
	
	// self conversion
	public static String toMililiter(String numEntry) {
		return numEntry;
	}
	
	// to quart = 1.05669
	public static String toQuart(String numEntry) {
		return String.valueOf(Double.valueOf(numEntry) * .00105669);
	}
	
	// to pint = 2.11338
	public static String toPint(String numEntry) {
		return String.valueOf(Double.valueOf(numEntry) * .00211338);
	}
	
	// to cup = 4.22675
	public static String toCup(String numEntry) {
		return String.valueOf(Double.valueOf(numEntry) * .00422675);
	}
	
	// to tablespoon = 67.628
	public static String toTbsp(String numEntry) {
		return String.valueOf(Double.valueOf(numEntry) * .067628);
	}
	
	// to teaspoon = 202.884
	public static String toTsp(String numEntry) {
		return String.valueOf(Double.valueOf(numEntry) * .202884);
	}
	
	// to gallon = 0.264172
	public static String toGallon(String numEntry) {
		return String.valueOf(Double.valueOf(numEntry) * 0.000264172);
	}
	
	// to liter = 1000
	public static String toLiter(String numEntry) {
		return String.valueOf(Double.valueOf(numEntry) / 1000);
	}
	
	// to fluid ounce = 33.814
	public static String toFluidOunce(String numEntry) {
		return String.valueOf(Double.valueOf(numEntry) * .033814);
	}
	
}
