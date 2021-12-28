package NaveenAutomationLabs;

public class RemoveJunkCharacterTwo {
	
	public static void main(String[] args) {
		
		String str = "A#$%@$BSDSD09923@#$";
		
		String freshString ="";
		
		freshString = str.replaceAll("[^A-Za-z0-9]", "");
		
		System.out.println(freshString);
		
	}

}
