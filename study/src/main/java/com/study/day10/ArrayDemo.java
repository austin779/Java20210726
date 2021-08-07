package com.study.day10;

public class ArrayDemo {

	public static void main(String[] args) {
		int sum = 0;
		int[] scores = {100, 80, 0, 90};
		//0分改為70分
		scores[2] = 70;
		//scores 陣列長度
		System.out.println(scores.length);
		//利用 for- =loop 取得陣列元素內容
		for(int i = 0;i<scores.length;i++)
		{
			System.out.println(scores[i]);
			sum = sum + scores[i];
		}
		System.out.println(sum);
		double avg = sum/scores.length;
		System.out.println(avg);



	}

}
