package File11;
import java.util.TreeSet;
public class TreeSet4 {
	public static void main(String[] args) {
		TreeSet<String>tree_Set= new TreeSet<String>();
		tree_Set.add("One");
		tree_Set.add("Two");
		tree_Set.add("Three");
		tree_Set.add("Four");
		tree_Set.add("Five");
		System.out.println("Tree Set");
		System.out.println(tree_Set);
		Object first_element=tree_Set.first();
		System.out.println("First Element is"+first_element);
		Object last_element=tree_Set.last();
		System.out.println("First Element is"+last_element);
		
}
}