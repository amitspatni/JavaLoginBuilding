package NaveenAutomationLabs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class DifferentWaysOfIteratingThroughArrayList {
	
		public static void main(String[] args) {
			
			
			ArrayList<String> myArray = new ArrayList<String>(Arrays.asList("Java", "Python", "C$"));
			
			
			//1st ways of iterating - for enhanced Loop
//			for (String s :myArray ) {
//				
//				System.out.println(s);
//			}
			
			
			//2nd way of iterating - using for loop
//			for (int i=0; i<myArray.size(); i++) {
//				
//				System.out.println(myArray.get(i));
//			}
			
			
			//3rd of iterating //  using streams
//			myArray.stream().forEach(e -> System.out.println(e));
			
			
			// 4th using lambada experssion
//			myArray.forEach(e -> System.out.println(e));
			
			// 5th using Iterator
			
			Iterator<String> iterate = myArray.iterator();
			
			while(iterate.hasNext()) {
				
				System.out.println(iterate.next());
			}
			
			
		}

}
