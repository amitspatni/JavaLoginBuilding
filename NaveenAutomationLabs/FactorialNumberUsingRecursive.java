package NaveenAutomationLabs;

public class FactorialNumberUsingRecursive {
	
	public static void main(String[] args) {
		
		
	
		
		System.out.println(checkFact(10));
		
		
		
	}
	
	public static int checkFact(int number) {
		
				
		if (number==0) {
			
			return 1;
		} else {
			
			return (number * checkFact(number-1));
			
		}
		
	}
	
	
	
	public static int fibonacci(int number) {
		
		if (number<=1) {
			
			return 1;
		} else {
			
			return fibonacci(number-1) + fibonacci(number-2);
			
			
		}
		
	}
	
	public static int recursive(int number) {
		
		if (number==0) {
			return 1;
		} else {
			
			return (number * recursive(number-1));
		}
		
	}
	
	

}
