package File10;
//Number Format Exception
public class Exception6 {
	public static  void main(String args[]) {
		try {
			int num=Integer.parseInt("xyz");
			System.out.println(num);
		}
		catch(NumberFormatException e) {
			System.out.println("Number format exception occured");
		}
		
	}

}
