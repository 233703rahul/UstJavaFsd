package Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
public class Link4 {
public static void main(String args[]) {
	LinkedList<String> linkedList = new LinkedList<>();
	linkedList.add("one");
	linkedList.add("two");
	linkedList.add("three");
	linkedList.add("four");
	ListIterator<String>listIterator = linkedList.listIterator(linkedList.size());
	while(listIterator.hasPrevious())
	{
		System.out.println(listIterator.previous());
	}
	
	
}
}
