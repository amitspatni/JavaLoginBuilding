package rough;

public class KnowledgeTest {
	
	
	public int myIQ;
	public String myStr;
	public String myName;
	public static int var = 100;
	
		// static block
	static {
		
		System.out.println("Static block is executed");
		
	}
	
	// instance block
	
	{
		
		System.out.println("instance block is executed");
		
	}
	
	
	// Constructor chaining and Constructor Overloading
		public KnowledgeTest(int myIQ) {
			this.myIQ = myIQ;
			
		}
		
		public KnowledgeTest(int myIQ, String myStr ) {
				this(myIQ);
				this.myStr = myStr;
			
		}
		
		public KnowledgeTest(int myIQ, String myStr, String myName  ) {
			this(myIQ,myStr);
			this.myName = myName;	
		
	}
		
		

	public static void main(String[] args) {
		
		
		
		
		System.out.println("my test is done");
		
		KnowledgeTest know1 = new KnowledgeTest(12, "hello", "amit");
		know1.sayHello();
		
		
	}
	
	static public void main() {
		
		
	}
	
	public void sayHello() {
		
		System.out.println("Saying Hello inside non static method -  sayHello");
	}
	
	private static final void sayCheck() {
		
		System.out.println("Hello with no parameters");
	}
	
	private static final int sayCheck (int number) {
		
		System.out.println("Hello with int parameters");
		return 1;
		
	}
	
	
	protected final static void sayCheck(String n) {
		System.out.println("Hello with String Parameters ");
		
	}
}
