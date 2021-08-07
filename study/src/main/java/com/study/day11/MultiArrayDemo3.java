package com.study.day11;

public class MultiArrayDemo3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Exam e1 = new Exam("國文", 100);
		Exam e2 = new Exam("數學", 90);
		Exam e3 = new Exam("英文", 80);
		
		Exam e4 = new Exam("國文", 60);
		Exam e5 = new Exam("數學", 70);
		Exam e6 = new Exam("英文", 90);
		
		Exam e7 = new Exam("國文", 90);
		Exam e8 = new Exam("英文", 90);

		
		
		Exam[][] exams = {
				{e1, e2, e3},{e4, e5, e6}
		};
		int chinese_sum = 0;
		int math_sum = 0;
		int english_sum = 0;
		
		for (Exam[] exams_1 : exams) 
		{
			for (Exam e : exams_1) 
			{
				switch(e.getName())
				{
				case "國文":
					chinese_sum += e.getScore();
					break;
				case "數學":
					math_sum += e.getScore();
					break;
				case "英文":
					english_sum += e.getScore();
					break;     
				}
			}
		}
		Exam[] chi = {e1,e4};//Exam[0] Exam[1]
		Exam[] math = {e2,e5};
		Exam[] eng = {e3,e6};
		
		System.out.println(exams);
		System.out.println(exams[0]);
		System.out.println(exams[0][0]);
		
		
		

		}

	}
