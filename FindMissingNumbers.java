

public class FindMissingNumbers {
	
	public static void main(String[] args) {
		
		int[] myIntArray = {1,2,3,4,5};
		
		int[] myIntMissingArray = {1,2,4,5};
		
		int add = 0;
		int myadd = 0;
		
		for (int i=0;i<myIntArray.length;i++ ) {
			
			add += myIntArray[i];
			
			
		}
		
		for (int j=0;j<myIntMissingArray.length;j++ ) {
			
			myadd += myIntMissingArray[j];
			
			
		}
		
		int missingNumber = add-myadd;
		
		System.out.println(missingNumber);
		
		
		
		
 		
	}

}
