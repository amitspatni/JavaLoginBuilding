package NaveenAutomationLabs;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicatesAndNotCount {
	
	public static void main(String[] args) {
		
		
		String[] arrays = {"Java", "Ruby", "Pearl", "Python", "Java"};
		
		Set<String> hashs = new HashSet<String>();
		
		
		for(String s: arrays) {
			
			if (hashs.add(s)==false) {
				
				System.out.println(s + " is a duplicate");
			}
			
		}
	}
	
}
