package com.revature.sts03;

public class ContractEmployee extends Employee implements PayRates {

	
	
	public ContractEmployee() {
		super();
	}

	public ContractEmployee(String name) {
		super(name);
	}

	@Override
	public int twoWeeksPayment(int hours) {
		
		int twoWeekPay = hours * ContractEmployee.contractPayByHour;
			
		return twoWeekPay;
	}


}
