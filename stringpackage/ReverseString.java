package stringpackage;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String str = "My Name is Amit";
		String rev = "";
		
		
		int lenOfString = str.length();
		
		
		for (int i=lenOfString-1; i>=0; i--) {
			
			rev += str.charAt(i);
			
		}
		
		System.out.print(rev);
		
		
		
//		StringBuffer strb = new StringBuffer(str);
//		
//		System.out.print(strb.reverse());
//		
		
		
		
		
	}

}
