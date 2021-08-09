package com.study.day26;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchDemo2 {

	public static void main(String[] args) {
	input();
		
	}
	
	public static void input()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("假設 分子=10 請輸入分母");
		int result = 0;
		int x = 10;
		try {
			int y = scanner.nextInt();
			if (y == 0)
			{
				System.out.println("分母不可為0");
				return;//停止此方法
			}
			result = x / y;
			System.out.printf("x = %d t = %d result = %d\n", x, y, result);
		}catch (InputMismatchException e) {
			System.out.println("請輸入數字");
			input();//重新執行 input() 這種寫法叫做遞迴()
		}finally {
			
			System.out.println("結束");

		}
		
	}
}
