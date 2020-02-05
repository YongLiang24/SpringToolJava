package com.revature.sts01;

public class Student extends Person {
	
	String course;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age, String course) {
		super(name, age);
		this.course = course;
	}
	
	public void getDisplay() {
		super.getDisplay();
		System.out.println("Course: "+course );
		super.setInfo("new course", 55);
	}
	
	public void setCourse(String course) {
		this.course = course;
	}
	public String getCourse() {
		System.out.println(course);
		return course;
	}
	

	
	
}
