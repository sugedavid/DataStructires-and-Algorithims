package LinkedLists;
import java.util.*;

public class MainLinkedList {
	
	public static void main() {
		
		LinkedList<Double> linkedList = new LinkedList<Double>();
		
		linkedList.add(2.3);
		linkedList.remove(2.3);
		
		// as stack
		linkedList.push(2.3);
		linkedList.pop();
		
		// as queue
		linkedList.offer(2.3);
		linkedList.poll();

		
	}

}
