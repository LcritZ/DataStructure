package linkedlist;

public class DoubleLinkedList {
		private int size=0;
		public DoubleLinkNode head;
		DoubleLinkNode tail;
		public DoubleLinkedList() {
			head=tail= null;
		}
		public void add(int e){
			if (head==null) {
				head=tail=new DoubleLinkNode(e);
				head.pos=tail.pos=1;
			}else {
				tail.rightLink=new DoubleLinkNode(e,tail,null);
				tail.rightLink.pos=tail.pos+1;
				tail=tail.rightLink;
			}
			size++;
		}
		public void delete(int e){
			DoubleLinkNode temp ;
			for(temp=head;temp!=null;temp=temp.rightLink){
				if (temp.data==e) {
					DoubleLinkNode temp2=temp;
					//DoubleLinkNode temp3=temp.rightLink;
					if (temp.rightLink==null) {
						temp.leftLink.rightLink=null;
						tail=temp.leftLink;
						System.out.println("删除的数字:"+e+"在位置："+temp.pos);
						
					}else if (temp.leftLink==null) {
						head=temp.rightLink;
						temp.rightLink.leftLink=null;
						System.out.println("删除的数字:"+e+"在位置："+temp.pos);
					}else{
						temp.rightLink.leftLink=temp.leftLink;
						temp.leftLink.rightLink=temp.rightLink;
						System.out.println("删除的数字:"+e+"在位置："+temp.pos);
					}
					for(DoubleLinkNode temp3=temp.rightLink;temp3!=null;temp3=temp3.rightLink){
						temp3.pos=temp3.pos-1;
					}
					
					temp=temp.leftLink;
					temp2=null;
					size--;
				}
			}
			
		}
		public void	 alter(int postion,int e) {
			DoubleLinkNode temp;
			for(temp=head;temp!=null;temp=temp.rightLink){
				if (temp.pos==postion) {
					temp.data=e;
				}
			}
		}
		public void retrieve(int e) {
			DoubleLinkNode temp;
			for(temp=head;temp!=null;temp=temp.rightLink){
				if (temp.data==e) {
					System.out.println("数字："+e+"在位置："+temp.pos);
				}
			}
		}
		public void print() {
			DoubleLinkNode temp;
			for(temp=head;temp!=null;temp=temp.rightLink){
				System.out.print(temp.data+", ");
			}
			System.out.println();
		}
		public void printback() {
			DoubleLinkNode temp;
			for(temp=tail;temp!=null;temp=temp.leftLink){
				System.out.print(temp.data+", ");
			}
			System.out.println();
		}
	
	public static void main(String[] args) {
		DoubleLinkedList dll = new DoubleLinkedList();
		dll.add(1);
		dll.add(9);
		dll.add(4);
		dll.add(3);
		dll.add(6);
		dll.add(3);
		dll.add(7);		
		dll.add(3);
		dll.print();
		dll.printback();
		dll.alter(3, 0);
		dll.print();
		dll.delete(3);
		dll.print();
		dll.retrieve(9);
		dll.retrieve(7);
		dll.retrieve(6);
		
	}

}
