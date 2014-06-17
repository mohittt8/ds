package org.mohit.heaps;

public class MaxHeap<T> extends Heap<T> {

	public void insert(T element) {
		super.insert(element);
		maxify();
	}

	private void maxify() {
	}
}
