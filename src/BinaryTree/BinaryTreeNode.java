package BinaryTree;

public class BinaryTreeNode {
		public int data;
		public BinaryTreeNode leftChild,rightChild;
		/**
		 * 
		 */
		public BinaryTreeNode() {
			// TODO Auto-generated constructor stub
			leftChild = rightChild = null;
		}
		public BinaryTreeNode(int e){
			this(e, null, null);	
		}
		public BinaryTreeNode(int e,BinaryTreeNode lc,BinaryTreeNode rc) {
				data=e;
				leftChild=lc;
				rightChild = rc;
		}
		
		public BinaryTreeNode getLeftChild() {
			return leftChild;
		}
		public void setLeftChild(BinaryTreeNode leftChild) {
			this.leftChild = leftChild;
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
		public static void main(String[] args) {
			BinaryTreeNode tree[] = new BinaryTreeNode[3];
			
		}
}
