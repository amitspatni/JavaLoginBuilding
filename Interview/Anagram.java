package Interview;

import java.util.ArrayList;
import java.util.Collections;

public class Anagram {
	
	public static void main(String[] args) {
		
		String word1 = "Keep";
		String word2 = "----";
		Boolean isAnagram = false;
		
		if (word1.length()!= word2.length()) {
			
			System.out.println("Words are not anagram");
			
		} 
		else {
			
			int len = word1.length();
			
			ArrayList <Character> myword1 = new ArrayList <Character>();
			ArrayList <Character> myword2 = new ArrayList <Character>();
			
			for (int i=0; i<len; i++) {
				
				myword1.add(word1.charAt(i));
				myword2.add(word2.charAt(i));
			}
			
			Collections.sort(myword1);
			Collections.sort(myword2);
			
			
			for (int j=0; j<myword1.size(); j++) {
				
				if (myword1.get(j)!=myword2.get(j)) {
					
						break;
					
				} else {
					
					isAnagram = true;
				}
					
			} 
			
			if (isAnagram) {
				
				System.out.println("Words are anagram");
			} else {
				
				System.out.println("Words are not anagram");
			}
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
	}

}
