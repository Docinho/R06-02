package roteiro6;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class QueueDoubleLikedListImplTest {

	private QueueDoubleLikedListImpl list;
	
	@Before
	public void setUp() throws Exception {
		list = new QueueDoubleLikedListImpl(3);
	}

	@Test
	public void testQueueDoubleLikedListImpl() {
		assertTrue(list.isEmpty());
	}

	@Test
	public void testEnqueue() {
		list.enqueue(17);
		assertFalse(list.isEmpty());
		assertFalse(list.isFull());
		list.enqueue(26);
		assertFalse(list.isEmpty());
		assertFalse(list.isFull());
		list.enqueue(51);
		assertFalse(list.isEmpty());
		assertTrue(list.isFull());
	}

	@Test
	public void testDequeue() {
		list.enqueue(17);
		list.enqueue(26);
		list.enqueue(51);
		list.enqueue(67);
		assertEquals(17, list.dequeue());
		assertEquals(26, list.dequeue());
		assertEquals(51, list.dequeue());
		assertEquals(67, list.dequeue());
		assertEquals(-1, list.dequeue());
	}


}
