
public class PalindromeNumber {
	
	public static void main(String[] args) {
		
		int number = 78609;
		int palindromeNumber = 0;
		
		
		
		while (number!=0) {
			
			 			
			palindromeNumber = palindromeNumber*10 + number%10;
			
			number = number/10;
			}
		
		System.out.println(palindromeNumber);
//		PalindromeNumber pn = new PalindromeNumber();
//		
//		pn.reverseNumber(number);
//		
		}
	
	
	
	
	public void reverseNumber(int num) {
		
		int reversedNumber = 0;
		
		while(num!=0) {
			
			reversedNumber  = reversedNumber*10 + num%10;
			
			num = num/10;
		}
		
		System.out.print(reversedNumber);
		
		
	}
	

}
