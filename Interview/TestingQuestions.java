package Interview;

import java.util.ArrayList;

import java.util.HashSet;

import java.util.Set;

public class TestingQuestions {
	
	public static void main(String[] args) {
		
		
		/// find duplicate elements in a word
		
		ArrayList<Character> myList = new ArrayList<Character>();
			
		String myWord = "AmitAmit";
		
		for (int i=0; i<myWord.length(); i++) {
			
			myList.add(myWord.charAt(i));
			
		}		
		
		Set<Character> myHashset = new HashSet<Character>();
		
		
		for (int j=0; j<myList.size(); j++) {
			
			
			if (myHashset.add(myList.get(j)) == false) {
				
				System.out.println(myList.get(j) + " is a duplicate");
				
			}
		}
		

		
		
		
		
//		1 Java Program to Print an Integer (Entered by the User)
		
		
//
//		2 Java Program to Add Two Integers
		
		
		
//		3 Java Program to Multiply two Floating Point Numbers
//
//		4 Java Program to Find ASCII Value of a character
//
//		5 Java Program to Compute Quotient and Remainder
//		6 Java Program to Swap Two Numbers
//		7 Java Program to Check Whether a Number is Even or Odd
//		8 Java Program to Check Whether an Alphabet is Vowel or Consonant
//		9 Java Program to Find the Largest Among Three Numbers
//
//		10 Java Program to Check Leap Year 

		
		
		
	}
	
	

}
