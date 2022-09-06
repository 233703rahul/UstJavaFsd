package File11;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Map11 {
	public static void main (String args[]) {
		HashMap<Integer, String> h=new HashMap<Integer,String>();
		h.put(1, "aa");
		h.put(2, "bb");
		h.put(3, "cc");
		int c=0;
		for(Map.Entry<Integer,String>i:h.entrySet()) {
			System.out.println(i.getKey());
		}

}
}
