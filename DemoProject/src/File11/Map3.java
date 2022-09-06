package File11;

import java.util.HashMap;

public class Map3 {
	public static void main(String[] args) {
		HashMap<Integer , String>hash_map1=new HashMap<Integer , String>();
		HashMap<Integer , String>hash_map2=new HashMap<Integer , String>();
	hash_map1.put(1, "one");
	hash_map1.put(2, "Two");
	hash_map1.put(3, "Three");
	System.out.println("values in first map"+hash_map1);
	hash_map2.put(4, "four");
	hash_map2.put(5, "five");
	hash_map2.put(6, "six");
	System.out.println("values in Second map"+hash_map2);
	hash_map2.putAll(hash_map1);
	System.out.println("Values in second"+hash_map2);


}

}
