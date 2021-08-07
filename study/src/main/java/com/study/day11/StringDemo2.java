package com.study.day11;

public class StringDemo2 {
	
	public static void main(String[] args)
	{
		String s1 = new String("Java");
		String s2 = ("Java");
		System.out.println(s1 == s2);//false
		s1 = s1.intern();// 丟進StringPool
		System.out.println(s1 == s2);//true

		String word = "  she sell sea shell on the sea shore  ";
		System.out.println(word);
		

	}
	
}
