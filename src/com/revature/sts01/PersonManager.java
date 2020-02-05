package com.revature.sts01;

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
		
		Person person[] = new Person [5];
		person[0]= new Person("Shark", 30);
		person[1]= new Person("Cow", 5);
		person[2]= new Person("Tiger", 50);
		person[3]= new Person("Elephant", 15);
		person[4]=new Person("Unknown", 100);
		
		for(Person i : person) {
			i.getDisplay();
			//System.out.println(i);
		}
		
		Student student = new Student("Hippo", 8, "DrinkWater");
		student.getDisplay();
		
		Person student2 = new Student("Whale", 120, "Learn to Walk");
		student2.getDisplay();
	}

}
