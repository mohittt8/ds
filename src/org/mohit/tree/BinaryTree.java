package org.mohit.tree;

public class BinaryTree {

	private Node root;

	public Node getRoot() {
		return root;
	}

	public Node search(int element) {
		return search(element, root);
	}

	private Node search(int element, Node root) {
		if (root == null)
			return null;
		else if (root.getElement() == element)
			return root;
		else if (root.getElement() < element)
			return search(element, root.getRightChild());
		else
			return search(element, root.getLeftChild());
	}

	public void insert(int element) {
		root = insert(element, root);
	}

	private Node insert(int element, Node root) {
		if (root == null) {
			return new Node(element);
		} else if (root.getElement() < element) {
			root.setRightChild(insert(element, root.getRightChild()));
		} else {
			root.setRightChild(insert(element, root.getLeftChild()));
		}
		return root;
	}

	public void delete(int element) {

	}

	private void delete(int element, Node root) {

	}

}
