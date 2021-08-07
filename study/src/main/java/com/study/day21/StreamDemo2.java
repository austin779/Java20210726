package com.study.day21;

import java.util.Arrays;

public class StreamDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String[] scores = {"100", "90.5", "75.5", "45.0"};
		Arrays.stream(scores).mapToDouble(score->Double.parseDouble(score)).forEach(score->System.out.println(score));
		double sum = Arrays.stream(scores).mapToDouble(score->Double.parseDouble(score)).sum();
		
		System.out.println(sum);
			
			  
	}

}
