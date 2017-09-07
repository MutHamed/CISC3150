import java.util.*;

public class Q5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//Initialize variables 
		double ax = 0.0, ay = 0.0, bx = 0.0, by = 0.0, cx = 0.0, cy = 0.0;
		double distab = 0.0, distbc = 0.0, distac = 0.0;
		
		System.out.println("Enter x and y values for A, B and C: ");
		
		System.out.println("Enter ax & ay: ");
		ax = input.nextDouble();
		ay = input.nextDouble();
		
		System.out.println("Enter bx & by: ");
		bx = input.nextDouble();
		by = input.nextDouble();
		
		System.out.println("Enter cx & cy: ");
		bx = input.nextDouble();
		by = input.nextDouble();
		
		// Calculate the length of each side using distance formula
		distab = Math.sqrt(Math.pow(bx-ax, 2) + Math.pow(by-ay, 2));
		distbc = Math.sqrt(Math.pow(cx-bx, 2) + Math.pow(cy-by, 2));
		distac = Math.sqrt(Math.pow(cx-ax, 2) + Math.pow(cy-ay, 2));
		
		System.out.println("The length of A-B is: " + distab);
		System.out.println("The length of B-C is: " + distbc);
		System.out.println("The length of A-C is: " + distac);
		
		// Check to see if the triangle is real or not
		if (distab + distbc > distac)
			System.out.println("It's a real triangle!\n");
		else System.out.println("It's not a triangle");
		
		input.close();

	}
	
}
