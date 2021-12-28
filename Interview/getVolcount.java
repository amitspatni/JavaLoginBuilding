package Interview;

public class getVolcount {
	
	public static void main(String[] args) {
		
		String vowel = "aeiou";
		int cnt = 0;
		
				
		for (int i=0; i<vowel.length(); i++) {
			
			if (isVowel(vowel.toLowerCase().charAt(i)) == true) {
				
				cnt++;
			}
			
		}
		
		System.out.println(cnt);
		
		
	}
	
	public static boolean isVowel(char c) {
		
		return c=='a'|| c =='e'|| c=='i'|| c=='o'||c=='u';
		
		
	}

}
