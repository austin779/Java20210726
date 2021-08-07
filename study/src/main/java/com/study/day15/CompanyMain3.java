package com.study.day15;

import java.security.PublicKey;
import java.util.Random;

public class CompanyMain3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee employee = getEmployee();
		System.out.println(employee.getClass().getSimpleName());
		if (employee instanceof Manager)
		{
			System.out.println(((Manager) employee).budget);
		}
		
	}
	public static Employee getEmployee()
	{
		Employee employee =new Employee();
		Manager manager =new Manager();
		Supervisor supervisor =new Supervisor();
		employee.salary = 40000;
		manager.salary = 70000;
		supervisor.salary = 150000;
		manager.budget = 200000;
		supervisor.budget = 100_0000;
		supervisor.stockOption = 2000_0000;

		Random random =new Random();
		int n = random.nextInt(3);//0.1.2
		switch (n) 
		{
			case 0:
				return employee;
			case 1:
				return manager;			
			case 2:
				return supervisor;
		}
		return null;//
	}
	

}
