package com.study.day15.zoo;

public class ZooMain3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//多型下轉型問題II
		Animal a1 =(Animal) new Bird();
		//System.out.println()
		
		Bird b2 =(Bird) new Ostrich();
		Ostrich o3 =(Ostrich)b2;
		
		
	}

}
