package File11;
import java.util.PriorityQueue;
public class PriorityQueue5 {
	public static void main(String[] args) {
		PriorityQueue<Integer> queue1= new PriorityQueue<Integer>();
		PriorityQueue<Integer> queue2= new PriorityQueue<Integer>();
		queue1.add(10);
		queue1.add(11);
		queue1.add(23);
		queue1.add(56);
		queue1.add(33);
		queue1.add(45);
		System.out.println(" queue"+queue1);
		System.out.println("First Element"+queue1.peek());
}
}
