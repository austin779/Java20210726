package com.study.day11;

import java.util.Arrays;
import java.util.function.IntPredicate;

public class MultiArrayJava8Demo2 {

	public static void main(String[] args) {
		Exam e1 = new Exam("國文", 100);
		Exam e2 = new Exam("數學", 90);
		Exam e3 = new Exam("英文", 80);
		
		Exam e4 = new Exam("國文", 60);
		Exam e5 = new Exam("數學", 70);
		Exam e6 = new Exam("英文", 90);
		
		Exam[] exams = {e1,e2,e3,e4,e5,e6};
		/*Arrays.stream(exams)
			  .forEach(e -> System.out.println(e.getName() + "=" + e.getScore()));
		*/
		//算國平均
		
		Arrays.stream(exams)
		.filter(e -> e.getName().equals("國文"))
		. forEach(System.out::println);
		
		
		double avg = Arrays.stream(exams)
		.filter(e -> e.getName().equals("國文"))
		.mapToInt(e -> e.getScore())
		.average()
		.getAsDouble();
		
		System.out.println(avg);
		
		
		
		
		  
	}
}
