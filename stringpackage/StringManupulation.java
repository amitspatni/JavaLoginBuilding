package stringpackage;

public class StringManupulation {
	
	public static void main(String[] args) {
		String str = " My Name is Amit Jain & Amit Jain ";
		
		
 

		//  to get the substring	
		String subs = str.substring(1, 5);
		System.out.println("Getting the substring using index positions "  + subs);
		System.out.println("***************");
		
		// to search whether given string is present in the string 

		
		String searchString = "Amit";	
		System.out.println(str.contains("whether Amit contains in the searchstring " + searchString));
		System.out.println("***************");
		
		// to check the index of the string
				
		int check = str.indexOf("Amit", 1);
		System.out.println("first index of Amit " + check);
		System.out.println("***************");
		
		// to check the last index of the string
		
		int lastCheck = str.lastIndexOf("Amit");
		
		System.out.println("last index of Amit " + lastCheck);
		System.out.println("***************");
		
		// to check whether end of the string has given string
		 boolean isTrue =  str.endsWith("Jain");
		 System.out.println("to check whether string ends with Jain " +  isTrue);
		 System.out.println("***************");
		 
		 // to remove leading and trailing space
		System.out.println(str.strip());
		System.out.println("Trim the leading and trailing space");
		System.out.println("***************");
		
		
		String garbageCharacter = "Amit Jain #3434####";
		
		String nonGarbage = garbageCharacter.replaceAll("[^a-zA-Z0-9]", " ");
		
		System.out.println(nonGarbage);
		
		
		
		
	}
	
	public static String[] stringSplit(String s) {
		

		
		String[] str = s.split(" ");
		
		
		for (int i=0; i<str.length; i++) {
			
			System.out.println(str[i]);
		}
		
		return str;
		
	}
	
	public static void getSubString(String searchString, String str) {
		
		// get the substring from the String
		
		
		
		
		
		
		
		
	}

}
