package File10;
//Arrayexception
class Exception2 {
	public static void main(String args[]) {
		try {
			int a[]=new int[3];
			a[11]=9;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds");
		}
	}

}
