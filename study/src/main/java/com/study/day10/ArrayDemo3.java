package com.study.day10;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayDemo3 {
	public static void main(String[] args) {
		int[] scores = {100, 80, 70, 90};
		System.out.println(Arrays.toString(scores));
		Util.sortASC(scores);
		System.out.println(Arrays.toString(scores));

		
	}

}
