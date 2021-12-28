
public class PrimeNumber {
	
	
	
	public static void main(String[] args) {
		
		int number = 21;
		boolean isPrime = true;
		
		if (number<=1) {
			
			isPrime = false;
		} else if (number ==2) {
			
			isPrime = true;
			
		} else {
		
		
		for (int i=2; i<=number/2; i++ ) {
			
			if(number%i==0) {
				isPrime= false;
				break;
					}
			
		}
		
		}
		
		if(isPrime) {
			
			System.out.println(number +  " is a prime Number");
			
		} else {
			
			System.out.println(number +  " NOT is a prime Number");
		}
		
	}

}
