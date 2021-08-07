package com.study.day11;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.Map;

public class MultiArrayJava8Demo3 {

	public static void main(String[] args) {
	
		Exam e1 = new Exam("Java", 90);
		Exam e2 = new Exam("Java", 80);
		Exam e3 = new Exam("Java", 100);
		Exam e4 = new Exam("Java", 40);
		Exam e5 = new Exam("VB", 60);


		Exam[] exams = {e1,e2,e3,e4,e5};
		//陣列裡面都是物件
		
		IntSummaryStatistics stat = Arrays.stream(exams)
				.filter(e -> e.getName().equals("Java"))
				.mapToInt(e -> e.getScore())
				.summaryStatistics();
				
				System.out.println(stat);

			  
	}

}
