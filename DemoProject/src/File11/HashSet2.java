package File11;
import java.util.*;

public class HashSet2 {
	public static void main(String[] args) {
		HashSet<String>h_set=new HashSet<String>();
		h_set.add("Apple");
		h_set.add("Orange");
		h_set.add("Banana");
		h_set.add("Plum");
	System.out.println("Hash set"+h_set);
	HashSet<String>new_h_set = new HashSet<String>();
	new_h_set = (HashSet)h_set.clone();
	System.out.println("Cloned hash set"+ new_h_set);

}
}