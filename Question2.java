package hw_2;


/*
 * I was only able to get this far
 */

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String[] months = {"January", "February", "March", "April", "May", "June", "July",
				"August", "September", "October", "November", "December"
		};
		
		String uInput = "";
		
		int day = 1;
		
		System.out.print("Which month do you want to dsiplay?: ");
		uInput = in.nextLine();
		
		// To print the month of May
		if(uInput.equals(months[1])){
		System.out.println(" Su Mo Tu We Th Fr Sa");
			for(day = 1; day <= 28; day ++){
			
				if(day < 10){
				System.out.print("  " + day);
				}
				else {
				System.out.print(" " + day);
				}
			
				// if day is divisible by 7 go to new line
				if( day%7 == 0){
				System.out.println();
				}
			}
		}
		
		// To print the months of April, June, September and November
		if(uInput.equals(months[3]) || uInput.equals(months[5]) || uInput.equals(months[8])
				|| uInput.equals(months[10])){
		System.out.println(" Su Mo Tu We Th Fr Sa");
			for(day = 1; day <= 30; day ++){
			
				if(day < 10){
				System.out.print("  " + day);
				}
				else {
				System.out.print(" " + day);
				}
			
				// if day is divisible by 7 go to new line
				if( day%7 == 0){
				System.out.println();
				}
			}
		}
		
		// Print the rest of the months
		if(uInput.equals(months[0]) || uInput.equals(months[2]) || uInput.equals(months[4])
				|| uInput.equals(months[6]) || uInput.equals(months[7]) || uInput.equals(months[9])
				|| uInput.equals(months[11])){
		System.out.println(" Su Mo Tu We Th Fr Sa");
			for(day = 1; day <= 31; day ++){
			
				if(day < 10){
				System.out.print("  " + day);
				}
				else {
				System.out.print(" " + day);
				}
			
				// if day is divisible by 7 go to new line
				if( day%7 == 0){
				System.out.println();
				}
			}
		}
		
		//close scanner
		in.close();
		
	}

}
