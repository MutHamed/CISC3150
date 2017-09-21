package hw_3;

import java.util.*;

public class Driver {

	public static void main(String[] args) {
		
		char [] c = {'S','h','i','l','l','a'};
		MyString s = new MyString (c);
		
		// for string comparison
        char[] c2 = {'R','e','j','j','i','e'};
        MyString s2 = new MyString(c2);
		
		//System.out.println(s.PrintF() + "\n");
		
		// indexing
        System.out.print("MyString charAt: ");
        System.out.println(s.charAt(2)+ "\n");
        
        // substring
        System.out.print("The substring: ");
        s.substring(1,3).PrintF();
        System.out.println("\n");
        
       
        // toLowerCase
        System.out.print("MyString toLowerCase(): ");
        s2.toLowerCase().PrintF();
        System.out.println("\n");
        
        
        // toUpperCase
        System.out.print("MyString toUpperCase(): ");
        s.toUpperCase().PrintF();
        System.out.println("\n");
        
 
        // string comparison
        System.out.println("Comparing string s to it self: ");
        System.out.println(s.equals(s) + "\n");
        
        System.out.println("Comparing string s to it s2: ");
        System.out.println(s.equals(s2) + "\n");
        
        
        // Convert integer to string
        System.out.println("Converting integer to string: ");
        MyString.valueOf(5).PrintF();
        System.out.print("\n");

		
		
	}

}
