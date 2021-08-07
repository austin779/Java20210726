package com.study.day11;

import java.util.Arrays;

public class MultiArrayJava8Demo5 {
	//多維陣列
	
	

	public static void main(String[] args) {
		
		int[][] scores = {{100, 90, 70}, {80, 70, 60}};
		
		Arrays.stream(scores).forEach(System.out::println);
		
		// 二維 {{100, 90, 70}, {80, 70, 60}} 串流
		// 打平 flatMapToInt
		// {100, 90, 70} 一維陣列 -> Arrays.stream({100, 90, 70})一維陣列串流
		// 一維 {100, 90, 70, 80, 70, 60} 串流
		Arrays.stream(scores)//scores二維陣列串流成兩個一維陣列
			.flatMapToInt(score/*score兩個一維陣列*/ -> Arrays.stream(score)/*再將一維陣列串流成內容值*/)
			//flatMaptoInt將內容值(String???)轉成Integer
			.forEach(System.out::println);
			//都是intvalue
		
		System.out.println("=======================");
		
		System.out.println("scores " + scores.getClass());

		// 計算總分
		int sum = Arrays.stream(scores)
					.flatMapToInt(score -> Arrays.stream(score))
					.sum();
		System.out.printf("sum=%d\n", sum);
	}

}