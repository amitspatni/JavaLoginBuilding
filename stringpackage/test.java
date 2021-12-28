package stringpackage;

public class test {
	
	
	public static void main(String[] args) {
		
		System.out.println();
		
		Boolean b =  anagramWord("Keep", "Peek");
		
		System.out.print(b);
	}
		
	

	
	
	public static Boolean anagramWord(String word1, String word2) {
	    
	    String str = word1;
	    String reverse = "";
	    
	    for (int i=str.length()-1; i>=0; i--) {
	        
	        reverse += str.charAt(i);
	        
	        
	    }
	    if (reverse.equals(word2)) {
	    	
	    	System.out.println(reverse);
	    	return true;
	    	
	    }
	    
	    	System.out.println(reverse);
	    return false;
	    

}
}

