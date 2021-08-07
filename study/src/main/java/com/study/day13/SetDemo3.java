package com.study.day13;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class SetDemo3 {

	public static void main(String[] args) {
		
		LinkedHashSet acctHashSet = new LinkedHashSet();
		while (true)
		{
			System.out.printf("帳號資料 (%d 筆): %s \n", acctHashSet.size(), acctHashSet);
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("請輸入(+帳號,-帳號,exit):");
			
			String dataString = scanner.next();
			//如果有帳號包括exit字
			if(dataString.contains("exit"))//包含exit字串則退出
			{
				System.out.println("退出");
				break;
				
			}
			switch(dataString.charAt(0))
			{
				case '+':
					String addAcctName = dataString.substring(1);
					if(acctHashSet.contains(addAcctName))
					{
						System.out.println();
					}
				/*case '-':
					String g*/
			}
		
		
		}
			
		
		
	}

}
