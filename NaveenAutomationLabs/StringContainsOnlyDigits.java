package NaveenAutomationLabs;

public class StringContainsOnlyDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "-123433";
		
			try {
				
				int in = Integer.parseInt(s);
				System.out.println("String contains numbers only and number is " + in);
				
				
			} catch (NumberFormatException e) {
				
				System.out.println(e.getStackTrace());
				
			} finally {
				
				System.out.println("this works");
			}
		

	}

}
