package com.revature.sts02;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exceptions {

	public static void main(String[] args) throws FileNotFoundException {
		
		
			FileReader fr = new FileReader("myFile");
		
		
 
		int [] myArray = new int[5];
		
		for(int i=0; i<=5; i++) {
			try {
			myArray[i] = i*9;
			System.out.println("array:"+myArray[i]);
			}
			catch(ArrayIndexOutOfBoundsException ex) {
				ex.printStackTrace();
			}
			
			finally {
				System.out.println("FInally block here");
			}
			
			
		}
		
		System.out.println(myArray[4]);
		
		System.out.println("the end");
	}

}
