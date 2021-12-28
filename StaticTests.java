public class StaticTests {
	
	public static void main(String[] args) {
		Car stat1 =new Car();
		Car stat2 =new Car();
		Car stat3 =new Car();
		
		stat1.printNumberOfCars();
		stat2.printNumberOfCars();
		stat3.printNumberOfCars();
		
		
	}
	
}







class Car {
	
	static int count;
	int numofcar;
	
	
	Car() {
		
		count++;
		numofcar = count;
	}
	
	public void printNumberOfCars() {
		
		System.out.print(numofcar);
	}

}


