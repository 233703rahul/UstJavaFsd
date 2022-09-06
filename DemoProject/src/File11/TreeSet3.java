package File11;
import java.util.TreeSet;
import java.util.*;
import java.util.Iterator;
public class TreeSet3 {
	public static void main(String[] args) {
		TreeSet<String>t_Set= new TreeSet<String>();
		t_Set.add("One");
		t_Set.add("Two");
		t_Set.add("Three");
		t_Set.add("Four");
		t_Set.add("Five");
		System.out.println("Orginal tree Set"+t_Set);
		Iterator it =t_Set.descendingIterator();
		System.out.println("Reverse order");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
