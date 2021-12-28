package NaveenAutomationLabs;

public class MissingNumberInArrayFour {
	
	public static void main(String[] args) {
		
		int[] myIntArray = {1,3,4,5};
		int[] secondArray = {1,2,3,4,5};
		
		
		int TotalofmyIntArray = 0;
		int TotalofsecondArray = 0;
		int missingNumber = 0;
		
		
		for (int i=0; i<myIntArray.length; i++) {
			
			TotalofmyIntArray += myIntArray[i];
		}
		
		for (int i=0; i<secondArray.length; i++) {
			
			TotalofsecondArray += secondArray[i];
		}
		
		missingNumber = TotalofmyIntArray - TotalofsecondArray;
		
		System.out.println(missingNumber);
		
		
		
	}

}
