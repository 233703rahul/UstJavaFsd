package File11;

import java.util.HashMap;

public class Map4 {
	public static void main(String[] args) {
		HashMap<Integer , String>hash_map=new HashMap<Integer , String>();
	hash_map.put(1, "one");
	hash_map.put(2, "Two");
	hash_map.put(3, "Three");
	hash_map.put(4, "Four");
	System.out.println(" the hash map"+hash_map);
	hash_map.clear();
	System.out.println("The New Map"+hash_map);

}
}
