package com.study.day14.school;

import java.util.LinkedHashSet;
import java.util.Set;

public class Student { 
	//學生calss中建一個學科set可以新增
	
	

	private String name;
	private Integer age;
	
	public Student()
	{
		//空建構子
	}
	
	public Student(String name, Integer age) {
		this.name = name;
		this.age = age;
	}
	
	private LinkedHashSet<Clazz> clazzs = new LinkedHashSet<>();
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public LinkedHashSet<Clazz> getClazzs() {
		return clazzs;
	}
	public Student addClazzs(Clazz clazz) {//新增元素(學科)
		clazzs.add(clazz);
		return this;
		
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", clazzs=" + clazzs + "]";
	}
	
	
	

}
