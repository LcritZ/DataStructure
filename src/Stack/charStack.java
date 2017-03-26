package Stack;

public class charStack {
	private int size, top;
	public char[] stack;

	public charStack(int e) {
		size = e;
		top = -1;
		stack = new char[e];
	}

	public void push(char temp) {
		if (top == size - 1) {
			System.out.println("栈已满" + temp + "未被压入栈");
			return;
		} else {
			top +=1;
			stack[top] = temp;
		}

	}

	public char pop() {
		char temp;
		if (top == -1) {
			System.out.println("栈为空");
			return ' ';
		} else {
			temp = stack[top];
			top=top-1;
			return temp;
		}
	}

	public void alter(int pos, char e) {
		if (pos < 0 || pos > size) {
			System.out.println("无此位置");
			return;
		} else {
			stack[pos - 1] = e;
		}

	}

	public void retrieve(int e) {
		int flag = 0;
		for (int i = 0; i < top; i++) {
			if (stack[i] == e) {
				System.out.println(e + "在位置：" + (i + 1));
				flag = 1;
			}
		}
		if (flag == 0) {
			System.out.println("无此数");
		}

	}

	public void clear() {
		stack = null;
		top = -1;
	}

	public void print() {
		if (stack == null) {
			System.out.println("栈为空");
		} else {
			for (int i = 0; i <= top; i++) {
				System.out.print(stack[i]);
			}
			System.out.println();
		}
	}

	public charStack input(String string) {
		size = string.length();
		top = size - 1;
		stack = new char[string.length()];
		for (int i = 0; i < string.length(); i++) {
			stack[i] = string.charAt(i);
		}
		return this;
	}

	public charStack ChangeToPostfix() {
		charStack temp = new charStack(size);
		charStack postfix = new charStack(size);
		for (int i = 0; i < size; i++) {
			if (stack[i] >= '0' & stack[i] <= '9') {
				postfix.push(stack[i]);
			} else if (stack[i]== '(') {
				temp.push(stack[i]);
			} else if (stack[i] == ')') {
				while(temp.top!=-1){
					char q=temp.pop();
					if (q=='(') {
						continue;
						//System.out.println("(");
					}else {
						postfix.push(q);
						
					}
				}
				System.out.println("temp.top:"+temp.top);
			} else {
				if (stack[i] == '+' || stack[i] == '-') {
					while ((temp.stack[0] != '(') && temp.top != -1) {
						char c = temp.pop();
						postfix.push(c);

					}
					
					temp.push(stack[i]);
				} else {
					temp.push(stack[i]);
				}
			}

		}
		while (temp.top != -1) {
			char q=temp.pop();
			if(q=='('){
				System.out.println("括号被清除");
				continue;
			}else {						
			postfix.push(q);
		
		}
		}
		return postfix;
	}
	public int calculator(){
		ArrayStack temp=new ArrayStack(top);
		for (int i = 0; i <= top; i++) {
			if (stack[i]>='0'&&stack[i]<='9') {
				temp.push(stack[i]-48);
				//System.out.println(temp.stack[0]);
			}else if(stack[i]=='+'){
				int c=  ((temp.pop()+temp.pop()));
				System.out.println(c);
				temp.push(c);
			}else if (stack[i]=='-') {
				int c= -(temp.pop()-temp.pop());
				System.out.println(c);
				temp.push(c);
			}else if(stack[i]=='*'){
				int c= (temp.pop()*temp.pop());
				System.out.println(c);
				temp.push(c);
			}else if(stack[i]=='/'){
				int q=temp.pop();
				int w=temp.pop();
				int c=  (w/q);
				System.out.println(c);
				temp.push(c);
			}
			
		}
		int t=temp.pop();
		return t;
	}
	public static void main(String[] args) {
		charStack cs = new charStack(0);
		String string = "((2*3)-8)+((3-2)*2)";
		//System.out.println(9/3);
		cs.input(string);
		cs.print();
		charStack cc = cs.ChangeToPostfix();
		cc.print();	
				
		System.out.println(cc.calculator());
	}

}
