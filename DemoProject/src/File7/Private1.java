package File7;

class Private2 {
	private int data=50;
	private void print() {
		System.out.println("Hello Private");
	}

}
public class Private1{
	public static void main(String[] args )
	{
		Private2 obj = new Private2();
		System.out.println(obj.data);
		obj.print();
		
	}
}
