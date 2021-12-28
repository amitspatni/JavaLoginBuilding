package NaveenAutomationLabs;

public class IntegerCaching {
	
	public static void main(String[] args) {
		
		
		Integer i= 190;
		Integer j = 190;
		
		if (i==j) {
			System.out.println("True");
		} else {
			System.out.println("false"); // Programme will print false because of Integer caching
			// caching range is -128 to 127
		}
		
		
	 int k= 190;
	 int l = 190;
		
		if (i==j) {
			System.out.println("True"); // programme will print true because data type is primitive int and
			// integer caching is not getting applied
		} else {
			System.out.println("false"); // 
		}
	}

}
