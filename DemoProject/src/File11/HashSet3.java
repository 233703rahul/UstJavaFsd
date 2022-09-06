package File11;
import java.util.*;
public class HashSet3 {
	public static void main(String[] args) {
		HashSet<String>h_set1=new HashSet<String>();
		h_set1.add("Apple");
		h_set1.add("Orange");
		h_set1.add("Banana");
		h_set1.add("Plum");
		System.out.println("First Hash set"+h_set1);
		HashSet<String>h_set2=new HashSet<String>();
		h_set2.add("Apple");
		h_set2.add("Pineapple");
		h_set2.add("Banana");
		h_set2.add("Melon");
		System.out.println("Second Hash set"+h_set2);
		h_set1.retainAll(h_set2);
		System.out.println("Hashset");
		System.out.println(h_set1);
	}
}