package com.study.day13;

import java.util.IntSummaryStatistics;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.stream.IntStream;

public class GenericTypeDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			LinkedHashSet scores = new LinkedHashSet();
			//如果<>中不寫，則預設object
			
			scores.add("國文");
			scores.add(100);
			scores.add("英文");
			scores.add(80);
			
			Iterator iter = scores.iterator();
			int sum = 0;
			
			
			System.out.println(scores);
	
			LinkedHashSet<Integer> scores2 = new LinkedHashSet<>();
			scores2.add(100);
			scores2.add(60);
			Iterator<Integer> iterator2 = scores2.iterator();
			
		
			int sum2 = 0;
			while(iterator2.hasNext())
			{
				sum2+= iterator2.next();
			}
			System.out.println(sum2);
			
			int sum3 = scores2.stream()//展開
				  .mapToInt(score2 -> score2.intValue())
				  .sum();
			
			System.out.println(sum3);
			
			
			
			
			
	
	}
	
	

}
