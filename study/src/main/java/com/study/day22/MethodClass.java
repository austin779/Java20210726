package com.study.day22;
class Job
{
	void start()
	{
		/*final*/ int year = 2021;//方法區域變數
		
		//
		
		//year = 2022;			 //因為是final->不能修改，只能初始畫一次
								 //若此變數要給方法內部類別
								//則編譯器背後會加上final 來修飾
		
		//方法內部類別
		class Report
		{
			void content()
			{
				System.out.println(year + "年度報告");
			}
			
		}
		Report report = new Report();
		report.content();
		
	}
}
public class MethodClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Job job = new Job();
		job.start();
	}

}
