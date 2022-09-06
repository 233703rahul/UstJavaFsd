package aa;
class Display{
	public void print(int a , char b) {
		System.out.print("First Method");
	}
	public void print(char a , int b) {
		
		System.out.print("Second Method");
	}
}
public class Inheritance4 {
	public static void main(String args[]) {
		Display p = new Display();
		p.print(5,'a');
		System.out.println();
		p.print('b',8);
		
		
	}


}
