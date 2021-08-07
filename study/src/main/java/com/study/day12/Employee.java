package com.study.day12;

public class Employee {
	private String name;
	private int age;
	private	Integer salaryInteger;
	public Employee(String name, int age, Integer salaryInteger) {
		this.name = name;
		this.age = age;
		this.salaryInteger = salaryInteger;
		
		
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Integer getSalaryInteger() {
		return salaryInteger;
	}
	public void setSalaryInteger(Integer salaryInteger) {
		this.salaryInteger = salaryInteger;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salaryInteger=" + salaryInteger + "]";
	}
	  

}
