/**    
 *  name：BinarySearchThreadTree   
 *  description：   
 *  author：Lcrit_Z   
 *  date：2017年4月20日 下午2:50:13 
 *  @version 
 */
package BinaryTree;

import java.util.Stack;

import Queue.Queue;
import sun.launcher.resources.launcher;

/**
 *   @date：2017年4月20日 下午2:50:13 
 *  @author Lcrit_Z
 *  description：   
 */
public class BinaryThreadTree {

	public BinaryThreadTreeNode root;
	
	/**
	 * 
	 */
	public BinaryThreadTree() {
		root = null;
	}
	
	public void printNode(BinaryThreadTreeNode p) {
		System.out.print(p.data+" ");
	}
	
	public BinaryThreadTreeNode search(BinaryThreadTreeNode p,int e) {
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
	
	public void breadthFirst(BinaryThreadTreeNode root) {
		BinaryThreadTreeNode p=root;
		Queue q = new Queue();
		if (p!=null) {
			q.enqueue(p);
			while(!q.isEmpty()){
				p = (BinaryThreadTreeNode) q.dequeue();
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
	
	public void printTreeByPreOrder(BinaryThreadTreeNode root) {
//		if (root==null) {
//			return;
//		}
		if (root!=null) {
			printNode(root);
			printTreeByPreOrder(root.leftChild);
			printTreeByPreOrder(root.rightChild);
			return;
		}
		
	}
	public void printTreeByInOrder(BinaryThreadTreeNode root) {
		if (root!=null) {
			printTreeByInOrder(root.leftChild);
			printNode(root);
			printTreeByInOrder(root.rightChild);
		}
		
	}
	public void iterativePreorder(BinaryThreadTreeNode root) {
		BinaryThreadTreeNode p = root;
		Stack travStack = new Stack<>();
		if (p!=null) {
			travStack.push(p);
			while(!travStack.isEmpty()){
				p= (BinaryThreadTreeNode) travStack.pop();
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
	
	public void threadInorder(BinaryThreadTreeNode root) {
		BinaryThreadTreeNode pre = null,p = root;
		if (p!=null) {
			while(p.leftChild!=null){
				pre = p;
				p = p.leftChild;
			}
			while(p!=null){
				printNode(p);
				if (p.rightChild!=null) {
					pre = p;
				}
				p = p.rightChild;
				if (p!=null&&!pre.successor) {
					while(p.leftChild!=null){
						p = p.leftChild;
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryThreadTree bst = new BinaryThreadTree();
		BinaryThreadTreeNode temp = new BinaryThreadTreeNode(15);
		temp.leftChild =new BinaryThreadTreeNode(4);
		temp.leftChild.leftChild = new BinaryThreadTreeNode(1);
		temp.rightChild = new BinaryThreadTreeNode(20);
		temp.rightChild.leftChild = new BinaryThreadTreeNode(16);
		temp.rightChild.rightChild = new BinaryThreadTreeNode(25);
		bst.root = temp;
		bst.breadthFirst(bst.root);
		bst.iterativePreorder(bst.root);
		bst.printTreeByInOrder(temp);
		System.out.println("??");
		bst.threadInorder(temp);
	}


}
