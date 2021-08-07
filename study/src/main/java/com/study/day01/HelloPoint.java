package com.study.day01;

public class HelloPoint {
	public static void main(String[] args) {
		//開根號
		System.out.println(Math.sqrt(9));
		//指數次方
		System.out.println(Math.pow(3, 2));
		//假設A點(10,20)B點(-15,50)
		//求線段距離
		//題示:建立POINTDISTANCE.JAVA +組合
		Point a = new Point(10,20);
		Point b = new Point(-15,50);
		PointDistance d_ab = new PointDistance(a,b);
		System.out.println(d_ab.getDistance());
		
	}
}
