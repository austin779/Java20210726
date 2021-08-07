package com.study.day16;
/*
 * static :類別成員
 * instance:物件成員
 */


class Student
{
	int ages = 18;//物件成員
	String name = "John";//物件成員
	static String schoolName = "pcschool";//類別成員
	
}
public class StaticAndInstance {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println(Student.schoolName);
		Student s1 = new Student();
		Student s2 = new Student();
		s2.ages = 17;
		s2.name = "Mary";
		System.out.println(s1.ages);
		System.out.println(s1.name);
		
		
	}

}
