package com.revature.sts03;

import java.util.Scanner;
public class PaymentManager {

	public static void main(String[] args) {
		
		Scanner payObj = new Scanner(System.in);
		System.out.println("Contract Workers: How many working hours in two weeks?");
		String workHours = payObj.nextLine();
		
		
		ContractEmployee employee01 = new ContractEmployee("John");
		System.out.println(employee01.getName() + " has worked "+workHours + " hours in two weeks");
		System.out.println("His contract pay is:" + employee01.twoWeeksPayment(Integer.parseInt(workHours)));
		
		System.out.println("");
		System.out.println("Regular: How many hours have Tom worked?");
		String workHours2 = payObj.nextLine();
		RegularEmployee employee02 = new RegularEmployee("Tom");		
		System.out.println(employee02.getName() + " has worked "+workHours2+" hours in two weeks");
		System.out.println("His fixed pay is:" + employee02.twoWeeksPayment(Integer.parseInt(workHours2)));
		
		payObj.close();
		
	}

}
