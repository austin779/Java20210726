package com.study.day22;

public class BMIMain {

	public static void main(String[] args) {
		
		BMI bmi = new BMI() {
			
			@Override
			public double calc(double h, double w) {
				
				double bmi = w / Math.pow(h/100, 2);
				return bmi;
			}
		};
		
		System.out.println(bmi.calc(175.5, 72.5));
		
	}
}
