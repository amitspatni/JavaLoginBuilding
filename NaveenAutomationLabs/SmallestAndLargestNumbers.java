package NaveenAutomationLabs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SmallestAndLargestNumbers {
	
	public static void main(String[] args) {
		
		
		
		ArrayList<Integer> ArrayLists = new ArrayList<Integer>(Arrays.asList(1,2,3,5,9,0));
	
	
		Collections.sort(ArrayLists);
		
		int length = ArrayLists.size();
		
		System.out.println(ArrayLists.get(0));
		System.out.println(ArrayLists.get(length-1));
		
		int[] myarray = {1,2,3,45,9,-1};
		int arraylength = myarray.length;
		
		int largest = 0;
		int smallest = 0;
		
		for(int i=0; i<arraylength; i++) {
			
			if (largest<myarray[i]) {
				
				largest = myarray[i];
			} else if (smallest>myarray[i]) {
				
				smallest = myarray[i];
				
				
			}
			
			
			
		}
		
		System.out.println(largest + " is the largest");
		System.out.println(smallest + " is the smallest");
		System.out.println(Arrays.toString(myarray));
		
		
		
		
	}

}
