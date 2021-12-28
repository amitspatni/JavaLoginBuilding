package NaveenAutomationLabs;

public class ReverseAStringOne {
	
	public static void main(String[] args) {
		
		String str = "amit Jain";
		String reversed = "";
		
		
		// 1st method
		for (int i=str.length()-1; i>=0; i--) {
			
			reversed += str.charAt(i);
				
		}
		
		System.out.println(reversed);
		
		//2nd method
		
		StringBuilder strBr = new StringBuilder(str);
		
		System.out.println(strBr.reverse());
		
		
	}

}
