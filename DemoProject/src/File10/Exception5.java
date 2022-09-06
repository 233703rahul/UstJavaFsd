package File10;
//i/o exception
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Exception5 {
	public static void main(String [] args) {
		try {
			File fp=new File("t.txt");
			FileInputStream stream=new FileInputStream(fp);
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
