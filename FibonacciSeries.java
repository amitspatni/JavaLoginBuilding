
public class FibonacciSeries {
	
	public static void main(String[] args) {
		
		
		int firstNumber = 0;
		int secondNumber = 1;
		
		int fibonacciNumber=0;
		
		int endRange = 2;
		
		if (endRange==0) {
			fibonacciNumber = 0;
			System.out.println(fibonacciNumber);
			
			
		} else if ((endRange==1) ||(endRange==2)) {
			
			fibonacciNumber =1;
			System.out.println(fibonacciNumber);
		}
		else {
			
			for (int i=2; i<endRange; i++) {
				
				fibonacciNumber = firstNumber + secondNumber;
				System.out.println(fibonacciNumber);
				
				firstNumber = secondNumber;
				secondNumber = fibonacciNumber;
				
			}
			
			
		}
		
		
		
}

}
