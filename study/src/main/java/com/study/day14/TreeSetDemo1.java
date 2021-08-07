package com.study.day14;

import java.util.TreeSet;

public class TreeSetDemo1
{
	public static void main(String[] args) {
		
		
		TreeSet treeSet = new TreeSet();
		//自動排序
		treeSet.add(100);
		treeSet.add(99);
		treeSet.add(75);
		treeSet.add(99);
		System.out.println(treeSet);
		
	}
}