package Array;
import java.util.Scanner;
public class Array3 {
	public static void main(String[] args) {
		int numbers[] = new int[] {18,45,89,43,77,20,87};
		int smallest=numbers[0];
		int largest=numbers[0];
		for (int i =1;i<numbers.length;i++) {
			if (numbers[i]>largest) 
				largest = numbers[i];
				else if (numbers[i]< smallest) 
					smallest = numbers[i];
				
			}
		System.out.println("Largest is "+largest);
		System.out.println("Smallest is "+ smallest);
			
		}
	}


