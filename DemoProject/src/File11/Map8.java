package File11;
import java.util.*;
public class Map8 {
	public static void main(String[] args) {
		HashMap<Integer , String>h=new HashMap<Integer , String>();
		h.put(1, "aa");
		h.put(2, "bb");
		h.put(3, "cc");
		System.out.println("Enter the element");
		Scanner sc=new Scanner (System.in);
		String k=sc.next();
		int c=0;
		for(Map.Entry<Integer,String> i : h.entrySet())
		{
			if(h.containsValue(k))
			{
				System.out.println("Key is present");
				c=1;
				break;
			}
		}
		if(c==0) {
			System.out.println("Key is not present");
		}
	}
}
