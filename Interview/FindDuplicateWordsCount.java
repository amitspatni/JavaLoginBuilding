package Interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class FindDuplicateWordsCount {
	
	
	public static void main(String[] args) {
		
		ArrayList<String> strArray = new ArrayList<String>();
			
		String a = "Narayanana";
		
		for (int i=0; i<a.length(); i++) {
			
		String b =	a.substring(i, i+1);
			
			strArray.add(b);
			
		}
		
		Map<String, Integer> wordCount = new HashMap<String, Integer>();
		
			for (String bchild: strArray) {
				
				if(wordCount.containsKey(bchild.toLowerCase())) {
					
					wordCount.put(bchild,wordCount.get(bchild)+1 );
					
				} else {
					
					wordCount.put(bchild.toLowerCase(),1 );
				}
			}
			
			Set<String> wordsInString = wordCount.keySet();
			
			for (String w: wordsInString) {
				
				if (wordCount.get(w)>1) {
					System.out.println( w + ": "  + wordCount.get(w));
				}
			}
			
			
		
		
	}
	
		

}
