package Array;
import java.util.Scanner;
public class Array4 {
 public static void main(String[]args) {
	 int array[]=new int[10];
	 int a,c=0;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the elements");
	 for(int i=0;i<10;i++)
	 {
		 a=sc.nextInt();
		 array[i]=a;
		 
	 }
	 System.out.println("Enter the element");
	 int b=sc.nextInt();
	 for(int i=0;i<10;i++)
	 {
		 c=0;
		 if(b==array[i])
		 {
			 c=1;
			 break;
		 }
		 }
	 if(c==1)
	 {
		 System.out.println("Element Found)");
	 }
	 else
	 {
		 System.out.println("Element Not Found)");
	 }
	 sc.close();
 }
}
