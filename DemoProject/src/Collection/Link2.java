package Collection;
import java.util.Iterator;
import java.util.LinkedList;
public class Link2 {
	public static void main(String[] args) {
		LinkedList<Integer>linkedList=new LinkedList<>();
		linkedList.add(5);
		linkedList.add(100);
		linkedList.add(41);
		linkedList.add(40);
		iterateUsingIterator(linkedList);
	}
	public static void iterateUsingIterator(LinkedList<Integer>linkedList) {
		System.out.print("Iterate using Iterator");
		Iterator it = linkedList.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+"");
			
		}
		
		
	}

}
