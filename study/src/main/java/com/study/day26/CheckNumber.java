package com.study.day26;

import java.math.BigDecimal;

public class CheckNumber {

	public static void main(String[] args) {

		
		double x = 10.0/2;
		System.out.println(x);
		//NAN = Not A Number;
		double y = 10 / 0.0;
		System.out.println(y);
		System.out.println(Double.isNaN(y));
		
		double z = 0.0/0.0;
		System.out.println(z);
		System.out.println(Double.isNaN(z));
		
		
		System.out.println((0.1 + 0.1) == 0.2);
		System.out.println((0.1 + 0.1 + 0.1) == 0.3);
		System.out.println(0.1+0.1+0.1);

		System.out.println((10 +10 +10) == 30);
		//四捨五入的英文->round
		
		BigDecimal a = new BigDecimal("0.1");
		BigDecimal b = new BigDecimal("0.1");
		BigDecimal c = new BigDecimal("0.1");
		BigDecimal d = new BigDecimal("0.1");
		//System.out.println(a+b+c+d);
		
		
	}

}
