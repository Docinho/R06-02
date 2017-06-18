package roteiro6;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SingleLinkedListTest {

	private SingleLinkedList s;
	
	@Before
	public void setUp() throws Exception {
		s = new SingleLinkedList();
	}

	@Test
	public void testIsEmpty() {
		assertTrue(s.isEmpty());
	}

	@Test
	public void testSize() {
		assertEquals(0, s.size());
	}

	@Test
	public void testSearch() {
		assertEquals(-1, s.search(1));
	}

	@Test
	public void testInsert() {
		s.insert(1);
		assertFalse(s.isEmpty());
		assertEquals(1, s.search(1));
		assertEquals(1, s.size());
		
		s.insert(33);
		assertFalse(s.isEmpty());
		assertEquals(33, s.search(33));
		assertEquals(2, s.size());
	}

	@Test
	public void testRemove() {
		s.insert(1);
		s.insert(2);
		s.insert(3);
		s.insert(4);
		s.insert(5);
		
		s.remove(4);
		assertEquals(-1, s.search(4));
		assertEquals(4, s.size());
		
		//removendo head
		s.remove(1);
		assertEquals(-1, s.search(1));
		assertEquals(3, s.size());
		assertEquals(2, s.getHead());
		
		// removendo tail
		s.remove(5);
		assertEquals(-1, s.search(5));
		assertEquals(2, s.size());
		
		//removendo valor que nao exista
		s.remove(1);
		assertEquals(-1, s.search(1));
		assertEquals(2, s.size());
		
		s.remove(2);
		s.remove(3);
		//removendo de lista vazia
		s.remove(-1);
		assertEquals(0, s.size());
		
	}

//	@Test
//	public void testToArray() {
//		fail("Not yet implemented");
//	}

}
