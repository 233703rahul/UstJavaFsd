package File11;
import java.util.HashMap;
public class Map6 {
	public static void main(String[] args) {
		HashMap<Integer , String>hash_map=new HashMap<Integer , String>();
	hash_map.put(1, "one");
	hash_map.put(2, "Two");
	hash_map.put(3, "Three");
	hash_map.put(4, "Four");
	System.out.println("The orginal map"+hash_map);
	HashMap<Integer , String>new_hash_map=new HashMap<Integer , String>();
	new_hash_map=(HashMap)hash_map.clone();
	System.out.println("New hash map"+new_hash_map);

}
}