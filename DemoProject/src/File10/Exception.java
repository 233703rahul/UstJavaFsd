package File10;

public class Exception {
	public static void main(String args[]) {
		try {
			int dividebyZero=(5/0);
			System.out.println("Try code");
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic exp"+e.getMessage());
		}
		
	}

}
