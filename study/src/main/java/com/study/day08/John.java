package com.study.day08;

import com.study.day07.Student;

public class John extends Halen{

	public void callStudent() {
		//override
		com.study.day07.Student s1 = new com.study.day07.Student();
		Student s2 = new Student();
		//d 變數一定可以
		System.out.println(s1.d);
		System.out.println(this.c);
		System.out.println(s2.d);
		//System.out.println(s2.c);

		
	}
}
