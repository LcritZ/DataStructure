/**    
 *  name：BinaryThreadTreeNode   
 *  description：   
 *  author：Lcrit_Z   
 *  date：2017年4月20日 下午2:54:40 
 *  @version 
 */
package BinaryTree;

/**
 *   @date：2017年4月20日 下午2:54:40 
 *  @author Lcrit_Z
 *  description：   
 */
public class BinaryThreadTreeNode {
	public int data;
	public boolean successor;
	public BinaryThreadTreeNode leftChild,rightChild;
	
	/**
	 * 
	 */
	public BinaryThreadTreeNode() {
		// TODO Auto-generated constructor stub
		leftChild = rightChild = null;
		successor = false;
	}
	public BinaryThreadTreeNode (int e)	 {
		this(e,null,null);
	}
	/**
	 * @param e
	 * @param object
	 * @param object2
	 */
	public BinaryThreadTreeNode(int e, BinaryThreadTreeNode l,BinaryThreadTreeNode r) {
		data = e;
		leftChild = l;
		rightChild = r;
		successor = false;
	}
}
