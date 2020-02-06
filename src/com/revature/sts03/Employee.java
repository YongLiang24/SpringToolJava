package com.revature.sts03;

public abstract class Employee {

	private String name;
	
	
	public Employee() {
	
	}
	

	public Employee(String name) {
		this.name = name;
	}


	public abstract int twoWeeksPayment(int hours);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
