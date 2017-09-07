import java.util.*;

public class Q2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double area = 0.0;
		double rad = 0.0;
		
		
		while(true){
			System.out.print("Enter a radius for a circle: ");
			
			rad = sc.nextDouble();
			
			area = (Math.pow(rad, 2)) * Math.PI;
			
			System.out.println("The area of the Circle is: " + (area));
			
			System.out.print("To stop entering Data, type (z): ");
			char uInput = sc.next().charAt(0);
			
			//Condition to break out of loop
			if(uInput == 'z')
				break;
			
		}
		
		sc.close();

	}

}
