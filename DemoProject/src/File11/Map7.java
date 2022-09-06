package File11;

import java.util.HashMap;

public class Map7 {
	public static void main(String[] args) {
		HashMap<Integer , String>hash_map=new HashMap<Integer , String>();
	hash_map.put(1, "one");
	hash_map.put(2, "Two");
	hash_map.put(3, "Three");
	hash_map.put(4, "Four");
	System.out.println("The orginal map"+hash_map);
	System.out.println("1.Is the key'two' exists?");
	if(hash_map.containsKey("Two")){
	System.out.println("yes"+hash_map.get("Two"));
	}
	else
	{
		System.out.println("no");
	}

		System.out.println("\n2. Is key 'orange'exist?");
		if(hash_map.containsKey("orange")) {
			System.out.println("yes!"+hash_map.get("orange"));
		}else {
			System.out.println("no");
		}
	
}
}