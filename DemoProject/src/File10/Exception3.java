package File10;
//string exception
public class Exception3 {
	public static void main(String args[])
	{
		try {
			String str="ustglobal";
			System.out.println(str.length());
			char c = str.charAt(0);
			c=str.charAt(40);
			System.out.println(c);
			
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutofBoundsException!!");
		}
	}

}
