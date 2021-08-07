package com.study.day06;

public class HelloPoint {
	public static void main(String[] args) {
		//開根號
		System.out.println(Math.sqrt(9));
		//指數次方
		System.out.println(Math.pow(3, 2));
		//1.假設A點(10,20)B點(-15,50)
		//2.求線段距離
		//題示:建立POINTDISTANCE.JAVA +組合
		//我的思維 ->1.點class+2.算值class
		
		Point A = new Point(10, 20);
		Point B = new Point(-15, 50);
		PointDistance pointDistance = new PointDistance(A, B);
		double distance = pointDistance.getDistance();
		System.out.println(distance);
		System.out.println(pointDistance);
		

		
	}
}
