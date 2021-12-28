

public class PerfectNumber {
	
	public static void main(String[] args) {
		
		int number = 8128;
		int perfectNumber=1;
		boolean flag = false;
		
		for (int i=2; i<=number/2; i++ ) {
				
				if (number%i==0) {
					
					perfectNumber += number/i; 
				}
				
			}
		
		
		
		flag = perfectNumber == number? true: false;
		
		System.out.print(flag);
			
		
			
			
			}
		
	

}
