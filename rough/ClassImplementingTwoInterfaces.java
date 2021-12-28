package rough;

public class ClassImplementingTwoInterfaces implements CheckInterface,CheckInterfaceB  {

	@Override
	public void makeToys() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void makepeople() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printSomething() {
		// TODO Auto-generated method stub
		CheckInterface.super.printSomething();
	}

	
	static void printelse() {
		 
		 System.out.println("hello I am static method in an interface");
		 
	 }
	
	
}
