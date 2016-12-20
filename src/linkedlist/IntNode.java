package linkedlist;

public class IntNode {
	public int data;
	public int pos;
	public IntNode link;	
	public int getData() {
		return data;
	}
	public IntNode getLink() {
		return link;
	}
	public void setData(int data) {
		this.data = data;
	}
	public void setLink(IntNode link) {
		this.link = link;
	}
	public IntNode(int d) {
		this(d,null);
	}
	public IntNode(int d,IntNode l) {
		data = d;
		link = l;
	}
}
