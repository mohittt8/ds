package org.mohit.heaps;

import java.util.ArrayList;
import java.util.List;

abstract class Heap<T> {

	protected List<Node<T>> heap;

	public Heap() {
		this.heap = new ArrayList<Node<T>>();
	}

	protected Node<T> getLeftChild(int index) {
		Node<T> child = null;
		if (2 * index + 1 < heap.size())
			child = heap.get(2 * index + 1);
		return child;
	}

	protected Node<T> getRightChild(int index) {
		Node<T> child = null;
		if (2 * index + 2 < heap.size())
			child = heap.get(2 * index + 2);
		return child;
	}

	protected Node<T> getParent(int index) {
		Node<T> parent = null;
		if (index != 0)
			parent = heap.get(index / 2 - 1);
		return parent;
	}

	protected void insert(T element) {
		heap.add(new Node<T>(element));
	}

}
