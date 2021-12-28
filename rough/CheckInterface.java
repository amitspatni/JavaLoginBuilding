package rough;

public interface CheckInterface {
	
	int checking = 100;
	
	
	public void makeToys();
	
	public void makepeople();
	
	
	 default void printSomething() {
	        System.out.println("I am inside A interface");
	    }
	
	 static void printelse() {
		 
		 System.out.println("hello I am static method in an interface");
		 
	 }
	

}
