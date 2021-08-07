package com.study.day13;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class SetDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet acctHashSet = new LinkedHashSet();
		while(true)
		{
				System.out.println("帳號資料:" + acctHashSet);
				Scanner scanner = new Scanner(System.in);
				System.out.println("請輸入新建帳號(exit離開)");
				String acctNameString = scanner.next();
				if(acctNameString.equalsIgnoreCase("exit"))
				{
					break;
				}
				if(acctHashSet.contains(acctNameString))
				{
					System.out.println("該帳號以存在請重新輸入");
					continue;
				}
				acctHashSet.add(acctNameString);
				System.out.println("帳號建立成功");		
		}
		
		System.out.println("離開本系統");
		
		
		
	}

}
