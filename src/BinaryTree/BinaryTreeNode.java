package BinaryTree;

public class BinaryTreeNode {
		public int data;
		public BinaryTreeNode leftChild,parent,rightChild;
		public BinaryTreeNode(int e,BinaryTreeNode lc,BinaryTreeNode p,BinaryTreeNode rc) {
				data=e;
				leftChild=lc;
				parent=p;
				rightChild = rc;
		}
		public BinaryTreeNode getLeftChild() {
			return leftChild;
		}
		public void setLeftChild(BinaryTreeNode leftChild) {
			this.leftChild = leftChild;
		}
		public BinaryTreeNode getParent() {
			return parent;
		}
		public void setParent(BinaryTreeNode parent) {
			this.parent = parent;
		}
		public BinaryTreeNode getRightChild() {
			return rightChild;
		}
		public void setRightChild(BinaryTreeNode rightChild) {
			this.rightChild = rightChild;
		}
		public void setData(int data) {
			this.data = data;
		}
		
}
