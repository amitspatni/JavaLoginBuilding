package Interview;

public class AlphabetPattern {

	public static void main(String[] args) {
		
		int alpha = 65;
		
		///asc value of capital A = 65
		/// asc value of lower a = 97
		for (int i=0; i<=5; i++) {
			
			for (int j=0; j<=i; j++) {
				
				System.out.print((char)(alpha+j) + " ");
			}
		System.out.println(" ");
		}
			
		
				
			
		
		
	}
	
}



