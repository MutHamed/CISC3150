package hw_2;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		
		//Any character that's not A-za-z
		in.useDelimiter("[^A-za-z]+");
		
		System.out.println("Type a sentence to tokenize");
		
		while(in.hasNext()){
			
			System.out.println("Your sentence: " + in.next());
			
		}
	
		// Close scanner
		in.close();

	}

}