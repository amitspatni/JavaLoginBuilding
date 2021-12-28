package NaveenAutomationLabs;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(perfectNumber(28));
		System.out.println(perfectNumber(2));
		System.out.println(perfectNumber(6));
		System.out.println(perfectNumber(30));

	}
	
	public static boolean perfectNumber(int number) {
		
		int remainder = 0;
	
		for (int i=1; i<=number/2; i++) {
			
			if (number%i==0) {
				
				remainder += i;
				
			}
		}
		
		if (remainder==number) {
			return true;
		} else {
			return false;
		}
		
		
	}
	

}
