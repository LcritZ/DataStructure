package Stack;

public class ArrayStack {
		private int size,top;
		public int[] stack;
		public ArrayStack(int e) {
			size=e;
			top=-1;
			stack = new int[e];
		}
		public void push(int e) {
			if (top==size-1) {
				System.out.println("栈已满"+e+"未被压入栈");
				return ;				
			}else{
				stack[++top]=e;
			}
			
		}
		public int pop() {
			int temp;
			if (top==-1) {
				System.out.println("栈为空");
				return -1;
			}else{
				temp=stack[top--];
				return temp;
			}
		}
		public void alter(int pos,int e) {
			if (pos<0||pos>size) {
				System.out.println("无此位置");
				return ;
			}else{
				stack[pos-1]=e;
			}
			
		}
		public void retrieve(int e ) {
			int flag=0;
			for(int i=0;i<top;i++){
				if (stack[i]==e) {
					System.out.println(e+"在位置："+(i+1));
					 flag = 1;
				}
			}
			if (flag==0) {
				System.out.println("无此数");
			}
			
		}
		public void clear() {
			stack=null;
			top=-1;
		}
		public void print() {
			if (stack==null) {
				System.out.println("栈为空");
			}else{
			for (int i = 0; i <= top; i++) {
				System.out.print(stack[i]+",  ");
				
			}
			System.out.println();
			}
		}
	public static void main(String[] args) {
			ArrayStack  as = new ArrayStack(3);
			as.push(2);
			as.push(9);
			as.push(4);
			as.push(6);
			as.push(7);
			as.print();
			as.alter(3, 0);
			as.print();
			as.clear();
			as=new ArrayStack(2);
			as.push(3);
			as.push(3);
			as.print();
	}

}
