package NaveenAutomationLabs;

public class DuplicateElementsinArray {
	
	
	public static void main(String[] args) {
		
		String[] array = {"amit", "jain", "amit", "jain"};
		
		for (int i=0; i<array.length; i++) {
			
			for (int j=i+1; j<array.length; j++) {
				
				if (array[i].equals(array[j])) {
					
					System.out.println(array[i] + " is a duplicate");
				}
			}
		}
		
	}

}
