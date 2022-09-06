package Array;
import java.util.Scanner;
public class Array2 {
	public static void main(String[] args) {
		int [] arr = new int []{1,2,3,4,5};
		int i,sum=0;
		for(i=0;i<arr.length;i++)
		{
			sum=sum+ arr[i];
		}
		System.out.println("Sum is "+sum);
	}

}
