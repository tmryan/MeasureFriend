package com.tmryan.measurefriend;

public class GallonConverter {
	
	// self conversion
	public static String toGallon(String numEntry) {
		return numEntry;
	}
	
	// to quart = 4
	public static String toQuart(String numEntry) {
		return String.valueOf(Double.valueOf(numEntry) * 4);
	}
	
	// to pint = 8
	public static String toPint(String numEntry) {
		return String.valueOf(Double.valueOf(numEntry) * 8);
	}
	
	// to cup = 16
	public static String toCup(String numEntry) {
		return String.valueOf(Double.valueOf(numEntry) * 16);
	}
	
	// to tablespoon = 256
	public static String toTbsp(String numEntry) {
		return String.valueOf(Double.valueOf(numEntry) * 256);
	}
	
	// to teaspoon = 768
	public static String toTsp(String numEntry) {
		return String.valueOf(Double.valueOf(numEntry) * 768);
	}
	
	// to liter = 3.785
	public static String toLiter(String numEntry) {
		return String.valueOf(Double.valueOf(numEntry) * 3.785);
	}
	
	// to ml = 3785.41
	public static String toMililiter(String numEntry) {
		return String.valueOf(Double.valueOf(numEntry) * 3785.41);
	}
	
	// to fluid ounce = 128
	public static String toFluidOunce(String numEntry) {
		return String.valueOf(Double.valueOf(numEntry) * 128);
	}
	
}
