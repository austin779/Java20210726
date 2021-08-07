package com.study.day24;

enum Sex2//列舉->可以解決物用參數的問題
{
	man, female
}
public class CheckSexDemo2 {
	public static void main(String[] args)
	{
		showSex(Sex2.man);
		
	}

	public static void showSex(Sex2 sex2) 
	{
		switch (sex2) {
		case man:
			System.out.println("男");
			break;
	
		case female:
			System.out.println("女");
			break;
		}
	
	}
}

