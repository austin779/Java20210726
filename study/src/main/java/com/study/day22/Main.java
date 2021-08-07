package com.study.day22;

import com.study.day22.Outer.Inner;

class Outer
{
	int x = 7;
	class Inner
	{
		int x = 77;
		void job()
		{
			int x =777;
			System.out.println("java...");
			System.out.println("區域變數 x = " + x);
			System.out.println("Inner's 物件變數 x = " + this.x);
			System.out.println("Outer's 物件變數 x = " + Outer.this.x);
		}
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		inner.job();
		
		
	}

}
