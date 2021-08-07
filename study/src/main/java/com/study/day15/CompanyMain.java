package com.study.day15;

public class CompanyMain {

	
	public static void main(String[] args) {
		
		Employee employee = new Employee();
		Manager manager = new Manager();
		Supervisor supervisor = new Supervisor();
		employee.salary = 40000;
		manager.salary = 70000;
		manager.budget = 200000;
		supervisor.salary = 300000;
		supervisor.budget = 100_0000;
		
		supervisor.stockOption = 2000_0000;
		
		System.out.println(employee.salary);
		System.out.println(manager.salary);
		System.out.println(manager.budget);
		System.out.println(supervisor.salary);
		System.out.println(supervisor.budget);
		System.out.println(supervisor.stockOption);

		
		
	}
}
