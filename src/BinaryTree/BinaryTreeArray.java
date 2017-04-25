package BinaryTree;


public class BinaryTreeArray {
	public int size,top;
	public int[][] BTA;
	public BinaryTreeArray(int e) {
		size=e;
		top=-1;
		BTA = new int[e][1];
	}
	public void add(int e) {
		top++;
		//System.out.println(top);
		BTA[top][0]=e;
	}
	public void add(int pos,int data) {
		if (pos>size) {
			throw new ArrayIndexOutOfBoundsException("超出范围"+size);
		}
		if (pos>top) {
			top=pos;
			BTA[pos][0]=data;
		}else {
			BTA[pos][0]=data;
		}
	}
	public void printOrder(){
		for(int i=0;i<=top;i++){
			System.out.print(BTA[i][0]+", ");
		}
		System.out.println();
	}
	public void ChangeNode(int pos,int data) {
		BTA[pos-1][0]=data;
	}
	public void ChangeSize(int e ){
		int [][] temp=BTA.clone();
		BTA=null;
		size=e;
		BTA = new int[e][1];
		for(int i=0;i<e;i++){
			if (i<temp.length) {
				BTA[i][0]=temp[i][0];				
			}else {
				BTA[i][0]=0;
			}			
		}
		
	}
	public static void main(String[] args) {
			BinaryTreeArray bta=new BinaryTreeArray(3);
			
			bta.add(3);
			bta.add(3);
			bta.add(3);
			bta.printOrder();
			bta.ChangeSize(10);
			bta.add(5);
			bta.add(5);
			bta.printOrder();
			bta.ChangeNode(3, 6);
			bta.printOrder();
			bta.add(7,10);
			bta.printOrder();
	}

}
