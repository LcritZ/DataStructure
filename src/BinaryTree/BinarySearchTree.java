/**    
 *  name：BinarySearchTree   
 *  description：   
 *  author：Lcrit_Z   
 *  date：2017年4月19日 上午10:04:03 
 *  @version 
 */
package BinaryTree;

import java.util.Stack;

import Queue.Queue;

/**
 *   @date：2017年4月19日 上午10:04:03 
 *  @author Lcrit_Z
 *  description：   
 */
public class BinarySearchTree {
	public BinaryTreeNode root;
	/**
	 * 
	 */
	public BinarySearchTree() {
		// TODO Auto-generated constructor stub
		root = null;
	}
	public void printNode(BinaryTreeNode p) {
		System.out.print(p.data+" ");
	}
	public BinaryTreeNode search(BinaryTreeNode p,int e) {
		while(p!=null){
			if (e==p.data) {
				return p;
			}else if (e<p.data) {
				p = p.leftChild;
			}else {
				p = p.rightChild;
			}
		}
		return null;
	}
	
	public void breadthFirst(BinaryTreeNode root) {
		BinaryTreeNode p=root;
		Queue q = new Queue();
		if (p!=null) {
			q.enqueue(p);
			while(!q.isEmpty()){
				p = (BinaryTreeNode) q.dequeue();
				printNode(p);
				if (p.leftChild!=null) {
					q.enqueue(p.leftChild);
				}
				if (p.rightChild!=null) {
					q.enqueue(p.rightChild);
				}
			}
		}
		System.out.println();
	}
	
	public void printTreeByPreOrder(BinaryTreeNode root) {
		if (root!=null) {
			printNode(root);
			printTreeByPreOrder(root.leftChild);
			printTreeByPreOrder(root.rightChild);
			return;
		}
		
	}
	public void printTreeByInOrder(BinaryTreeNode root) {
		if (root!=null) {
			printTreeByInOrder(root.leftChild);
			printNode(root);
			printTreeByInOrder(root.rightChild);
		}
		
	}
	public void iterativePreorder(BinaryTreeNode root) {
		BinaryTreeNode p = root;
		Stack travStack = new Stack<>();
		if (p!=null) {
			travStack.push(p);
			while(!travStack.isEmpty()){
				p= (BinaryTreeNode) travStack.pop();
				printNode(p);
				if (p.rightChild!=null) {
					travStack.push(p.rightChild);
				}
				if (p.leftChild!=null) {
					travStack.push(p.leftChild);
				}
			}
		}
		System.out.println();
	}
	
	public void morrisInorder(BinaryTreeNode root){
		System.out.println();
		System.out.println();
		BinaryTreeNode p = root,temp;
		while(p!=null){
			if (p.leftChild==null) {
				printNode(p);
				p = p.rightChild;
			}else {
				temp = p.leftChild;
				while(temp.rightChild != null && temp.rightChild!=p){
					temp =temp.rightChild;
				}
				if (temp.rightChild==null) {
					temp.rightChild = p;
					p = p.leftChild;
				}else {
					printNode(p);
					temp.rightChild = null;
					p = p.rightChild;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree bst = new BinarySearchTree();
		BinaryTreeNode temp = new BinaryTreeNode(15);
		temp.leftChild =new BinaryTreeNode(4);
		temp.leftChild.leftChild = new BinaryTreeNode(1);
		temp.rightChild = new BinaryTreeNode(20);
		temp.rightChild.leftChild = new BinaryTreeNode(16);
		temp.rightChild.rightChild = new BinaryTreeNode(25);
		bst.root = temp;
		bst.breadthFirst(bst.root);
		bst.iterativePreorder(bst.root);
		bst.printTreeByInOrder(temp);
		bst.morrisInorder(temp);
	}

}
