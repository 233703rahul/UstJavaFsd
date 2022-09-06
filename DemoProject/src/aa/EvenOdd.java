package aa;
import java.util.*;
public class EvenOdd {
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int n,sumo=0,sume=0,rem;
		System.out.println("Enter the number");
		int num=sc.nextInt();
		n=num;
		while(num>0)
		{
			rem=num%10;
			if(rem%2==0)
			{
				sume=sume+rem;
			}
			else
			{
				sumo=sumo+rem;
			}
			num=num/10;
		}
		System.out.println("Sum of even digits in "+n+"is"+sume);
		System.out.println("Sum of odd digits in "+n+"is"+sumo);
		
	}

}