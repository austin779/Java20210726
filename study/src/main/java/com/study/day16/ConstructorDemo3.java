package com.study.day16;

class Animal
{
	
	Animal() 
	{
		// TODO Auto-generated constructor stub
	}
	Animal(int legs)
	{
		System.out.printf("Animal 有%d 隻腳\n", legs);
		
	}
}

class Puppy
{
	//預設建構子
}

class Dog extends Puppy
{
	
}

class Cat extends Animal
{
	//當繼承發生，本地的建構子會自動呼叫super()
	//先建立父類別物件，在建立子類別
	//建構子是建立物件時第一個呼叫的方法
	
	Cat()
	{
		super(4);
		
	}
}
public class ConstructorDemo3 {

	
	public static void main(String[] args) {
		
	}
}
