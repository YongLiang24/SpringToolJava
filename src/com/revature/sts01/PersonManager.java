package com.revature.sts01;

import com.revature.sts02.Employee;
import java.util.Scanner;
public class PersonManager {

	public static void main(String[] args) {
		
		/*Person me01 = new Person();
		me01.setInfo("Yong", -8);
		me01.getDisplay();
		
		Person me02 = new Person("Cindy", 10);
		me02.getDisplay();
		
		Person me03 = new Person("Michelle", 7);
		me03.getDisplay();
		
		Person me04 = new Person("Timothy", 5);
		me04.getDisplay();
		
		Person me05 = new Person();
		me05.setInfo("cat", 2);
		me05.getDisplay();
		*/
		
		/*
		 * Person person[] = new Person [5]; person[0]= new Student ("Shark", 30,
		 * "swim"); person[1]= new Student("Cow", 5, "walk"); person[2]= new
		 * Student("Tiger", 50, "run"); person[3]= new Student("Elephant", 15, "fly");
		 * person[4]= new Student("Unknown", 100, "200");
		 * 
		 * for(Person i : person) { //System.out.println(i); }
		 * 
		 * Student student = new Student("Hippo", 8, "DrinkWater"); Person student2 =
		 * new Student("Whale", 120, "Learn to Walk");
		 * 
		 * Employee myEmp = new Employee("Plane", 5, "Flight");
		 * System.out.println("new emplyee:" + myEmp.getDept());
		 */
		
		Student firstStudent = new Student("Boar", 24, "eatting lesson");
		
		Person secondStudent = new Student("Ox", 23, "Eat Grass");
		
		firstStudent.doWork();
		System.out.println(" ");
		secondStudent.doWork();
		
		System.out.println(firstStudent +"\n"+ secondStudent);
		
		
		Employee firstEmp = new Employee();
		Employee secondEmp = new Employee();
		
		Employee.setCompany("Same");
		System.out.println("first company: "+firstEmp.getCompany() + "\n"+"second company:"+secondEmp.getCompany());
		
		
		@SuppressWarnings("resource")
		Scanner scoreObj = new Scanner(System.in);
		System.out.println("whats your Mistaken score?");
		
		String myScore = scoreObj.nextLine();
		
		System.out.println("your score is:" +firstStudent.getScore(Integer.parseInt(myScore)));
		
	}

}
