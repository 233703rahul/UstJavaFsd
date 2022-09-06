package Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
public class Link5 {
	public static void main(String args[]) {
		int p,n;
		LinkedList<Integer> l= new LinkedList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		System.out.println("Position :");
		Scanner sc = new Scanner (System.in);
		p=sc.nextInt();
		System.out.println("Element:");
		n=sc.nextInt();
		l.add(p-1,n);
		System.out.println("The List is:"+l);
		sc.close();
	}
}
