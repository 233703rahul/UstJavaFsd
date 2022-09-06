package File11;
import java.util.HashMap;
public class Map5 {
	public static void main(String[] args) {
		HashMap<Integer , String>hash_map=new HashMap<Integer , String>();
	hash_map.put(1, "one");
	hash_map.put(2, "Two");
	hash_map.put(3, "Three");
	hash_map.put(4, "Four");
	boolean result = hash_map.isEmpty();
	System.out.println("Hash map empth?"+result);
	hash_map.clear();
	result=hash_map.isEmpty();
	System.out.println("Is hash map Empty?"+result);
	}
}