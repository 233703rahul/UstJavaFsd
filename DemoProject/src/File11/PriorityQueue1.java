package File11;
import java.util.PriorityQueue;
public class PriorityQueue1 {
	public static void main(String[] args) {
		PriorityQueue<String> queue= new PriorityQueue<String>();
		queue.add("One");
		queue.add("two");
		queue.add("Three");
		queue.add("Four");
		System.out.println("Elements of the Priority");
		System.out.println(queue);
}
}