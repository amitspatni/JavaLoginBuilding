package NaveenAutomationLabs;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountNumberofDuplicateWords {
	
	public static void main(String[] args) {
		
		String s = "My name is Amit Jain My name is Amit";
		
		String[] s2 = s.split(" ");
		
		Map<String, Integer> maps = new HashMap<String, Integer>();
		
		for (String s1 : s2) {
			
			if (maps.containsKey(s1)) {
				
				maps.put(s1, maps.get(s1)+1);
			} else {
				
				maps.put(s1, 1);
			}
		}
		
		
		Set<String> myword = maps.keySet();
		
		for (String w: myword ) {
			
			if (maps.get(w)>1) {
				
				System.out.println( w + " " + maps.get(w));
			}
		}
		
		
		// count character in a given string
		
		 String str = "GeeksForGeeks";
		  
	        // Creating array and Storing the array
	        // returned by toCharArray()
	        char[] ch = str.toCharArray();
	  
	      
	        Map<Character, Integer> mapchar = new HashMap <Character, Integer>();
	        
	        
	        for(Character c : ch ) {
	        	
	        	if (!mapchar.containsKey(c)) {
	        		
	        		mapchar.put(c, 1); 	
	        	} else {
	        		
	        		mapchar.put(c, mapchar.get(c)+1);
	        		
	        	}
	        	
	        	
	        }
	        
	        Set<Character> sets = mapchar.keySet();
	        
	        for (Character w: sets) {
	        	
	        	if (mapchar.get(w)>1) {
	        		
	        		System.out.println(w + " : " + mapchar.get(w) );
	        		
	        	}
	        	
	        }
		
		
		
	}

}
