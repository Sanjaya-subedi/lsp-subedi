package org.howard.edu.lsp.assignment5;
import java.util.ArrayList;



import java.util.List;

import static org.junit.Assert.assertEquals;



import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.howard.edu.lsp.assignment4.IntegerSetException;

import org.howard.edu.lsp.assignment5.IntegerSet;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class IntegerSetTest {
	@Test
	@DisplayName("Test cases for clear")
	public void testClear() {
		
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		
		IntegerSet set2 = new IntegerSet();
		set2.add(1);
		set2.add(2);
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(6);
		set2.add(7);
		
		IntegerSet set3 = new IntegerSet();
		set3.add(1);
		set3.add(2);
		set3.add(3);
		set3.add(4);
		set3.add(5);
		set1.add(6);

		IntegerSet set4 = new IntegerSet();
		
    	set2.clear();
		set4.clear();
		
		assertEquals("error found in clear()",  true, set2.isEmpty());
		assertEquals("error found in clear()",  false, set1.isEmpty());
		assertNotEquals("error found in clear()",  false, set4.isEmpty());
		assertNotEquals("error found in clear()",  true, set3.isEmpty());
	}
	
	
	@Test
	@DisplayName("Test cases for length")
	public void testLength() {
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		
		IntegerSet set2 = new IntegerSet();
		set2.add(1);
		set2.add(2);
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(6);
		set2.add(7);
		
		IntegerSet set3 = new IntegerSet();
		set3.add(1);
		set3.add(2);
		set3.add(3);
		set3.add(4);
		set3.add(5);
		set3.add(6);

		IntegerSet set4 = new IntegerSet();
		
		assertEquals("error found in length()",  5, set1.length());
		assertEquals("error found in length()",  7, set2.length());
		assertNotEquals("error found in length()",  9, set3.length());
		assertEquals("error in found length()",  0, set4.length());
		assertNotEquals("error found in length()",  20, set4.length());
	}
	
	
	@Test
	@DisplayName("Test cases for equals")
	public void testEquals() {
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		
		IntegerSet set2 = new IntegerSet();
		set2.add(1);
		set2.add(2);
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(6);
		set2.add(7);
		
		IntegerSet set3 = new IntegerSet();
		set3.add(1);
		set3.add(2);
		set3.add(3);
		set3.add(4);
		set3.add(5);
		set3.add(6);
		
		IntegerSet set4 = new IntegerSet();
		IntegerSet set5 = new IntegerSet();
    	
		assertNotEquals("error found in equals()",  true, set1.equals(set3));
		assertEquals("error found in equals()",  false, set3.equals(set2));
		assertEquals("error found in equals()",  false, set4.equals(set3));
		assertEquals("error found in equals()",  true, set4.equals(set5));

	}
	
	
	@Test
	@DisplayName("Test cases for contains")
	public void testContains() {
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		
		IntegerSet set2 = new IntegerSet();
		set2.add(1);
		set2.add(2);
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(6);
		set2.add(7);
		
		IntegerSet set3 = new IntegerSet();
		set3.add(1);
		set3.add(2);
		set3.add(3);
		set3.add(4);
		set3.add(5);
		set3.add(6);

		IntegerSet set4 = new IntegerSet();
    	
		assertNotEquals("error found in contains()",  true, set1.contains(8));
		assertEquals("error found in contains()",  true, set2.contains(7));
		assertEquals("error found in contains()",  true, set3.contains(4));
		assertNotEquals("error found in contains()",  true, set4.contains(5));
		
	}
	
	
	
	
	@Test
	@DisplayName("Test cases for largest")
	public void testLargest() throws IntegerSetException {
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		
		IntegerSet set2 = new IntegerSet();
		set2.add(1);
		set2.add(2);
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(6);
		set2.add(7);
		
		
		IntegerSet set3 = new IntegerSet();
		set3.add(1);
		set3.add(2);
		set3.add(3);
		set3.add(4);
		set3.add(5);
		set3.add(6);
		
		IntegerSet set4 = new IntegerSet();
		set4.add(1);
		set4.add(2);
		set4.add(3);
    	
		assertEquals("error found in largest()",  5, set1.largest());
		assertEquals("error found in largest()",  7, set2.largest());
		assertNotEquals("error found in largest()",  7, set3.largest());
		assertNotEquals("error found in largest()",  9, set4.largest());
	}
	
	
	
	@Test
	@DisplayName("testLargest throws exception")
	public void testLargest_THROWS_EXCEPTION() {
		IntegerSet set1 = new IntegerSet();
		Exception exception = assertThrows(IntegerSetException.class, ()->{
			set1.largest();
		});
		String expectedMessage = "Empty set cannot have these values.";
		String actualMessage = exception.getMessage();
		
		assertTrue(actualMessage.contains(expectedMessage));
	}
	
	
	@Test
	@DisplayName("Test cases for smallest")
	public void testSmallest() throws IntegerSetException {
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		
		IntegerSet set2 = new IntegerSet();
		set2.add(1);
		set2.add(2);
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(6);
		set2.add(7);
		
		
		IntegerSet set3 = new IntegerSet();
		set3.add(2);
		set3.add(3);
		set3.add(4);
		set3.add(5);
		set3.add(6);
		
    	
		assertEquals("error found in smallest()",  1, set1.smallest());
		assertNotEquals("error found in smallest()",  5, set2.smallest());
		assertNotEquals("error found in smallest()",  1, set3.smallest());
		assertEquals("error found in smallest()",  2, set3.smallest());
		
	}
	
	@Test
	@DisplayName("testSmallest throws exception")
	public void testSmallest_THROWS_EXCEPTION() {
		IntegerSet set1 = new IntegerSet();
		Exception exception = assertThrows(IntegerSetException.class, ()->{
			set1.smallest();
		});
		String expectedMessage = "Empty set cannot have these values.";
		String actualMessage = exception.getMessage();
		
		assertTrue(actualMessage.contains(expectedMessage));
	}
	
	
	@Test
	@DisplayName("Test cases for add")
	public void testAdd() {
		
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		
		IntegerSet set2 = new IntegerSet();
		set2.add(1);
		set2.add(2);
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(6);
		set2.add(7);

		
		
		IntegerSet set3 = new IntegerSet();
		set3.add(1);
		set3.add(2);
		set3.add(3);
		set3.add(4);
		set3.add(5);
		set3.add(6);

		IntegerSet set4 = new IntegerSet();
		
		set2.add(8);
		set3.add(7);
		
		assertEquals("error found in add()",  true, set2.contains(1));
		assertEquals("error found in add()",  true, set3.contains(7));
		assertEquals("error found in add()",  true, set2.contains(8));
		assertEquals("error found in add()",  false, set4.contains(2));
		
	}
	
	@Test
	@DisplayName("Test cases for remove")
	public void testRemove() {
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		set1.add(6);
		
		set1.remove(2);
		set1.remove(6);
		set1.remove(3);
		
		assertEquals("error found in remove()",  false, set1.contains(2));
		assertEquals("error found in remove()",  false, set1.contains(6));
		assertNotEquals("error found in remove()",  true, set1.contains(2));
		assertNotEquals("error found in remove()",  true, set1.contains(3));

	}
	
	

	
	@Test
	@DisplayName("Test cases for union")
	public void testUnion() {
		
		IntegerSet set1 = new IntegerSet();
		
		IntegerSet set2 = new IntegerSet();
		set2.add(1);
		set2.add(2);
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(6);
		set2.add(7);
		
		IntegerSet set3 = new IntegerSet();
		set3.add(1);
		set3.add(2);
		set3.add(3);
		set3.add(4);
		set3.add(5);
		set3.add(6);
		
		IntegerSet set4 = new IntegerSet();
    	
    	set1.union(set2);
    	set4.union(set3);
    	set1.union(set4);

    	assertEquals("error found in union()",  "1234567", set1.toString());
    	assertEquals("error found in union()",  "123456", set4.toString()); 
	}
	
	@Test
	@DisplayName("Test cases for intersect")
	public void testIntersect() {
		
		IntegerSet set1 = new IntegerSet();
		
		IntegerSet set2 = new IntegerSet();
		set2.add(1);
		set2.add(2);
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(6);
		set2.add(7);
		
		IntegerSet set3 = new IntegerSet();
		set3.add(1);
		set3.add(2);
		set3.add(3);
		set3.add(4);
		set3.add(5);
		set3.add(6);
		
		IntegerSet set4 = new IntegerSet();
    	
    	set3.intersect(set2);
    	set4.intersect(set3);
    	set2.intersect(set1);

    	assertEquals("error found in intersect()",  "123456", set3.toString());
    	assertEquals("error found in intersect()",  "", set4.toString());
    	assertEquals("error found in intersect()",  "", set2.toString());
	}
	
	@Test
	@DisplayName("Test cases for diff")
	public void testDiff() {
		
		IntegerSet set1 = new IntegerSet();
		
		IntegerSet set2 = new IntegerSet();
		set2.add(1);
		set2.add(2);
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(6);
		set2.add(7);
		
		IntegerSet set3 = new IntegerSet();
		set3.add(1);
		set3.add(2);
		set3.add(3);
		set3.add(4);
		set3.add(5);
		set3.add(6);
		
		IntegerSet set4 = new IntegerSet();
    	
    	set2.diff(set1);
    	set3.diff(set2);

    	assertEquals("error found in diff()",  "1234567", set2.toString());
    	assertEquals("error found in diff()",  "", set3.toString());
    	
    	set2.diff(set3);

    	assertEquals("error found in diff()",  "1234567", set2.toString());
	}
	
	
	@Test
	@DisplayName("Test cases for isEmpty")
	public void testIsEmpty() {
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		
		IntegerSet set2 = new IntegerSet();
		set2.add(1);
		set2.add(2);
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(6);
		set2.add(7);
		
		
		IntegerSet set3 = new IntegerSet();
		set3.add(1);
		set3.add(2);
		set3.add(3);
		set3.add(4);
		set3.add(5);
		set3.add(6);

		IntegerSet set4 = new IntegerSet();
		set3.diff(set2);
    	
		assertEquals("error found in isEmpty()",  false, set1.isEmpty());
		assertEquals("error found in isEmpty()",  false, set2.isEmpty());
		assertEquals("error found in isEmpty()",  true, set3.isEmpty());
		assertEquals("error found in isEmpty()",  true, set4.isEmpty());
		
	}
	
	
	@Test
	@DisplayName("Test cases for toString")
	public void testToString() {
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		
		IntegerSet set2 = new IntegerSet();
		set2.add(1);
		set2.add(2);
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(6);
		set2.add(7);
		
		
		IntegerSet set3 = new IntegerSet();
		set3.add(1);
		set3.add(2);
		set3.add(3);
		set3.add(4);
		set3.add(5);
		set3.add(6);

		IntegerSet set4 = new IntegerSet();
    	
		assertNotEquals("error found in toString()",  "1234567  ", set2.toString());
		assertEquals("error found in toString()",  "123456", set3.toString());
		assertEquals("error found in toString()",  "", set4.toString());
		assertNotEquals("error found in toString()",  "1234 5", set1.toString());
	}
	
	
	
}