package com.revature.sts01;

public class Student extends Person implements Exam {
	
	private String course;
	

	public Student() {
		super();
	}

	public Student(String name, int age, String course) {
		super(name, age);
		this.course = course;
	}
	
	public void setCourse(String course) {
		this.course = course;
	}
	public String getCourse() {
		System.out.println(course);
		return course;
	}

	@Override
	public void doWork() {
		
		System.out.println(super.getName() + "\n" +super.getAge() +"\n" +course);
		System.out.println("Study all day.");
		
	}
	

	
	
}
