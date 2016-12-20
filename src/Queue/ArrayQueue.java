package Queue;

public class ArrayQueue {
		public int size;
		public int[] queue;
		public int tail=-1;
		public int head=-1;
		public ArrayQueue(int e) {
			size=e;
			queue=new int[e];
		}

	public void add(int e) {
		if (tail == size-1) {
			System.out.println("队列已满" + e+" 未加入到队列中");
			return ;
		}	
		if (head==-1) {
			head=0;
		}		
		queue[tail+1] = e;
		System.out.println(e+"已加入队列");
		tail=tail+1;
		
	}
		public void delete(){
			if (head==tail) {
				System.out.println("队列为空");
				return ;
			}
			int item=queue[head];
			System.out.println("删除的数为"+item);
			queue[head]=0;
			head=(head+1)%size;
		}
		public void print() {
			System.out.println();
			for(int i=head;i<=tail;i++){				
				System.out.print(queue[i]+" ");
			}
		}
	public static void main(String[] args) {
		//System.out.println("scfef");
			ArrayQueue aq = new ArrayQueue(6);
			aq.add(3);
			aq.add(4);
			aq.add(7);			
			aq.add(1);
			aq.add(8);
//			aq.add(7);
//			aq.add(6);
			aq.print();
			aq.delete();
			aq.print();
			aq.add(3);
			aq.print();
	}

}
