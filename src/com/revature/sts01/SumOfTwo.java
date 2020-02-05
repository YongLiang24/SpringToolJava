package com.revature.sts01;

public class SumOfTwo {
	
	public static void main(String[] args) {
		
		double [] argsArray = new double [args.length];	
		
		for(int i =0; i < args.length; i++) {
			
			argsArray[i]=Double.parseDouble(args[i]);
			System.out.print(" + "+argsArray[i] + " ");
			
		}
		System.out.println();
		System.out.println("The Sum is: "+ sum(argsArray));
	}
	
	public static double sum(double ...num) {
		
		double result =0.0;
		double [] numArray = num;
		for(int i=0; i<numArray.length; i++) {
			result += numArray[i];
		}
		
		return result;		
	}
}
