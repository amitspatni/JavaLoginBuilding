package stringpackage;

public class SwapStringWithoutThird {

	public static void main(String[] args) {
		
		String a = "Amit";
		String b = "Jain3";
		System.out.println("value of a is " + a);
		System.out.println("value of b is " + b);
		
		
		int lenOfA = a.length();
		int lenOfB = b.length();
		
		a = a + b;
		System.out.println(a);
		
		b = a.substring(0, lenOfA);
		System.out.println("value of b is " + b);
		
		a = a.substring(lenOfA);
		System.out.println("value of a is " + a);
		
		
		
		
		
		
		
		
		
	}
	
}
