package com.study.day14.school;

import java.util.LinkedHashSet;

import com.study.day14.drinkstore.Product;

public class Demo {

	
		public static void main(String[] args) {
			Clazz c1 = new Clazz("Java", 8, 500);
			Clazz c2 = new Clazz("VB", 3, 300);
			Clazz c3 = new Clazz("IOT", 6, 400);
			
			Student s1 = new Student("John", 18);
			Student s2 = new Student("Mary", 19);
			Student s3 = new Student("Halen", 19);
			//學生選課
			//算學費
			LinkedHashSet<Student> studentssSets = new LinkedHashSet<Student>();
			
			
			
			s1.addClazzs(c3).addClazzs(c2).addClazzs(c1);
			s2.addClazzs(c3).addClazzs(c2);
			s3.addClazzs(c3);
			
			studentssSets.add(s1);
			studentssSets.add(s2);
			studentssSets.add(s3);
			
			/*studentssSets.stream()
			.mapToInt(studentssSet -> studentssSet.getClazzs().stream().mapToInt())
*/
			
			
			
			
			
			
					
		}
}
