package com.study.day22;
import java.lang.Math;
public class CircleAreaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CircleArea circleArea = new CircleArea() {
			
			@Override
			public double calc(double r) {
				// TODO Auto-generated method stub
				return  Math.PI * Math.pow(r, 2);
			}
		};
		System.out.println(circleArea.calc(10));
	}

}
