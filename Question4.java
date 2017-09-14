package hw_2;

import java.util.*;

public class Question4 {
	
	public static void main(String[] args){
		
		int x = 4282;
		for(int i=0;i<35;i++){
			System.out.printf("%d\t\t%32s\n",i,Integer.toBinaryString(x>>>i));
		}
		
		System.out.println("********\n");
		
		for(int i=0;i<35;i++){
			System.out.printf("%d\t\t%32s\n",i,Integer.toBinaryString(x));
			x = x >>> i;
		}

		
	}
}


/*
 * Not really sure, but for the second case, it must be because the unsigned shift
 * happens after the assignment. 
 * 
 */