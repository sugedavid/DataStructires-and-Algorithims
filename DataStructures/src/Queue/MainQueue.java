package Queue;

import java.util.*;

public class MainQueue {
	
	public static void main(String[] args){
		
		Queue<String> queue = new LinkedList<String>();
		
		//add to queue
		queue.offer("Vivy");
		queue.offer("John");
		queue.offer("Joyce");
		
		System.out.println(queue);
		
		// remove from queue
		queue.poll();
		System.out.println(queue);
		
		//check element at head
		queue.peek();
		System.out.println(queue);
		
		// Priority Queues
		Queue<Double> queue2 = new PriorityQueue<>();
		
		
		
		//add 
		queue2.offer(2.0);
		queue2.offer(3.5);
		queue2.offer(1.0);
		
		//remove
		
		while(!queue2.isEmpty()) {
			System.out.println(queue2.poll());
		}
		
		System.out.println("");
		// Priority Queues Reversed Order
		Queue<Double> queue3 = new PriorityQueue<>(Collections.reverseOrder());
		
		
		//add 
		queue3.offer(2.0);
		queue3.offer(3.5);
		queue3.offer(1.0);
		
		//remove
		
		while(!queue3.isEmpty()) {
			System.out.println(queue3.poll());
		}
		
	}

}
