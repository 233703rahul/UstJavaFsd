package aa;
import java.util.Scanner;

public class Binarypattern {
public static void main(String args[]) {
	int i,j,rows;
	int count=1;
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter the rows");
		rows = scan.nextInt();
		for(i=rows;i>0;i--) {
			for(j=1;j<i;j++) {
				if(j%2==1) {
					System.out.print("1");
				}
				else {
					System.out.print("0");
				}
			}
			System.out.println();
		}
}
}
