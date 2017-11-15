package hw_8;
import java.io.*;
import java.util.*;

public class Fileclass {
	
	private Formatter fRead;
	
	public void openFile(){
		try{
			fRead = new Formatter("dir_tree.txt");
		}
		catch(Exception e){
			System.out.println("Error");;
		}
	}
	
	@SuppressWarnings("resource")
	public void getDir(){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a Directory path:");
		String path = in.nextLine();
		
		File file = new File(path);
		
		if(!file.exists()){
			System.out.println("Path doesn't exist.");
			return;
		}
		
		if(!file.isDirectory()){
			System.out.println("Start with a directory not a file.");
			return;
		}
		
		String[] files = file.list();
		for(String string: files){
			System.out.println(string);
			fRead.format(string + "\n");
		}
		
		in.close();
	
	}
	
	public void closeFile(){
		fRead.close();
	}
}//end of class
