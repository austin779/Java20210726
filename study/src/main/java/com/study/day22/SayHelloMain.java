package com.study.day22;

public class SayHelloMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SayHello sayHello = new SayHello() { 
			//匿名類別
			public void hello(String name)
			{
				System.out.println("Hello" + name);
			}
			
			public String goodbye()
			{
				return "Goodbye";
			}
		};
		
		System.out.println(sayHello.goodbye());
		sayHello.hello("john");
	}

}
