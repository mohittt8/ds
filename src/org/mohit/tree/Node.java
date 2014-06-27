package org.mohit.tree;


public class Node {
	
	private int element;
	private Node leftChild;
	private Node rightChild;
	private Node parent;
	
	public Node(int element, Node leftChild, Node rightChild, Node parent) {
		super();
		this.element = element;
		this.leftChild = leftChild;
		this.rightChild = rightChild;
		this.parent = parent;
	}
	
	public Node(int element)
	{
		this(element,null,null,null);
	}

	public Node getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(Node leftChild) {
		this.leftChild = leftChild;
	}

	public Node getRightChild() {
		return rightChild;
	}

	public void setRightChild(Node rightChild) {
		this.rightChild = rightChild;
	}

	public Node getParent() {
		return parent;
	}

	public void setParent(Node parent) {
		this.parent = parent;
	}

	public int getElement() {
		return element;
	}

	public void setElement(int element) {
		this.element = element;
	}


}

