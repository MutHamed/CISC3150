
import java.util.*;

public class Q3 {

	public static void main(String[] args) {
		
		//Initialize String array for name of Months
		String [] nm = {" ", "January", "February", "March", "April", "May", "June",
				"July", "August", "September", "October", "November", "December"};
		
		// random # generator
		Random rand = new Random();
		
		int randNum = rand.nextInt(12) + 1;
		
		System.out.print(randNum + ": ");
		
		System.out.print(nm[randNum]);
		
		
		
		/*
		if(randNum == 1)
			System.out.println(nm[0]);
		else if (randNum == 2)
			System.out.println(nm[1]);
		else if (randNum == 3)
			System.out.println(nm[2]);
		else if (randNum == 4)
			System.out.println(nm[3]);
		else if (randNum == 5)
			System.out.println(nm[4]);
		else if (randNum == 6)
			System.out.println(nm[5]);
		else if (randNum == 7)
			System.out.println(nm[6]);
		else if (randNum == 8)
			System.out.println(nm[7]);
		else if (randNum == 9)
			System.out.println(nm[8]);
		else if (randNum == 10)
			System.out.println(nm[9]);
		else if (randNum == 11)
			System.out.println(nm[10]);
		else if (randNum == 12)
			System.out.println(nm[11]);
			*/

	}

}
