
public class FactorialNumber {
	
	public static void main(String[] args) {
	
		int fact=1;
		int number =10;
		
		for ( int i=1; i<=number; i++ ) {
			
			fact *=  i;
			
		}
		System.out.println("Factorial of "+number+" is: "+fact); 
		
			
	}
	
	public static void exceptionTest() {
		
		try{    
            int a[]=new int[5];    
            a[5]=30/0;    
           }    
           catch(ArithmeticException e)  
              {  
               System.out.println("Arithmetic Exception occurs");  
              }    
           catch(ArrayIndexOutOfBoundsException e)  
              {  
               System.out.println("ArrayIndexOutOfBounds Exception occurs");  
              }    
           catch(Exception e)  
              {  
               System.out.println("Parent Exception occurs");  
              }             
		
	}
	
	
	
	

}
