package hw_5;

public class MonteCarlo {

	public static void main(String[] args) {
		
		int ta = 0;
		int su = 0;
		
		mCarlo obj = new mCarlo();
		
		obj.set(ta, su);
		
		System.out.println("The Outcome: Pi/4 = " + obj.get());
		System.out.println("The Outcome: Pi = " + 4*obj.get());

	}

}


class mCarlo {
	
	private int target;
	private int s;
	
	
	private double xcoor, ycoor;
	
	mCarlo(){}
	
	public void set(int ta, int su){
		
		target = ta;
		s = su;
	}
	
	
	private double calcArea(){
		
		//Algo found online via tutorial
		for(int i = 0 ; i < 40000000; i++){
			
			xcoor = Math.random();
			ycoor = Math.random();
			
			target++;
			
			if (xcoor*xcoor + ycoor*ycoor <= 1)
				s++;
		}
		
		return (double)s/(double)target;
		
	}
		
	
	public double get(){
		
		double temp;
		
		temp = calcArea();
		
		return temp;
		
	}
		
}
