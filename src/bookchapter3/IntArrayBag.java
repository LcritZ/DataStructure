package bookchapter3;



public class IntArrayBag implements Cloneable{
	private  int [] data;
	private  int manyItems;
	public IntArrayBag(int initialCapacity) {
			if (initialCapacity<0) {
				throw new IllegalArgumentException("��ʼ����С��0"+initialCapacity);
			}
			manyItems = 0;
			data = new int[initialCapacity];
	}
	public void add(int element) {
		if (manyItems==data.length) {
			ensureCapacity(manyItems*2+1);
		}
		data[manyItems]=element;
		manyItems++;
	}
	public void addall(IntArrayBag added) {
		ensureCapacity(manyItems+added.manyItems);
		for (int i = 0; i < added.manyItems; i++) {
			data[manyItems+i] = added.data[i];			
		}
		manyItems +=added.manyItems;
	}
	public void addmany(int ... elements) {
		if ((manyItems+elements.length)>data.length) {
			ensureCapacity((manyItems+elements.length)*2);
		}
		System.arraycopy(elements, 0, data, manyItems, elements.length);
		manyItems+=elements.length;
	}
	public void remove(int target) {
		int index=0;
		for(int i:data){
			if (data[i]== target) {
				index = i;
				break;
			}
		}
		if (index==manyItems) {
			throw new NullPointerException("���޴���"+target);
		}
		else{
				manyItems--;
				data[index] = data[manyItems];
				
		}
		
	}
	public int count(int target) {
		int count=0;
		for(int item:data){
			if (item==target) {
				count++;
			}
		}
		return count;
		
	}
	public void ensureCapacity(int i) {
		int [] array;
		if (data.length<i) {
			array = new int [i];
			System.arraycopy(data, 0, array, 0, manyItems);
			data = array;
		}
		
	}
	public void print() {
		for (int i = 0; i < manyItems; i++) {
			System.out.print(data[i]+"  ");
			
		}
	}
	public boolean equals(IntArrayBag b){
		int flag = 0;
		for (int i = 0; i < manyItems; i++) {
			if (data[i]!=b.data[i]) {
				flag = -1;
				break;
			}			
		}
		if (flag==-1) {
			return false;
		}
		return true;
	}
	public static void main(String[] args) {
		IntArrayBag IAB1 = new IntArrayBag(5);
		IAB1.add(3);
		IAB1.addmany(1,2,3);
		IAB1.print();
		System.out.println();
		IntArrayBag IAB2 =new IntArrayBag(8);
		IAB2.addall(IAB1);
		IAB2.print();
		System.out.println();
		IAB2.addmany(1,2,5,6,3,8,9,3,4,3,5);
		IAB2.print();
		System.out.println();
		System.out.println(IAB2.count(3));
		IAB2.remove(3);
		IAB2.print();
		IntArrayBag IAB3 = new IntArrayBag(5);
		IAB3.addmany(3,1,2,3);
		System.out.println();
		IAB3.print();
		System.out.println(IAB1.equals(IAB3));
	}

}
