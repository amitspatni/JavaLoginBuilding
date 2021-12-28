package Interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PrintDuplicateCharacterFromTheString {
	
	public static void main(String[] args) {
		
		
		printDuplicateCharacter("Narayanana");
		printDuplicateCharacter("Na");
		
		
		
		
	}
	
	public static void printDuplicateCharacter(String str) {
		
		if (str==null)
		{
			System.out.println("String is null");
			return;
		} else if (str.isEmpty()) {
			
			System.out.println("String is empty");
			return;
			
		} else if (str.length()==1)  {
			System.out.println("String length is 1 so no duplicate value is possible");
			return;
			
		}
		
		char[] charArray = str.toCharArray();
		
		Map<Character, Integer> hashmap = new HashMap<Character, Integer>();
		
		for (Character ch :charArray ) {
			
			if (hashmap.containsKey(ch)) {
				
				hashmap.put(ch, hashmap.get(ch)+1);
				
			} else {
				
				hashmap.put(ch, 1);
			}
		}
		
		

		
		Set<Map.Entry<Character, Integer>> entrySet  = hashmap.entrySet();
		
		for (Map.Entry<Character, Integer> entry: entrySet) {
			
			if (entry.getValue()>1) {
				
				System.out.println(entry.getKey() + ":" + entry.getValue());
			} else {
				
				System.out.println(entry.getKey() + ": is not a duplicate");
			}
			
		}
		
		
	}

}
