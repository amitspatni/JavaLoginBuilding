
public class FactorialWithRecursive {
	
	public static void main(String[] args) {
		
		System.out.println("Hello");
		
		
		System.out.println(factorial(0));
		System.out.println(factorial(1));
		System.out.println(factorial(5));
		System.out.println(factorial(10));
		
		System.out.println("************");
		
		System.out.println(nonrecursive(1));
		System.out.println(nonrecursive(5));
		System.out.println(nonrecursive(10));
		
	}
	
	
	public static int nonrecursive(int number) {
		
		int fact = 1;
		
		if (number==0) {
			return 1;
			
		} else {
			
			for(int i=1; i<=number; i++) {
				
				fact = fact * i;
				
			}
			return fact;
			
			
		}
			
		
	}
	
	
	public static int factorial(int number) {
		
		if (number==0) {
			
			return 1;
		}
		
		else 
		{
			
			return number = number *  factorial(number-1);
			
		}
		
		
	}

}
