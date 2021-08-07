package com.study.day15.zoo;

public class ZooMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//多型轉型問題
		
		Animal a1 = new Animal();
		Animal a2 = new Tiger();
		Animal a3 = new Fish();
		Animal a4 = new Bird();
		Animal a5 = new Ostrich();
		//型態全是animal
		((Bird)a4).birth();
		((Ostrich)a5).birth();
		
		a4.move();//答案"我會飛"
		a5.move();
		((Bird)a5).move();
		
		//((Fish)a5).move();//
		
		if(a5 instanceof Fish)
		{
			
		}
		
		
		
		

		
	}

}
