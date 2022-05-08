package Stack;
import java.util.Stack;

public class MainStack {
	
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		
		// add to stack
		stack.push("Forza");
		stack.push("Red Dead");
		stack.push("Halo");
		System.out.println(stack);
		
		// get item at the top 
		String peek = stack.peek();
		System.out.println(peek);
	
		
		// search item
		int search = stack.search(peek);
		System.out.println(search);
		
		// remove from stack
		stack.pop();
		System.out.println(stack);
		
		
		
	}
	

}
