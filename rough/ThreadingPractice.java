package rough;

public class ThreadingPractice {
	
	public static void main(String[] args) {
		
		
		
		int i= 3;
		int  j= 5;
		
		try {
			
			if (i/j<1) {
				
				throw new LogicException("this is not possible");
			}
			
			
		}
		catch (LogicException e) {
			
			System.out.println(e.getMessage());
		}
		
		
		
	}

}
