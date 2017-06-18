package roteiro6;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DoubleLinkedListImplTest {

	private DoubleLinkedListImpl list;
	
	@Before
	public void setUp() throws Exception {
		list = new DoubleLinkedListImpl();
	}

	@Test
	public void testInsertFirst() {
		assertTrue(list.isEmpty());
		list.insertFirst(12);
		assertEquals(12, list.getFirst().getValor());
		assertEquals(12, list.getLast().getValor());
		assertFalse(list.isEmpty());
		
		list.insertFirst(19);
		assertEquals(19, list.getFirst().getValor());
		// 39 19 12
		list.insertFirst(39);
		assertEquals(39, list.getFirst().getValor());
		
	}

	@Test
	public void testRemoveFirst() {
		list.insertFirst(12);
		list.insertFirst(19);
		list.insertFirst(39);


		list.removeFirst();
		assertEquals(19, list.getFirst().getValor());

	}

	@Test
	public void testRemoveLast() {
		list.insertFirst(12);
		list.insertFirst(19);
		list.insertFirst(39);
		
		list.removeLast();
		assertEquals(19, list.getLast().getValor());
		list.removeLast();
		assertEquals(39, list.getLast().getValor());
		assertEquals(39, list.getFirst().getValor());
		list.removeLast();
		assertEquals(null, list.getLast());
		
	}

	@Test
	public void testGetLast() {
		//modificando a cabeca
		list.insertFirst(12);
		assertEquals(12, list.getLast().getValor());
		list.insertFirst(19);
		assertEquals(12, list.getLast().getValor());
		// modificando a calda
		list.insert(39);
		// 19 12 39
		assertEquals(39, list.getLast().getValor());
		
		
		//remove primeiro
		list.removeFirst();
		assertEquals(-1, list.search(19));
		assertEquals(39, list.getLast().getValor());
		list.insert(46);
		assertEquals(46, list.getLast().getValor());
		//12 39 46 98
		list.insert(98);
		//12 39 46 98
		
		
		// remove o ultimo elemento (procurando por 98)
		list.remove(98);
		assertEquals(-1, list.search(98));
		//12 39 46
		assertEquals(46, list.getLast().getValor());
		list.insertFirst(76);
		list.insert(75);
		list.insert(65);
		list.insert(125);
		//76 12 39 46 65
		// remove o do meio
		list.remove(39);
		//76 12 46 65
		assertEquals(125, list.getLast().getValor());
		assertEquals(-1, list.search(39));

	}

//	@Test
//	public void testSetLast() {
//		fail("Not yet implemented");
//	}

}
