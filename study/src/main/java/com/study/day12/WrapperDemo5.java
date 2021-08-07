package com.study.day12;

import java.util.Arrays;

import com.study.day11.Exam;

public class WrapperDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("John", 20, 40000);
		Employee e2 = new Employee("Mary", 30, 50000);
		Employee e3 = new Employee("Halen", 25, null);
		Employee e4 = new Employee("Jim", 40, 60000);
		Employee e5 = new Employee("Jack", 35, 55000);
		
		//示問公司頻均年齡
		Employee[] employees = {e1, e2, e3, e4, e5};
		int agesum = 0;
		for(int i = 0;i<employees.length;i++)
		{
			agesum += employees[i].getAge();
		}
		double age_avg = (double)agesum / employees.length;
		
		System.out.println(age_avg);
		
		// 
		
		double age_avg_1 = Arrays.stream(employees)
							   .peek(System.out::println)
							   .mapToInt(Employee::getAge)
							   .peek(System.out::println)
							   .average()
							   .getAsDouble();
		
		System.out.println(age_avg_1);


	}

}
