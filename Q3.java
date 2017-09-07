
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

	}

}
