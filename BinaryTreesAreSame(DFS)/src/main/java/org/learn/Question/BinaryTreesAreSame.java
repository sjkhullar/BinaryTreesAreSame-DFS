
package org.learn.Question;

import org.learn.PrepareTree.Node;

public class BinaryTreesAreSame {
	public static boolean isSameBinaryTree(Node tree1, Node tree2) {
		if(tree1 == null && tree2 == null) {
			return true;
		}
		if(tree1 == null || tree2 == null) {
			return false;
		}
		if(tree1.data != tree2.data)
			return false;
		
		if(false == isSameBinaryTree(tree1.left,tree2.left))
			return false;
		
		if(false ==  isSameBinaryTree(tree1.right,tree2.right))
			return false;
		
		return true;
	}
}
