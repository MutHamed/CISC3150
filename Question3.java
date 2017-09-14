package hw_2;

import java.util.*;

public class Question3 {

	 public static void main(String args[])
	   {
	      String str, strCopy = "";
	      int length, i;
	      
	      Scanner sInput = new Scanner(System.in);
	 
	      System.out.println("Enter a word to check if it is a palindrome:");
	      str = sInput.nextLine();
	 
	      length = str.length();
	 
	      for ( i = length - 1; i >= 0; i-- )
	         strCopy = strCopy + str.charAt(i);
	      // Does not account for capital letters
	      if (str.equals(strCopy))
	         System.out.println("A palindrome.");
	      else
	         System.out.println("Not a palindrome.");
	      
	      // Close scanner
	      sInput.close();
	 
	   }
	}	