package Hackathon1;
import java.util.Scanner; 
public class SwapBit {
 
	public static void main(String args[])  
	{  
	int a, b;  
	Scanner scanner = new Scanner(System.in);  
	System.out.print("Enter first number to be swapped ");  
	a = scanner.nextInt();  
	System.out.print("Enter  second number to be swapped ");  
	b = scanner.nextInt();  
	System.out.println("Before swapping is ");  
	System.out.println("a = " +a +", b = " +b);  
	a = a ^ b;  
	b = a ^ b;  
	a = a ^ b;  
	System.out.println("After swapping is");  
	System.out.print("a = " +a +", b = " +b);  
	}  
	}  


