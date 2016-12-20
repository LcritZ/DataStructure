package Queue;

import linkedlist.IntNode;

public class LinkedQueue {
		public IntNode front,rear;
		public int size;
		public LinkedQueue() {
			front=null;
			rear=null;
		}
		public void add(int e){
			if (front==null) {
				front = rear = new IntNode(e);	
			}else{
				IntNode temp=rear;
				rear=temp.link=new IntNode(e);
			}
			size++;
		}
		public void delete(){
			if (front==null) {
				System.out.println("队列为空");
				return ;
			}else {
				IntNode temp=front;
				front=temp.link;
				if (temp==rear) {
					rear=null;
				}
				temp=null;
			}
			--size;
			System.out.println();
		}
		public void print() {
			if (front==null) {
				System.out.println("队列为空");
			}else {
				IntNode temp=front;
				for(temp=front;temp!=null;temp=temp.link){
					System.out.print(temp.data+" ");
				}
			}
			System.out.println();
			
		}
	public static void main(String[] args) {
			LinkedQueue lkq = new LinkedQueue();
			lkq.add(3);
			lkq.add(6);
			lkq.add(4);
			lkq.add(8);
			lkq.add(1);
			lkq.print();		
			System.out.println(lkq.size);
			lkq.delete();
			lkq.delete();

			lkq.print();
			System.out.println(lkq.size);
			lkq.add(4);
			lkq.print();
			
	}

}
