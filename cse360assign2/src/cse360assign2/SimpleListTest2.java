package cse360assign2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.*;

class SimpleListTest2 {
	private SimpleList tester;
	private int first, last, size;
		
	@Before
	public void beforeAll() {
		tester = new SimpleList();
		tester.add(1);
		tester.add(2);
		tester.add(3);
		tester.add(4);
		tester.add(5);
		tester.add(6);
		tester.add(7);
		tester.add(8);
		tester.add(9);
		tester.add(10);
		tester.add(11);
		tester.add(12);
		tester.add(13);
	} 
	
	@Test
	void testAdd() {
		tester = new SimpleList();
		tester.add(1);
		tester.add(2);
		tester.add(3);
		tester.add(4);
		tester.add(5);
		tester.add(6);
		tester.add(7);
		tester.add(8);
		tester.add(9);
		tester.add(10);
		tester.add(11);
		tester.add(12);
		tester.add(13);
		
		String value = tester.toString();
		assertEquals(" 13 12 11 10 9 8 7 6 5 4 3 2 1", value);
	}
	
	@Test
	void testRemove() {
		tester = new SimpleList();
		first = tester.first();
		last = tester.last();
		size = tester.size();
		assertEquals( first, -1);
		assertEquals(last, -1);
		assertEquals(size, 10); 
		
		tester.add(1);
		tester.add(2);
		tester.add(3);
		tester.add(4);
		tester.add(5);
		tester.add(6);
		tester.add(7);
		tester.add(8);
		tester.add(9);
		tester.add(10);
		tester.add(11);
		tester.add(12);
		tester.add(13);
		
		first = tester.first();
		last = tester.last();
		size = tester.size();
		assertEquals( first, 13);
		assertEquals(last, 1);
		assertEquals(size, 15); 
		
		tester.remove(7);
		tester.remove(1);
		tester.remove(2);
		tester.remove(3);
		tester.remove(4);
		tester.remove(5);
		tester.remove(6);
		tester.remove(8);
		tester.remove(9);
		tester.remove(10);
		tester.remove(11);
		tester.remove(12);
		tester.remove(13);
		
		first = tester.first();
		last = tester.last();
		size = tester.size();
		assertEquals( first, -1);
		assertEquals(last, -1);
		assertEquals(size, 3); 
		
		String value = tester.toString();
		assertEquals("", value);
	}
	@Test
	public void testAppend() {
		tester = new SimpleList();
		tester.add(1);
		tester.add(2);
		tester.add(3);
		tester.add(4);
		tester.add(5);
		tester.add(6);
		tester.add(7);
		tester.add(8);
		tester.add(9);
		tester.append(10);
		tester.append(11);
		tester.append(12);
		tester.append(13);
		
		first = tester.first();
		last = tester.last();
		size = tester.size();
		assertEquals( first, 9);
		assertEquals(last, 13);
		assertEquals(size, 15); 
		
		String value = tester.toString();
		assertEquals(" 9 8 7 6 5 4 3 2 1 10 11 12 13", value);
	}
}
