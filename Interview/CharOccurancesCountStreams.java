package Interview;

public class CharOccurancesCountStreams {
	
	public static void main(String[] args) {
		
		
		System.out.println(getCharCount("amit Jain", 'a', 'i'));
		
	
			
	}
	
	public static long getCharCount(String str, char c1, char c2) {
		
		return str.chars().filter(e -> ((char) e) == c1 || ((char) e) == c2  ).count();
		
		
	}

}


