package Interview;

import java.util.Arrays;
import java.util.stream.Stream;

public class JoinTwoArraysUsingStreams {
	
	public static void main(String[] args) {
		
		String[] bowler = {"Amit", "Kuldeep", "Prasad", "Jaddu", "Bhuvi"};
		
		String[] batsman = {"Rohit", "Virat", "Hardik", "Rishab", "Yuvi"};
		
		
		Stream <String>  s1 = Arrays.stream(bowler);
		Stream <String>  s2 = Arrays.stream(batsman);
		
		String[] fullTeam = Stream.concat(s1, s2).toArray(e-> new String[e]);
		
		for (String s : fullTeam) {
			System.out.println(s);
			
			
		}
		
		
	}
	
	
	
	
	

}
