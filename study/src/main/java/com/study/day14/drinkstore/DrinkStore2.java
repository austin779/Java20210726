package com.study.day14.drinkstore;

import java.util.LinkedHashSet;

public class DrinkStore2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product redtea = new Product("紅茶", 5);//25
		Product greentea = new Product("綠茶", 6);//30
		Product milk = new Product("牛奶", 10);//50
		Product coffee = new Product("咖啡", 15);//75
		Product eggTart = new Product("蛋塔", 20);//100
		Product cake = new Product("蛋糕", 28);//140
		
		
		Drink milktea = new Drink("奶茶", 1);
		milktea.addProduct(milk).addProduct(redtea);//25+50=75
		Drink latte =new Drink("拿鐵", 1);//50+75=125
		latte.addProduct(coffee).addProduct(milk);
		
		//75*10=750
		//125*15=1250+625=1875
		//2625
		
		Dessert angelCake = new Dessert("天使蛋糕", cake, 1);//100
		
		Dessert goldTart = new Dessert("金牌蛋塔", eggTart, 1);//140
		
		System.out.println(milktea);
		System.out.println(latte);
		
		
		
		//套餐
		//family 全家餐
		//5杯拿鐵3杯奶茶6個金牌蛋塔4個天使蛋塔
		//8.8折
		//建立
		latte.setAmount(5);
		milktea.setAmount(3);
		angelCake.setAmount(4);
		goldTart.setAmount(6);
		
		
		LinkedHashSet<Drink> drinks = new LinkedHashSet<Drink>();
		LinkedHashSet<Dessert> desserts = new LinkedHashSet<Dessert>();
		
		
		drinks.add(latte);
		drinks.add(milktea);
		desserts.add(angelCake);
		desserts.add(goldTart);
		
		Combo familyCombo = new Combo(drinks, desserts,0.88);
		
		int drinksprice = familyCombo.getDrinks().stream()
							.mapToInt(drink -> drink.getAmount() *
									drink.getProducts().stream().mapToInt(Product::getPrice).sum())
									.sum();
		System.out.println(drinksprice);
		
		int dessertprice = familyCombo
				.getDesserts().stream()
				.mapToInt(dessert -> dessert.getAmount() */*價格*/
				dessert.getProduct().getPrice()).sum();
		
		System.out.println(dessertprice);
				
		int sum = drinksprice + dessertprice;
		
		double discountprice = familyCombo.getDiscount()*sum;//88折*總和
		
		System.out.println(discountprice);//最後價格
		

		
		
	
	}

}
