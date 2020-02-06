package com.revature.sts02;

import com.revature.sts01.Person;

public class Employee extends Person {
	
	private String dept;
	private static String company;
	
	public Employee() {
		super();
	}
	
	public String getCompany() {
		return company;
	}

	public static void setCompany(String company) {
		Employee.company = company;
	}

	public Employee(String name, int age, String dept) {
		super(name, age);
		this.dept = dept;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public String getDept() {
		
		return dept;
	}

	@Override
	public void doWork() {
		System.out.println("Work all day.");
		
	}


}
