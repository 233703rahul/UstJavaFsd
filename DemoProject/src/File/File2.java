package File;
import java.io.FileWriter;
public class File2 {

    public static void main(String[] args) {
	        try {
	            FileWriter myWriter = new FileWriter("example.txt");
	           
	            myWriter.write("Hello!!");
	            myWriter.write("\nWelcome to the Java ");

	          
	            myWriter.close();
	        } catch (Exception e) {
	            System.out.println(e);
	        }
	    }
	}

