package com.revature.sts02;

import com.revature.sts01.Student;

public class Cars extends Student {

	public static void main(String[] args) {
		
		Vehicle car = new Vehicle();
		car.setMaker("Toyota");
		car.setYear(1982);
		System.out.println("Car Maker: "+car.getMaker() + "\nCar Year: "+car.getYear());

		
		
		Student myStudent = new Student("Fish", 2, "Swimming Lesson");
		
		
		
		myStudent.setCourse("Java");
		System.out.println("My new course: "+myStudent.getCourse());
		
		Cars myCar = new Cars();
		myCar.tryMe();
	
			
	}
	
	void tryMe() {
		//super.setCourse("J#");
		
		
		super.getCourse();
		//super.mymy = "mad";
	}
}
