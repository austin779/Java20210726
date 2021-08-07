package com.study.day16;

public class OverloadingDemo {
	public static void printData(float x)
	{
		System.out.println("c:" + x);
	}
	public static void printData(double x)
	{
		System.out.println("B:" + x);
	}
	public static void printData(Integer x)
	{
		System.out.println("E:" + x);
	}
	public static void printData(Double x)
	{
		System.out.println("f:" + x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printData(10);//10, 10.0f ,10.0d, Integer,  //int->double
		
		printData(3.14);
		
	}

}
