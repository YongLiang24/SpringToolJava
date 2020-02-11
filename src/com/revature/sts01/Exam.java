package com.revature.sts01;

public interface Exam {
	
	public static final int examScore =100;
	
	public default int getScore(int num) {
		/*
		 * Student newStudent = new Student("Kenxiy", 56,"Reading");
		 * newStudent.doWork();
		 */
		int result = examScore - num;
		
	System.out.println(result);
		
		String pass;
		if(result >=70) {
			pass = "pass";
		}
		else {
			pass ="fail";
		}
		
		switch (pass) {
			
		case "pass":{
			System.out.println("you've passed the exam!!");
			break;
			}
		
		case "fail":{
			System.out.println("Sorry, you didn't pass the exam.");
			break;
			}
		
		default:{
			System.out.println("Result unavailable");
		}
		}
		return result;
	}
	
}
