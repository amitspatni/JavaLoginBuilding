
public class StringContainsOnlyDigits {
	
	public static void main(String[] args) {
		
		String s1 = "";
		
		
		String replacement = s1.replaceAll("[^0-9]", "");
			
						
			if (s1.length() == replacement.length()) {
				
				System.out.println("String contains only digits");
			} else {
				
				System.out.println("String  does not contain only digits");
				
			}
			
			
		
		
		
			
			   
			
		
		
	}

}
