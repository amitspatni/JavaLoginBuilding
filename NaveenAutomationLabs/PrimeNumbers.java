package NaveenAutomationLabs;

public class PrimeNumbers {

	public static void main(String[] args) {
		
		int startNumber = 0;
		int stopNumber = 100;
		
		// find primeNumber from 1 to 100
		
		for (int i=startNumber; i<=stopNumber; i++ ) {
			
			if (isPrime(i)) {
				System.out.print(i + ", " );
				
				
			} 
		}
		
	}
	
	public static boolean isPrime(int number) {
		
		
		if (number<2) {
			
			return false;
		} else {
		
			for (int i=2; i<=number/2; i++) {
				
				if (number%i==0) {
					
					return false;
				}
			}
		
		return true;
		}
		
	}

}
