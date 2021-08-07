package com.study.day18;

import java.util.Arrays;

public class DogStore {

	public static void main(String[] args) {
		
		//interface
		//Dog dog = new Dog();
		Dog bigDog = new BigDog();
		Dog smallDog = new SmallDog();
		Dog eDog = new EDog();
		
		Dog[] dogs = {bigDog, smallDog, eDog};
		
	}
	public static void printDog(Dog dog) {
		
		System.out.println(dog.getClass().getSimpleName());
		System.out.println(Dog.legs);
		dog.eat();
		dog.skill();
	}

}
