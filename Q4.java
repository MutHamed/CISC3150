import java.util.*;
import java.io.*;
public class Q4 {

        public static void main(String[] args)throws Exception {

                FileReader file = new FileReader("nums.txt");
                BufferedReader reader = new BufferedReader(file);

                String  nums = "";
                String line = reader.readLine();
                
                // Got this bit from a tutorial online
                while (line != null){
                        nums += line;
                        line = reader.readLine();
                }

                System.out.println(nums);
                
                file.close();
                reader.close();

        }

}
