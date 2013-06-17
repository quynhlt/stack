/**
 * 
 */
package main;

import java.util.ArrayList;
import java.util.List;

/**
 * @author quynhlt
 * 
 */
public class Stack {
	List<String> stacks = null;

	public Stack() {
		stacks = new ArrayList<String>();
	}

	public int size() {
		return stacks.size();
	}

	public void push(String item) {
		stacks.add(item);
	}

	public String top() {
		String result = "";
		if (stacks.isEmpty()) {
			result = null;
		} else {

			result = stacks.get(size() - 1);
		}
		return result;
	}

	public void pop() {
		if (stacks.isEmpty()) {
			throw new RuntimeException("StackEmptyException");
		} else {
			stacks.remove(size() - 1);
		}

	}
}
