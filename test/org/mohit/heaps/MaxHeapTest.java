package org.mohit.heaps;

import static org.junit.Assert.*;

import java.util.Comparator;
import java.util.List;

import org.junit.Test;

class IntegerComparitor implements Comparator<Node<Integer>> {

	@Override
	public int compare(Node<Integer> o1, Node<Integer> o2) {
		if (o1 == null)
			return -1;
		else if (o2 == null)
			return 1;
		else {
			return o1.getElement() - o2.getElement();
		}
	}

}

public class MaxHeapTest {

	@Test
	public void testCompare() {
		Comparator<Node<Integer>> comparator = new IntegerComparitor();
		assertTrue(comparator.compare(new Node<Integer>(5), null) > 0);
		assertTrue(comparator.compare(null, new Node<Integer>(5)) < 0);
		assertTrue(comparator.compare(new Node<Integer>(5),
				new Node<Integer>(5)) == 0);
		assertTrue(comparator.compare(new Node<Integer>(15), new Node<Integer>(
				5)) > 0);
		assertTrue(comparator.compare(new Node<Integer>(15), new Node<Integer>(
				115)) < 0);

	}

	@Test
	public void testInsert() {
		Comparator<Node<Integer>> comparator = new IntegerComparitor();
		MaxHeap<Integer> heap = new MaxHeap<Integer>(comparator);
		heap.insert(4);
		heap.insert(10);
		heap.insert(12);
		heap.insert(1);
		heap.insert(14);
		assertEquals(Integer.valueOf(14), heap.getMaximum());
		assertEquals(Integer.valueOf(12), heap.getMaximum());
		assertEquals(Integer.valueOf(10), heap.getMaximum());
		assertEquals(Integer.valueOf(4), heap.getMaximum());
		assertEquals(Integer.valueOf(1), heap.getMaximum());
	}

	@Test
	public void testSort() {
		Comparator<Node<Integer>> comparator = new IntegerComparitor();
		MaxHeap<Integer> heap = new MaxHeap<Integer>(comparator);
		heap.insert(4);
		heap.insert(10);
		heap.insert(12);
		heap.insert(1);
		heap.insert(14);
		List<Integer> sortedList = heap.heapSort();
		assertEquals(Integer.valueOf(14), sortedList.get(0));
		assertEquals(Integer.valueOf(12), sortedList.get(1));
		assertEquals(Integer.valueOf(10), sortedList.get(2));
		assertEquals(Integer.valueOf(4), sortedList.get(3));
		assertEquals(Integer.valueOf(1), sortedList.get(4));
	}

}
