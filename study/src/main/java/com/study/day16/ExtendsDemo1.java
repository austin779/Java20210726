package com.study.day16;

class A{
	
	private final void play()
	{
		System.out.println("Play A");
	}
}

class B extends A{
	
	void play()
	{
		System.out.println("Play B");
	}
}

public class ExtendsDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int x = 200;
		//x = 150;不能再變動
		final int y;
		y= 100;//只能一次初始化
		
	}

}
