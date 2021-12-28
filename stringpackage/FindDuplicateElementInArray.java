package stringpackage;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElementInArray {
	
 
	public static void main(String[] args) {
		

		String[] myStrArray = {"Java", "JavaScript", "Selenium", "SeleniumScript", "Java", "Selenium"};
		
		
		Set<String> mySet = new HashSet<String>();
		
		
		for (String s:myStrArray ) {
			
		 if ((mySet.add(s)) == false) {
			 
			 System.out.println("Duplicate value is " + s);
			 
		 }
			
		}
		
	}
	
	
	
}
	
	


	

