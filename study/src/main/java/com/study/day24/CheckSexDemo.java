package com.study.day24;


interface Sex
{
	int man = 1;
	int woman = 2;
	
}
public class CheckSexDemo {

	public static void main(String[] args) {
		showSex(Sex.man);
		showSex(Sex.woman);
		showSex(0);
		showSex(-100);
		//用錯參數 (在編譯時期不會先行通知)
	}
	
	public static void showSex(int x)
	{
		switch (x) {
		case Sex.man://1
			System.out.println("男性");
			break;
	
		case Sex.woman://2
			System.out.println("女性");
			break;
		}
	}

	
}
