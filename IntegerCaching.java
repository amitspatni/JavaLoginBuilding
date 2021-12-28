
public class IntegerCaching {
	
	public static void main(String[] args) {
		
		Integer one = 100;
		Integer two = 100;
				
		//integer caching from -128 to 127
				if (one==two) {
					
					System.out.println("Both are equal");
					// this will be printed
					
				} else {
					System.out.println("Both are not equal");
				}
				
				Integer ones = 200;
				Integer twos = 200;
						
						if (ones==twos) {
							
							System.out.println("Both are equal");
							// this will be printed
							
						} else {
							System.out.println("Both are not equal");
							// this will be printed
						}
		
		
	}

}
