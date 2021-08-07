package com.study.day11;

import java.util.Arrays;
import java.util.function.Consumer;

public class MultiArrayJava8Demo4 {
	public static void main(String[] args) {
		
		 
		String[] names = {"Mary", "Jim","Vincent", "Anita", "Jo"};
		Arrays.stream(names)
		.mapToInt(name ->name.length())
		//.mapToInt(String::length)
		.max()
		.getAsInt();
		
	}
}
