package hw_3;

public class MyString {
	
	 char [] carra;
	 
	 
	 public void Mystring (String st){};
	
	 //clone the array
	 public MyString (char[] chars) {
		 
		 this.carra = new char[chars.length];
	     System.arraycopy(chars, 0, this.carra, 0, chars.length);
	 }

	// To string Method 
	/* 
	public String toString(String s){
		
		String my_str = new String();
		
		for(int i=0; i <s.length(); i++){
			my_str +=s.charAt(i);
		}
		
		return my_str;
	}*/
	
	 // print array
	public MyString PrintF (){
		for(int i = 0; i < this.length(); i++) {
            System.out.print(this.carra[i]);
        }
		
		return this;
	}
	
	// Indexing the array
	public char charAt(int index){
		
		return this.carra[index];
	}
	
	//substring
	public MyString substring(int begin, int end){
		
		char[] substring = new char[end-begin];
        
        for(int i = begin; i < end; i++) {
            substring[i-begin] = this.charAt(i);
        }
        
        return new MyString(substring);
	}
	
	public MyString toLowerCase(){
		for(int i = 0; i < this.length(); i++) {
            this.carra[i] = Character.toLowerCase(this.carra[i]);
        }
        
        return this;
	}
	
	//toUppercase
	public MyString toUpperCase(){
		for(int i = 0; i < this.length(); i++) {
            this.carra[i] = Character.toUpperCase(this.carra[i]);
        }
        
        return this;
	}
	
	// Compare strings' length
	public boolean equals(MyString s){
		
		if(this.length() != s.length()) {
            return false;
        }
        
        for(int i = 0; i < this.length(); i++) {
            if(this.charAt(i) != s.charAt(i)) {
                return false;
            }
        }
        
        return true;
	}
	
	/*
	public MyString getMyString();
	*/
	
	// valueOff method
	public static MyString valueOf(int i){
		
		return new MyString(Integer.toString(i).toCharArray());
	}
	
	
	//return length of array
	public int length() {
		
		return this.carra.length;
	}

}
