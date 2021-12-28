package NaveenAutomationLabs;

import java.util.stream.IntStream;

public class PrintHunderdWithoutLoops {
	
	public static void main(String[] args) {
	
		//printHundred(1);
		
//		printHundred(1,10);
		
		//using Streams
		IntStream.range(1, 501).forEach(e -> System.out.println(e));
		
	}
	
	public static void printHundred(int num) {
		
		
		if (num<=100) {
			
			System.out.println(num);
			num++;
			printHundred(num);
		}
		
		
	}
	public static void printHundred(int startnum, int endNum) {
		
			if (startnum<=endNum) {
				
				System.out.println(startnum);
				
				startnum++;
				
				printHundred(startnum,endNum);
				
			}
		
		
	}
	

}
