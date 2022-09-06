package Array;
import java.util.Scanner;

public class Array1 {
	public static void main(String[] args)
	{
		int n,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Total numbers");
		n=sc.nextInt();
		int[] array = new int[10];
		System.out.println("Enter Elements ");
		for (i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
			
		}
		System.out.println("Elements are");
		for ( i=0;i<n;i++)
		{
			System.out.println(array[i]);
		}
	}

}
