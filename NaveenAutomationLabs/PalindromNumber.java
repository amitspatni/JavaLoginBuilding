package NaveenAutomationLabs;

public class PalindromNumber {
	
	public static void main(String[] args) {
		
		System.out.println(isPalindrome(-151));
		
	}
	
	public static boolean isPalindrome(int number) {
		
		int reverseNumber = 0;
		int initialNumber = number;
		
		while(number!=0) {
			
			reverseNumber = reverseNumber*10 + number%10;
			number = number/10;
			
		}
		
		if (initialNumber == reverseNumber) {
			return true;
		} else {
			return false;
		}
		
		
	}

	
}
