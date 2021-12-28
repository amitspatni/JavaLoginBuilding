package NaveenAutomationLabs;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		
		for (int i=0; i<=10; i++) {
			
			System.out.print(fibo(i) + ",");
		}
		
	}
	
	public static int fibo(int number) {
		
		if (number<=1) {
			return number;
		} else {
			
			return fibo(number-1) + fibo(number-2);
		}
		
	}

}
