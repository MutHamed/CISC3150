package hw_7;

import java.util.*;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		//System.out.println("Please enter your calculation:");
		
		int l = sc.nextInt();
        String op = sc.next();
        int r = sc.nextInt();
		
		Body obj = new Body();
		
		obj.set(l,op,r);
		System.out.println(obj.computeInt());
		
		sc.close();

	}

}

class Body {
	
	private int a;
	private int b;
	private String s;
	
	Body (){}
	
	public void set(int x, String op, int y){
		a = x;
		s = op;
		b = y;
		
	}
	
	public int computeInt(){
		
		int temp = 0;
		
		if(s.charAt(0) == '*'){
			temp = a * b;
		}
		
		if( s.charAt(0) == '/' && b != 0)
			temp = a / b;
		
		else if( s.charAt(0) == '/' && b == 0)
			System.out.println("Can not divide by 0!");
		
		
		if( s.charAt(0) == '+'){
			temp = a + b;
		}
		
		if( s.charAt(0) == '-'){
			temp = a - b;
		}
		
		return temp;
	}
	
	
} // end of class
