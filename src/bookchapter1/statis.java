package bookchapter1;

import java.util.ArrayList;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class statis {
	private int sum;
	private int length ;	
	private int minnumber;	
	private int maxnumber;	
	public ArrayList<Integer> array = new ArrayList<Integer>();
	
	 
	public int getMaxnumber() {
		int temp = 0;
		for (int i = 0; i < array.size(); i++) {
			if (array.get(i)>temp) {
				temp = array.get(i);
			}			
		}
		maxnumber = temp;
		return maxnumber;
	}

	public int getMinnumber() {
		int temp = array.get(0);
		for (int i = 1; i < array.size(); i++) {
			if (array.get(i)<temp) {
				temp = array.get(i);
			}			
		}
		minnumber = temp;
		return minnumber;
	}
	
	
	public int getLength() {
		return length;
	}
	public int  setLength() {
		return array.size();
	}
	
	 int getsum(){
		 int temp = 0;
		 for (int i = 0; i < array.size(); i++) {
			temp +=  array.get(i);
		 }
		 sum = temp;
		 return sum;
	 }
	
	public void nextNumber(int x) {
		array.add(x);		
		length = setLength();
		maxnumber = getMaxnumber();
		minnumber = getMinnumber();
		sum = getsum();
	}
	public statis addstatis(statis s2) {
		statis s = new statis();
		for (int i = 0; i < s2.array.size(); i++) {
			s.array.add(s2.array.get(i));			
		}
		return s;
	}

	public static void main(String[] args) {
		statis s = new statis();
		s.nextNumber(1);
		s.nextNumber(9);
		s.nextNumber(1);
		s.nextNumber(1);
		s.nextNumber(1);
		s.nextNumber(1);
		statis s2 = new statis();
		s2.nextNumber(3);
		s2.nextNumber(3);
		s2.nextNumber(8);
		s2.nextNumber(6);
		s2.nextNumber(4);
		s2.nextNumber(7);
		//System.out.println(s.array.size());
		for (int i = 0; i < s.array.size(); i++) {
			System.out.println(s.array.get(i));			
		}	
		System.out.println();
		System.out.println("长度"+s.getLength());
		System.out.println("最大值"+s.getMaxnumber());
		System.out.println("最小值"+s.getMinnumber());
		System.out.println("和"+s.getsum());
		//s.addstatis(s2);
		for (int i = 0; i < s.addstatis(s2).array.size(); i++) {
			System.out.println(s.addstatis(s2).array.get(i));			
		}
	}

}
