package com.study.day24;

class Outer
{
	int x = 10;//Outer's 物件變數
	static int  sx = 100;//Outer's 類別變數(static )/靜態變數
	class Inner{//一班內部類別
		void print() {
			System.out.println("Inner() -> print()" );
			System.out.println(Outer.sx);
			System.out.println(Outer.this.x);
		}
	}
	
	
	
	static class SInner
	{
		void print() {
			System.out.println("Inner() -> print()" );
			System.out.println(Outer.sx);
			//System.out.println(Outer.this.x);
		
		}
		static void sprint()
		{
			System.out.println("Inner() -> (static) sprint()");
			System.out.println(Outer.sx);
			//System.out.println(Outer.this.x);
			//靜態內部類沒有this指標
		}
	}
}

public class InnerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer.Inner inner = new Outer().new Inner();
		inner.print();
		
		Outer.SInner sInner = new Outer.SInner();
		
		sInner.print();
		sInner.sprint();
	}

}
