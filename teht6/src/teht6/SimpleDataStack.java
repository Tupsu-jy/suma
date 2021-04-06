package teht6;

import java.util.Stack;

public class SimpleDataStack implements DataStack {

	private Stack<Integer> ourStack = new Stack<Integer>();
	
	public int get() {
		return ourStack.pop();
	}
	
	public void add(int newValue) {
		ourStack.add(newValue); 
	}
}
