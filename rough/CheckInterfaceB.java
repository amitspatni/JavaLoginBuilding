package rough;

public interface CheckInterfaceB {
	
	default void printSomething() {
        System.out.println("I am inside A interface");
    }

	static void printelse() {
	 
	 System.out.println("hello I am static method in an interface");
	 
 }

}
