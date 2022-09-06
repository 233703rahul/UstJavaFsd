package File11;
import java.util.*;
 class TreeSet2 {
	 public static void main(String args[]) {
		 TreeSet<String>al=new TreeSet<String>();
		 al.add("One");
		 al.add("Two");
		 al.add("Three");
		 al.add("Four");
		 Iterator<String>itr=al.iterator();
		 while(itr.hasNext()) {
			 System.out.println(itr.next());
		 }
	 }
	

}
