package com.study.day23;

import java.util.Arrays;

public class LambdaDemo3 {

		public static void main(String[] args) {
			
			String[] names = {"Jo", "Vincent", "Anita", "Jack"};
			
			Arrays.stream(names)
			.mapToInt(name -> name.length())
			.forEach(name ->System.out.println(name));
			
		}
}
