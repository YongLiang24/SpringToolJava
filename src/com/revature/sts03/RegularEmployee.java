package com.revature.sts03;

public class RegularEmployee extends Employee implements PayRates {

	
	public RegularEmployee() {
		super();
	}

	public RegularEmployee(String name) {
		super(name);
	}

	@Override
	public int twoWeeksPayment(int hours) {
		
		int twoWeekPay = RegularEmployee.regularPayByWeek *2;
		return twoWeekPay;
	}

}
