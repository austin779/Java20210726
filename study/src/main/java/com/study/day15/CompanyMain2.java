package com.study.day15;

import java.awt.print.Printable;

public class CompanyMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee employee =new Employee();
		Manager manager =new Manager();
		Supervisor supervisor =new Supervisor();
		employee.salary = 40000;
		manager.salary = 70000;
		supervisor.salary = 150000;
		manager.budget = 200000;
		supervisor.budget = 100_0000;

		printBudget(manager);
		printBudget(supervisor);
		printSalary(employee);
		printSalary(manager);
		printSalary(supervisor);
		
		
	}
	
	public static void printSalary(Employee employee)
	{
		System.out.printf("列印員工薪資單:$%,d\n", employee.salary);
	}
	//多型
	/*public static void printSalary(Manager manager)
	{
		System.out.printf("列印員工薪資單:$%,d\n", manager.salary);
	}
	
	public static void printSalary(Supervisor supervisor)
	{
		System.out.printf("列印員工薪資單:$%,d\n", supervisor.salary);
	}*/
	
	public static void printBudget(Manager manager)
	{
		System.out.printf("查看預算:$%,d\n", manager.budget);
	}
}
