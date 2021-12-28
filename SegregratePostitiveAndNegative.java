import java.util.HashSet;
import java.util.Set;

public class SegregratePostitiveAndNegative {
	
	
	public static void main(String[] args) {
		
		int[] Array = {0, -1, 3,4,5,6, -2};
		
		Set<Integer> number = new HashSet<Integer>();
		
		
		
		for (int i=0; i<Array.length;  i++) {
			
			if (Array[i]<0) {
				
				number.add(Array[i]);
					
				
			}
			
		}
		
		for(int n: number) {
			
			System.out.println("negative number is " + n);
		}
		
		
		
	}

}
