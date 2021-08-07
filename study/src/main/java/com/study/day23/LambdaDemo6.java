package com.study.day23;

import java.util.Arrays;

public class LambdaDemo6 {
	public static void main(String[] args) {
		Integer[]  scores = {40, 70, 50, 80, 100};
		int score = Arrays.stream(scores)
						  .filter(x->  x>=60)
						  .findAny()
						  .get();
		System.out.println(score);
		Integer[] scores2 = {100,90,80,70,60};
		
		boolean allPass = Arrays.stream(scores2)
				.allMatch(score2 -> score2>=60);//全部審核
		System.out.println(allPass);
		
	}
}
