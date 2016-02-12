package com.tmryan.measurefriend;

public class TempConverter {
	
	public static String farenheitToCelsius(String numEntry) {
		return String.valueOf((Integer.valueOf(numEntry) - 32) * (5/9));
	}
	
	public static String celsiusToFarenheit(String numEntry) {
		return String.valueOf(Integer.valueOf(numEntry) * (5/9) + 32);
	}
	
}
