package com.study.day14;
import java.util.Random;
import java.util.TreeSet;

public class TreeSetDemo2 {
	public static void main(String[] args) {
		
		TreeSet treeSet = new TreeSet();
		
		//取得1~10亂數
		Random random =new Random();
		
		while(treeSet.size() < 5)
		{
			
			int n = random.nextInt(10) + 1;
			System.out.printf("n: %d \n", n);
			treeSet.add(n);
			//嘿有重複取代的問題
			//一直取直到有五個相異數
			//不知道會出現幾次數字才有五個相異數
			//用while迴圈
		}
		System.out.println(treeSet);
		
	}
}
