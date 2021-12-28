package NaveenAutomationLabs;

public class RemoveJunkCharacter {
	
	public static void main(String[] args) {
		
		String junkString = "Java@##Java##50-9";
		
		String s = junkString.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(s);
		
	}

}
