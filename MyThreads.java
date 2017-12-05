package hw_9;

public class MyThreads {
	
    public static void main(String[] args) {
        Runnable r = new Runnable1();
        Thread t = new Thread(r);
        Runnable r2 = new Runnable2();
        Thread t2 = new Thread(r2);
        Runnable r3 = new Runnable3();
        Thread t3 = new Thread(r3);
        Runnable r4 = new Runnable4();
        Thread t4 = new Thread(r4);
        
        t.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

class Runnable1 implements Runnable{
	String[] str1 = { "A", "E", "I", "M", "Q", "U", "Y"};
    public void run(){
        for(int i=0; i < str1.length; i++) {
            //System.out.println(str1[i]);
        }
    }
}

class Runnable2 extends Runnable1 implements Runnable{
	String[] str2 = { "B", "F", "J", "N", "R", "V", "Z"};
    public void run(){
        for(int i=0; i < str2.length; i++) {
        	//if(str1[0] == (str2[0]))
            System.out.println(str1[i] + "\n" + str2[i] + "\n");
        }
    }
}

class Runnable3 implements Runnable{
	String[] str3 = { "C", "G", "K", "O", "S", "W"};
    public void run(){
        for(int i=0; i < str3.length; i++) {
            //System.out.println(str3[i]);
        }
    }
}

class Runnable4 extends Runnable3 implements Runnable{
	String[] str4 = { "D", "H", "L", "P", "T", "X"};
	@Override
    public void run(){
        for(int i=0; i < str4.length; i++) {
            System.out.println(str3[i] + "\n" + str4[i] + "\n");
        }
    }
}
