package NaveenAutomationLabs;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElementsInArrayFive {
	
	public static void main(String[] args) {
		
		String[] myfav = {"Java", "Python", "Java", "SQL", "SQL"};
		
		
		Set<String> myUnique = new HashSet<String>();
		
		
		for (int i=0; i<myfav.length; i++) {
			
			
			if (myUnique.add(myfav[i]) == false) {
				
				 System.out.println(myfav[i] +  " is dupicate in a given string" );
				 
				 
			} else {
				
				myUnique.add(myfav[i]);
			}
			
			
		}
		
		
		
	}

}
