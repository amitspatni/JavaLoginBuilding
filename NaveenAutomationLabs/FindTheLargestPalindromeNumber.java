package NaveenAutomationLabs;

import java.util.ArrayList;

public class FindTheLargestPalindromeNumber {
	
	
	public static void main(String[] args) {
		
	String str = "13243 mike testing 2332 121";
		
		String splitstr = str.replaceAll("[^0-9 ]", "");
		String[] StrArray = splitstr.split(" ");
		
		ArrayList<Integer> arraylist = new ArrayList<>();
		ArrayList<Integer> largest = new ArrayList<>();
				
		for (int i=0; i<StrArray.length; i++) {
			
			if (isNumber(StrArray[i])==true) {
				
				int  num = Integer.parseInt(StrArray[i]);
							
					
					arraylist.add(num);
				    
			}
			
		}
		
		for (int n: arraylist) {
			
		 if (isPalindrome(n)==true) {
			
				
			 
			 
		 }
		}
		
		
		
		
	}
	
	public static boolean isNumber(String str) {
				
		try {
		
		 Integer.valueOf(str);
		
		return true;
		
		}
		
		catch (NumberFormatException e) {
			
			return false;
		}
		
		
		
		
	}
	
	public static boolean isPalindrome(int num) {
		
		int copyNumber = num;
		int rev = 0;
		
		while(num>0) {
			
			rev = rev*10 + num%10;
			num = num/10;
		}
		
				
		if (rev==copyNumber) {
			
			return true;
		} else {
			
			return false;
		}
		
		
		
	}
	
	

}
