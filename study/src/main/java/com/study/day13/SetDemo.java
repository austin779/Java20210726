package com.study.day13;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//set內容都不可重複
		//新增.修改.刪除快
		//查詢也快
		//無序
		HashSet hSet =new HashSet();
		
		hSet.add("英文");
		hSet.add("數學");
		hSet.add("英文");
		hSet.add("國文");
		System.out.println(hSet);
		
		
		LinkedHashSet lHashSet = new LinkedHashSet();
		lHashSet.add("國文");
		lHashSet.add("英文");
		
		
	}

}
