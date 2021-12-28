package NaveenAutomationLabs;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		
		System.out.println(ArmStrongNumber(81));
		
	}
	
	public static boolean ArmStrongNumber(int number) {
		
		int copyOfNumber = number;
		int Multiplied_number = 0;
		int singleNumber = 0;
		int testPow =0;
		
		
		while(number>0) {
			
			singleNumber = number%10;
			
			Multiplied_number += singleNumber*singleNumber*singleNumber;
			
			testPow+=Math.pow(singleNumber, 3);
			
			number = number/10;
			
		}
		
		System.out.println(Multiplied_number);
		System.out.println(testPow);
		
		if (Multiplied_number==copyOfNumber) {
		
			return true;
		} else {
			return false;
		}
		
		
		
		
	}

}
