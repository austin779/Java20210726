package com.study.day11;

public class StringBufferDemo {
	public static void main(String[] args) {
		
		//StringBuilder (用於單工)
		//StringBuffer (用於多執行緒)
		StringBuilder sb = new StringBuilder();
		sb.append("Hi").append("Java");
		System.out.println(sb);
		sb.delete(0, 2);//刪字
		System.out.println(sb);
		sb.insert(3, "8");//插入--
		System.out.println(sb);
		
		//String 與 StringBuilder 的比較
		String s1 = "Java";
		//StringBuilder s2 = new S

		
	}
}
