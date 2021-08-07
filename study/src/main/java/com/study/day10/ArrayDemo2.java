package com.study.day10;
import java.util.Arrays;

public class ArrayDemo2 {
	
	public static void main(String[] args) {
		int[] scores = {100, 80, 70, 90};
		double sum = Util.getSum(scores);
		double avg = Util.getAvg(scores);
		int min = Util.getMin(scores);
		int max = Util.getMax(scores);
		System.out.println(sum);
		System.out.println(avg);
		System.out.println(Arrays.toString(scores));
		
		
		
		
		System.out.println(min);
		System.out.println(max);


	}
}
