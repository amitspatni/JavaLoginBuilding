package NaveenAutomationLabs;

public class LargestAndSmallestNumberInArraySix {
	
	public static void main(String[] args) {
		
		int [] myIntArray = {10,10};
		
		int largest = myIntArray[0];
		int smallest = myIntArray[0];
		
		for (int i=1; i<myIntArray.length; i++) {
			
			if (myIntArray[i]>largest) {
				largest = myIntArray[i];
			} else if (myIntArray[i]<smallest) {
				smallest = myIntArray[i];
				
			}
		}
		
		System.out.println(largest);
		System.out.println(smallest);
		
	}

}
