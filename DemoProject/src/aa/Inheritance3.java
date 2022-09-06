package aa;

class shape
{
	public void PrintShape()
	{
	System.out.println("This is the shape");
}
}
class rectangle extends shape
{
	public void PrintRect() {
System.out.println("This is rectangle");
}
}
class circle extends shape
{
	public void PrintCircle() 
	{
	System.out.println("This is circle");
}
}
class square extends rectangle
{
	public void PrintSquare() {
		System.out.println("Square is a rectangle");
	}
}
public class Inheritance3 {
	public static void main(String[] args) {
		square s = new square();
		s.PrintRect();
		s.PrintShape();
	}
}


