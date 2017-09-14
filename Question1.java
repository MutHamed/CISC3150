package hw_2;

import java.util.*;

public class Question1 {

	public static void main(String[] args){
		
		int numOfrows, rowCount = 1;
		
        Scanner sc = new Scanner(System.in);
  
        System.out.println("How tall of a pyramid do you want?");
 
         numOfrows = sc.nextInt();
 
        System.out.println("Here Is Your Pyramid");
 
        //Friend helped with the logic behind this
        for (int i = numOfrows; i > 0; i--){
        	
           
            for (int j = 1; j <= i*2; j++){
                System.out.print(" ");
            }
 
            
            for (int j = 1; j <= rowCount; j++){
                System.out.print(j+" ");
            }
 
            for (int j = rowCount-1; j >= 1; j--){                 
                System.out.print(j+" ");             
            }                          
             
            System.out.println();
 
          
            rowCount++;
        }
        
        sc.close();
    }
}
