package com.study.day14.drinkstore;

import java.util.LinkedHashSet;

public class DrinkStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product redtea = new Product("紅茶", 5);
		Product greentea = new Product("綠茶", 6);
		Product milk = new Product("牛奶", 10);
		Product coffee = new Product("咖啡", 15);
		
		Drink milktea = new Drink("奶茶", 1);
		milktea.addProduct(milk).addProduct(redtea);
		Drink latte =new Drink("拿鐵", 1);
		latte.addProduct(coffee).addProduct(milk);
		
		System.out.println(milktea);
		System.out.println(latte);
		milktea.setAmount(10);
		latte.setAmount(15);
		LinkedHashSet<Drink> drinks = new LinkedHashSet<Drink>();
		drinks.add(latte);
		drinks.add(milktea);
		
		
		
		
		int cost = drinks.stream()
				.mapToInt(drink -> drink.getAmount() * drink.getProducts().stream().mapToInt(Product::getCost).sum())
				.sum();
		
		int price = drinks.stream()
				.mapToInt(drink -> drink.getAmount() *
								drink.getProducts().stream().mapToInt(Product::getPrice).sum())
								.sum();
		
		
		int profit = price - drinks.stream()
				.mapToInt(drink -> drink.getAmount() * drink.getProducts().stream().mapToInt(Product::getCost).sum())
				.sum();
		
		System.out.println(price);
		System.out.println(cost);
		System.out.println(profit);
								
		
	
	}

}
