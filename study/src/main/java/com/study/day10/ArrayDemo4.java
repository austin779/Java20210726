package com.study.day10;

import java.util.Arrays;
import java.util.Random;

public class ArrayDemo4 {

	public static void main(String[] args) {
		
		int[] poker = new int[13];
		for(int i = 0;i <poker.length;i++)
		{
			poker[i] = i+1;
		}
		
		
		System.out.println("洗牌前");
		System.out.println(Arrays.toString(poker));
		
		//重複隨機兩張牌換
		for(int count = 0;count < poker.length;count++)
		{
			//int i = Random.nextInt(poker.length);
			//int j = Random.nextInt(poker.length);
		}
		System.out.println("洗牌後");
		System.out.println(Arrays.toString(poker));
		
		

	}
}
