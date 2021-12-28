package NaveenAutomationLabs;



public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Amit Jain";
		
		String reverse = "";
		
		int len = s.length();
		
		for(int i=len-1; i>=0 ; i--) {
			
			reverse += s.charAt(i);
			
		
		}
		
		System.out.println(reverse);
		
		System.out.println("using String Buffer");
		
		
		StringBuffer st = new StringBuffer(s);
		
		System.out.println(st.reverse());
		
	 
	}
	
	

}
