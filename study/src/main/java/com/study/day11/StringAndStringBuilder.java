package com.study.day11;

public class StringAndStringBuilder {
	
	public static void add8(String x)
	{
		System.out.printf("x: %s\n", x);
		x = x.concat("8");
		System.out.printf("x: %s\n", x);
	}
	
	public static String add8_1(String x)
	{
		x = x.concat("8");
		return x;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
