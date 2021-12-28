package Interview;

public class StarPattern {
	



	public static void main(String[] args) {
		
		String s = "*";
		String starPattern ="";
		
		int count = 5;
				
		for (int i=1; i<=count; i++) {
						
			for (int j=1; j<=i; j++) {
				starPattern += "*";
				
			}
			starPattern += "\n";
		}
		
		System.out.println(starPattern);
		
		
		String star = "*";
		count = 4;
		
		String leftTriangle = "";
		
		
		for (int i=count; i>=1; i--) {
			
			for (int j=1; j<=i; j++) {
				
				leftTriangle += star;
			}
			leftTriangle += "\n";
		}
		
		System.out.println(leftTriangle);
		
		System.out.println(starPattern + leftTriangle );
		
		
	}
	
	
	
	

}
