package linkedlist;

public class DoubleLinkNode {		
		public int data;
		public int pos;
		public DoubleLinkNode leftLink,rightLink;	
		public int getData() {
			return data;
		}
			
		public DoubleLinkNode getLeftLink() {
			return leftLink;
		}

		public void setLeftLink(DoubleLinkNode leftLink) {
			this.leftLink = leftLink;
		}

		public DoubleLinkNode getRightLink() {
			return rightLink;
		}

		public void setRightLink(DoubleLinkNode rightLink) {
			this.rightLink = rightLink;
		}

		public DoubleLinkNode(int d) {
			data=d;
			leftLink=rightLink=null;
		}
		public DoubleLinkNode(int d,DoubleLinkNode left,DoubleLinkNode right) {
			data = d;
			leftLink = left;
			rightLink = right;
			
		}
}



