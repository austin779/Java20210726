package com.study.day24;

public class EqualsDemo {

	public static void main(String[] args) {
		//物件內容相等使用equals
		StringBuilder sBuilder = new StringBuilder("Java");
		String string = new String ("Java");
		System.out.println(sBuilder.equals(string));
		System.out.println(sBuilder.toString().equals(string));
		System.out.println(sBuilder.toString().hashCode());
		System.out.println(string.hashCode());
	}
}
