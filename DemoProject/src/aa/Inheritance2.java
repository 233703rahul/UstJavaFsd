package aa;
class PrintNumber
{
	public void print(int a )
	{
		System.out.println("This is integer");
	}
	public void print(float a )
	{
		System.out.println("This is float");
	}
	public void print(double a )
	{
		System.out.println("This is double");
	}
	public void print(String a )
	{
		System.out.println("This is string");
	}
}

public class Inheritance2 {
	public static void main(String args[]) {
		PrintNumber p = new PrintNumber();
		p.print(5);
		//p.print(5.0);
		p.print(53.55);
		p.print("asdsaj");
		
		
	}

}
