package linkedlist;

public class SingleLinkedList {
		public IntNode head,tail;
		public int size=0;
		public int getSize() {
			return size;
		}
		public SingleLinkedList() {
			head = tail = null;
		}
		public boolean isEmpty() {
			return head ==null;
		}
		public void addToHead(int e) {
			head = new IntNode(e);
			if (size==0) {
				tail = head;
				head.pos=1;
			}
			size++;
			
		}
		public void addToTail(int e) {
			if (!isEmpty()) {
				tail.link = new IntNode(e);
				tail = tail.link;
			}
			else{
				head = tail = new IntNode(e);
			}
		}
		public void addfromtail(int e){
			if (size==0) {
				head=tail=new IntNode(e);
				head.pos=1;
			}
			head = new IntNode(e,head);
			size++;
			//IntNode temp=head;
			int i=1;
			for(IntNode temp=head;temp!=null;temp=temp.link){
				temp.pos=i;
				i++;
			}
			
		}
		public void addfromhead(int e) {
			if (size==0) {
				head=tail=new IntNode(e);
				tail.pos=head.pos=1;
			}else{
			tail.link= new IntNode(e);
			tail.link.pos=tail.pos+1;
			tail = tail.link;	
			}
			size++;
		}
		public IntNode getpos(int position) {
			IntNode temp;
			for(temp = head;temp!=null;temp=temp.link){
				if (temp.pos==position) {
					break;
				}
			}
			System.out.print("位置："+temp.pos+"数据:"+temp.data);
			return temp;
		}
		public int deleteFromHead() {
			int e = head.data;
			if (head==tail) {
				head = tail = null;
			}
			else head = head.link;
			return e;
		}
		public void print() {
			for(IntNode temp = head;temp!=null;temp = temp.link ){
				System.out.print(temp.data+" ");
			}
		}
		public void printf(IntNode h) {
			for(IntNode temp=h;temp!=null;temp=temp.link){
				System.out.print(temp.data+" ");
			}
				
		}
		public void printreverse() {
			for(IntNode temp = tail;temp!=null;temp=temp.link){
			
			System.out.print(temp.data+" ");
			}
			
		}
		public IntNode[] division(SingleLinkedList s,int i){
			IntNode smaller,bigger;
			SingleLinkedList Small = new SingleLinkedList();
			SingleLinkedList Big = new SingleLinkedList();		
			for(IntNode temp=s.head;temp!=null;temp=temp.link){
				if (temp.data<=i) {
					Small.addfromhead(temp.data);
				}else {
					Big.addfromhead(temp.data);
				}
			}
			smaller=Small.head;
			bigger=Big.head;
			return new IntNode[]{smaller,bigger};
		}
		
	public static void main(String[] args) {
		SingleLinkedList s1 = new SingleLinkedList();
		//s1.addToHead(2);
		s1.addfromhead(3);
		s1.addfromhead(5);
		s1.addfromhead(9);
		s1.addfromhead(6);
		s1.addfromhead(3);
		s1.addfromhead(8);
		s1.addfromhead(4);
		s1.print();
		System.out.println();
		s1.getpos(4);
		System.out.println();
		s1.printf((s1.division(s1, 5))[0]);
		System.out.println();
		s1.printf((s1.division(s1, 5))[1]);
	}

}
