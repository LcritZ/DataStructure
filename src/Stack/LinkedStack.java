package Stack;

import linkedlist.*;

public class LinkedStack {
		public IntNode head,tail;
		public int size;
		public LinkedStack() {
			head=tail=null;
			size=0;
		}
		public void add(int e) {
			if (size==0) {
				head=tail=new IntNode(e);
				head.pos=1;
				size++;
			}else {
				head=new IntNode(e,head);
				head.pos=head.link.pos+1;
				size++;
			}
		}
		public void delete(){
			IntNode temp=head;
			head=temp.link;
			temp=null;
			size--;
		}
		public void print(){
			System.out.println();
			IntNode temp=head;
			for(int i=size;i>0;i--){
				System.out.print(temp.data+" ");
				temp=temp.link;
			}
			System.out.println();
		}
	public static void main(String[] args) {
		LinkedStack ls = new LinkedStack();
		ls.add(3);
		ls.add(6);
		ls.add(4);
		ls.add(5);
		ls.add(9);
		ls.add(7);
		ls.print();
		System.out.println(ls.head.pos);
		ls.delete();
		ls.print();
		System.out.println(ls.size);
		System.out.println(ls.tail.pos);
		System.out.println(ls.head.pos);
	}

}
