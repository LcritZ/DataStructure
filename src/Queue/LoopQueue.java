package Queue;


public class LoopQueue {

	public int size;
	public int[] queue;
	public int tail = 0;
	public int head = 0;

	public LoopQueue(int e) {
		size = e;
		queue = new int[e];
	}

	public void add(int e) {
		if (((tail+1)%size)==head ){
			System.out.println("队列已满  " + e + "未加入到队列中");
			return;
		}else {			
		queue[tail] = e;
		System.out.println(e+"已加入队列");
		tail = (tail + 1)%size;
		System.out.print(" ");
		}
	}

	public void delete() {
		if (head == tail) {
			System.out.println("队列为空");
			return;
		}
		int item = queue[head];
		System.out.println("删除的数为" + item);
		queue[head] = 0;
		head = (head + 1) % size;
	}

	public void print() {
		System.out.println("队列为：");
		for (int i = 0; i < size; i++) {
			if (queue[i]!=0) {				
				System.out.print(queue[i] + " ");
			}
		}
		System.out.println();
		System.out.println();
	}

	public static void main(String[] args) {
		// System.out.println("scfef");
		LoopQueue lq = new LoopQueue(7);
		lq.add(3);
		lq.add(4);
		lq.add(7);		
		lq.add(8);
		lq.add(7);
		lq.add(7);
		lq.add(6);
		lq.print();
		lq.delete();
		lq.print();
		lq.add(3);
		lq.print();
		lq.delete();
		lq.print();
		lq.add(9);
		lq.print();
		lq.delete();
		lq.print();
		lq.delete();
		lq.delete();
		lq.print();
		lq.add(3);
		lq.print();
		
	}

}
