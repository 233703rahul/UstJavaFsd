package File10;

public class Exception1 {
	public static void main(String args[]) {
		try {
			int d=(3/1);
			int a[]=new int[2];
			a[3]=4;
			System.out.println("Try code");
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic exp"+e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			
		}
		
	}

}
