package aa;
class Bank
{
	public void getBalance()
	{
		System.out.println("0");
	}
}
class BankA extends Bank
{
	public void getBalance()
	{
		System.out.println("Bal=100");
	}
}
class BankB extends Bank
{
	public void getBalance()
	{
		System.out.println("Bal=200");
	}
}
class BankC extends Bank
{
	public void getBalance()
	{
		System.out.println("Bal=300");
	}
}
public class inheritance7 {
	public static void main (String[] args)
	{
		BankA a=new BankA();
		BankB b=new BankB();
		BankC c=new BankC();
		a.getBalance();
		b.getBalance();
		c.getBalance();
	}

}
