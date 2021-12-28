package stringpackage;

public class RemoveGarbageValue {
	
	public static void main(String[] args) {
		
	String str = "My Name is Amit@gmail####";
	
	str = str.replaceAll("[^a-zA-Z0-9]", "");
	
	System.out.print(str);
	
		
		
		
		
	}

}
