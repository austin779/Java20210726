package com.study.day16;

class Bar
{
	Bar() {
		// TODO Auto-generated constructor stub
		System.out.println("Bar我一定要執行...");
	}
	
	Bar(int x)
	{
		System.out.println("BAR我也一訂要執行"+x);
	}
}

class Foo extends Bar
{
	Foo() {
		//super() //隱含super()指令
		super(150);
		System.out.println("FOO我一定要執行");
	}
	Foo(int x)
	{
		this();//呼叫自己無參數的建構子
		System.out.println("Foo...." + x);
	}
}
public class ConstructorDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Foo foo =new Foo(100);
		
		
		
	}

}
