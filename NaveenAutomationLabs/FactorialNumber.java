package NaveenAutomationLabs;

public class FactorialNumber {

	
	public static void main(String[] args) {
		
		System.out.println(factorial(4));
		System.out.println(fact(4));
		

		System.out.println(factorial(10));
		System.out.println(fact(10));
		
		System.out.println(factorial(1));
		System.out.println(fact(1));
		
		System.out.println(factorial(0));
		System.out.println(fact(0));
		
	}
	
	public static int factorial(int number) {
		
		int factorial =1 ;
		if (number == 0) {
			
			return factorial;
		} else {
			
			for (int i=1; i<=number; i++) {
				
				factorial *= i;
				
			}
			
			return factorial;
		}
		

		
		
	}
	
	public static int fact(int number) {
		
		
		if (number==0|| number==1) {
			
			return 1;
		} else {
			
			return (number * fact(number-1));
			
		}
		
	}
	
}
