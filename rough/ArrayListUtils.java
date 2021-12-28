
package rough;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayListUtils {
	
	public static void main(String[] args) {
		
		
		ArrayList<String> myStringArray = new ArrayList<String>();
		ArrayList<String> secondString =  new ArrayList<String>(Arrays.asList("Charu", "Jain"));
		
		myStringArray.add("Amit");
		myStringArray.add(1,"Jain");
		
		//myStringArray.removeIf(e -> (e.equals("Amit")));
		
		
		
		
		Stream<String> str = myStringArray.stream().filter(e -> (e.equals("Jain")));
		
		
		
		
		
		

		
		
		
	}

}
