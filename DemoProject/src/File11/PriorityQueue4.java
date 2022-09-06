package File11;
import java.util.PriorityQueue;
public class PriorityQueue4 {
	public static void main(String[] args) {
		PriorityQueue<String> queue1= new PriorityQueue<String>();
		queue1.add("One");
		queue1.add("two");
		queue1.add("Three");
		queue1.add("Four");
		System.out.println("First queue"+queue1);
		PriorityQueue<String> queue2= new PriorityQueue<String>();
		queue2.add("One");
		queue2.add("six");
		queue2.add("Three");
		queue2.add("seven");
		System.out.println("Second queue"+queue2);
		for(String element : queue1) {
			System.out.println(queue2.contains(element)?"yes":"No");
		}
		

}

}
