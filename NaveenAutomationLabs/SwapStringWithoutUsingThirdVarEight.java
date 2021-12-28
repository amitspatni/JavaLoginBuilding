package NaveenAutomationLabs;

public class SwapStringWithoutUsingThirdVarEight {
	
	
	public static void main(String[] args) {
		
		String s = "amit";
		String x = "Jain";
		
		s = s + x;
		x= s.replace(x, "");
		s = s.replace(x,"");
		
		System.out.println(x);
		System.out.println(s);
		
		
	}

}
