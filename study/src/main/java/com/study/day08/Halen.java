package com.study.day08;

import com.study.day07.Student;

public class Halen extends Student//有繼承關係
{
	
	public void callStudent()
	{

		Student s2 = new Halen();
		//System.out.println(Student.c);
		
		//System.out.println(s2.c);
		//為何c 變數(protected) ->不能存取
		System.out.println(s2.d);//物件//object
		//System.out.println(Student.d);//類別//class

		System.out.println(this.c);
		System.out.println(this.d);
		
	}

}
