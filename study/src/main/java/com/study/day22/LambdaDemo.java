package com.study.day22;

public class LambdaDemo {

	public static void main(String[] args) {
		//使用匿名類別實現Add介面
		
		
		//Lambda
		
		Add add2 = (int x, int y) -> x + y;
		Add add3 = (x, y) -> x+y;
		System.out.println(add2.calc(10, 20));
		System.out.println(add3.calc(10, 20));
		
	}
}
