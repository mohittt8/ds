package org.mohit.heaps;

import java.util.Comparator;

public class MaxHeap<T> extends Heap<T> {

	public MaxHeap(Comparator<Node<T>> comp) {
		super(comp);
	}

	public void insert(T element) {
		super.insert(element);
		for (int index = (heap.size() - 1) / 2; index >= 0; index--) {
			maxify(index);
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < heap.size(); i++) {
			sb.append(heap.get(i).getElement().toString());
		}
		return sb.toString();
	}
	
	public T getMaximum(){
		Node<T> max = heap.remove(0);
		for (int index = (heap.size() - 1) / 2; index >= 0; index--) {
			maxify(index);
		}
		return max.getElement();
	}

}
