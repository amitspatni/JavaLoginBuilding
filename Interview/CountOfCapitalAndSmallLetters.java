package Interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountOfCapitalAndSmallLetters {

	public static void main(String[] args) {
		
		String str = "ABCDefABCD";
		int smallcunt = 0;
		int capcount = 0;
		
		Map<String, Integer> smallMaps = new HashMap<String, Integer>();
		Map<String, Integer> capMaps = new HashMap<String, Integer>();
		
		
		for (int i=0; i<str.length(); i++) {
	
						
			String s = String.valueOf(str.charAt(i));
			
			if (s.matches("[A-Z]")==true) {
			
				if (capMaps.get(s)== null) {
					
					capMaps.put(s, 1);
					
				} else {
					
					capMaps.put(s, capMaps.get(s)+1);
					
				}
							
				
			} else {
				
					if (smallMaps.get(s)==null) {
					
						smallMaps.put(s, 1);
					
				} else {
					
					smallMaps.put(s, smallMaps.get(s)+1);
					
			}
			
		}
		
		}
		
		Set<String> sets = capMaps.keySet();
		
		for (String s : sets) {
			
			System.out.println( s + " Count is " + capMaps.get(s));
			
		}
		
		 
	        
	        

	}

}
