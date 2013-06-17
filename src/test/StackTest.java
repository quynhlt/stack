/**
 * 
 */
package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import main.Stack;

import org.junit.Before;
import org.junit.Test;

/**
 * @author quynhlt
 * 
 */
public class StackTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCreateStackIsCreatedWithSizeIsZero() {
		int expectedSize = 0;
		Stack stack = new Stack();
		int actualSize = stack.size();
		assertTrue(actualSize == expectedSize);
	}

	@Test
	public void testAfterPushStackElementOfStackIsIncrease() {
		String item = "Item 1";
		Stack stack = new Stack();
		stack.push(item);
		int expectedSize = 1;
		int actualSize = stack.size();
		assertTrue(actualSize == expectedSize);
	}

	@Test
	public void testPushStackWithNumberOfElement() {
		int k = 2;
		String item = "";
		Stack stack = new Stack();
		for (int i = 0; i <= k; i++) {
			item = "Item " + k;
			stack.push(item);
		}

		int expectedSize = 3;
		int actualSize = stack.size();
		assertTrue(actualSize == expectedSize);
	}

	@Test
	public void testTopReturnNullWhenStackIsEmpty() {
		Stack stack = new Stack();
		String actualResult = stack.top();
		assertEquals(null, actualResult);
	}

	@Test
	public void testTopReturnElementAfterPush() {
		String item = "Item 1";
		Stack stack = new Stack();
		stack.push(item);
		String actualResult = stack.top();
		assertEquals(item, actualResult);
	}

	@Test
	public void testPopStackEmptyExceptionWhenStackIsEmpty() {
		try {
			Stack stack = new Stack();
			stack.pop();
			fail();
		} catch (RuntimeException e) {
			assertEquals("StackEmptyException", e.getMessage());
		}
	}

	@Test
	public void testAfterPopStackSizeOfStackHasChanged() {
		int k = 2;
		String item = "";
		Stack stack = new Stack();
		for (int i = 0; i <= k; i++) {
			item = "Item " + k;
			stack.push(item);
		}
		stack.pop();
		int actualSize = stack.size();
		assertTrue(actualSize == k);
	}

	@Test
	public void testStackWithOneElementAfterPopSizeOfStackIsZero() {
		Stack stack = new Stack();
		stack.push("Item 1");
		stack.pop();
		int actualSize = stack.size();
		assertEquals(0, actualSize);
	}
	
	
	
}
