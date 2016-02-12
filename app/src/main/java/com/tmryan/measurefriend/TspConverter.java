package com.tmryan.measurefriend;

public class TspConverter {

	// self conversion
	public static String toTsp(String numEntry) {
		return numEntry;
	}
	
	// to quart = .00520833
	public static String toQuart(String numEntry) {
		return String.valueOf(Double.valueOf(numEntry) * .00520833);
	}
	
	// to pint = .0104167
	public static String toPint(String numEntry) {
		return String.valueOf(Double.valueOf(numEntry) * .0104167);
	}
	
	// to cup = .0208333
	public static String toCup(String numEntry) {
		return String.valueOf(Double.valueOf(numEntry) * .0208333);
	}
	
	// to tablespoon = .333333
	public static String toTbsp(String numEntry) {
		return String.valueOf(Double.valueOf(numEntry) / 3);
	}
	
	// to gallon = .00130208
	public static String toGallon(String numEntry) {
		return String.valueOf(Double.valueOf(numEntry) * .00130208);
	}
	
	// to liter = .0147868
	public static String toLiter(String numEntry) {
		return String.valueOf(Double.valueOf(numEntry) * .00492892);
	}
	
	// to ml = 4.93
	public static String toMl(String numEntry) {
		return String.valueOf(Double.valueOf(numEntry) * 4.92892);
	}
	
	// to fluid ounce = .166667
	public static String toFlOz(String numEntry) {
		return String.valueOf(Double.valueOf(numEntry) * .166667);
	}
	
}
