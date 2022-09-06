package File11;
import java.util.HashSet;
public class HashSet1 {
	public static void main(String[] args) {
		HashSet<String>h_set=new HashSet<String>();
		h_set.add("Apple");
		h_set.add("Orange");
		h_set.add("Banana");
		h_set.add("Plum");
		h_set.add("Cherry");
		System.out.println("Hash set"+h_set);
		h_set.add("Pineapple");
		System.out.println("New Set"+h_set);
	}

}
