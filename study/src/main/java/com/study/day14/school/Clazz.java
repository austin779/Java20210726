package com.study.day14.school;

public class Clazz {
	//一個科目有自己的名稱 學分數 及學費
	
	private String name;//科目
	private Integer price;//每學分價格
	
	private Integer unit;//學分
	
	public Clazz() {
		
	}
	public Clazz(String name, Integer price, Integer unit) {
	
		this.price = price;
		this.name = name;
		this.unit = unit;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getUnit() {
		return unit;
	}
	public void setUnit(Integer unit) {
		this.unit = unit;
	}
	@Override
	public String toString() {
		return "Clazz [price=" + price + ", name=" + name + ", unit=" + unit + "]";
	}
	
	
	
}
