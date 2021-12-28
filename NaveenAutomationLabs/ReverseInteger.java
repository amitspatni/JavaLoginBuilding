package NaveenAutomationLabs;

public class ReverseInteger {
	
	public static void main(String[] args) {
		
		int s = 12334;
		int rev=0;
		
		
		while (s>0) {
			
			rev =  rev*10 +  s%10;
			s= s/10;
		}
		
		System.out.println(rev);
	}

}
