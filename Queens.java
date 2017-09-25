package day3;

import java.util.*;

public class Queens{
	
    public static boolean checkQueen(int[] q, int n){
    	
        for (int i = 0; i < n; i++){
        	//check to see if in same column
            if (q[i] == q[n])             
            	return false;  
        }
        
        return true;
    }
    
    public static void printQ(int[] q){
    	
        int a = q.length;
        
        for (int i = 0; i < a; i++){
        	
            for (int j = 0; j < a; j++){
            	
                if (q[i] == j) 
                	System.out.print("Q ");
                else           
                	System.out.print("* ");
            }
            
            System.out.println();
        } 
        
        System.out.println();
    }
    
    public static void nQueens(int s){
        int[] a = new int[s];
        nQueens(a, 0);
    }
    
    public static void nQueens(int[] q, int n){
    	
        int a = q.length;
        if (n == a) 
        	printQ(q);
        
        else
            {
        	
            	for (int i = 0; i < a; i++){
            		q[n] = i;
            		if (checkQueen(q, n)) nQueens(q, n+1);
            	}
        }
    } 
    
    
    public static void main(String args[]){
    	
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter number of Queens: ");
        int r = in.nextInt();
        nQueens(r);
        
        // close Scanner
        in.close();
    }
}