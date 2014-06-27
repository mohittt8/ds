package org.mohit.tree;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinaryTreeTest {

	@Test
	public void testInsert() {
		BinaryTree tree = new BinaryTree();
		assertNull(tree.search(5));
		tree.insert(5);
		assertNotNull(tree.search(5));
		tree.insert(6);
		assertNotNull(tree.search(6));

	}

}
