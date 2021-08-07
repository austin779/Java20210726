package com.study.day16;

class Father
{
	Father() {
		// TODO Auto-generated constructor stub
		System.out.println("Father....");
	}
	
	Father(int x)
	{
		System.out.println("Father..." + x);
	}
}

class  Son extends Father{
	public Son() {
		System.out.println("Son...........");
	}
	public Son(int x)
	{
		super(x+100);
		System.out.println("Son..." + x);
	}
}
public class ConstructorDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Son son = new Son();
		Son son2 = new Son(100);
		
		
	}

}
