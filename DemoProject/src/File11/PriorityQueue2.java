package File11;
import java.util.PriorityQueue;
public class PriorityQueue2 {
	public static void main(String[] args) {
		PriorityQueue<String> queue1= new PriorityQueue<String>();
		queue1.add("One");
		queue1.add("two");
		queue1.add("Three");
		queue1.add("Four");
		System.out.println("Orginal queue"+queue1);
		queue1.add("Five");
		System.out.println("New Queue"+queue1);

}
}