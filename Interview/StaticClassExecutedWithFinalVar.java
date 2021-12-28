package Interview;

public class StaticClassExecutedWithFinalVar {
	
	public static void main(String[] args) {
		
		System.out.println(Main.x);
		
	}

}

class Main {
	
	public static int x = 100;
	public int y = 200;
	
	static {
		
		System.out.println("Static block executed");
		
		Main check = new Main();
		System.out.println(check.y);
	}
}
