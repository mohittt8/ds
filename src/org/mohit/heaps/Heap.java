package org.mohit.heaps;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

abstract class Heap<T> {

	protected List<Node<T>> heap;
	private Comparator<Node<T>> comp;

	public Heap(Comparator<Node<T>> comp) {
		this.heap = new ArrayList<Node<T>>();
		this.comp = comp;
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

	protected int getLeftChildIndex(int index) {
		if (2 * index + 1 < heap.size())
			return 2 * index + 1;
		return -1;
	}

	protected int getRightChildIndex(int index) {
		if (2 * index + 2 < heap.size())
			return 2 * index + 2;
		return -1;
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

	protected void maxify(int index) {
		int rightChildIndex = getRightChildIndex(index);
		int leftChildIndex = getLeftChildIndex(index);
		int largest = index;
		if(rightChildIndex != -1 && comp.compare(heap.get(largest), getRightChild(index)) < 0){
			largest = rightChildIndex;			
		} 
		if(leftChildIndex != -1 && comp.compare(heap.get(largest), getLeftChild(index)) < 0){
			largest = leftChildIndex;
		}
		if(largest != index){
			Node<T> temp = heap.get(index);
			heap.set(index, heap.get(largest));
			heap.set(largest,temp);
			maxify(largest);
		}
		
	}
}
