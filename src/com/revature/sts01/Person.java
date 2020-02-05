package com.revature.sts01;

public class Person {

	 String name;
	 int age;
	
	public Person(){
		
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;	
	}
	protected void setInfo(String name, int age) {
		
		this.name = name;
		this.age = age;	
	}
	
	protected void getDisplay() {
		System.out.println("Name: "+name + "; Age: "+age);
	}
	
}

//student class - having name, age, course, management class 
