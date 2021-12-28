package Interview;

public class UpsideDownTriangle {
	
	public static void main(String[] args) {
		
		String star = "*";
		int count = 5;
		
		String leftTriangle = "";
		
		
		for (int i=count; i>=1; i--) {
			
			for (int j=1; j<=i; j++) {
				
				leftTriangle += star;
			}
			leftTriangle += "\n";
		}
		
		System.out.println(leftTriangle);
		
	}

}
