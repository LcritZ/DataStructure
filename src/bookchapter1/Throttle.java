package bookchapter1;


public class Throttle{
	private int top;
	private int position;
	
	public Throttle(int size){
		if(size<0){
			throw new IllegalArgumentException("参数小于0"+size);
		}
		top  = size;
	}
	public Throttle(){
		top = 1;
		position = 0;
	}

	public int getTop() {
		return top;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}
	public double getFlow() {
		return (double)position/(double)top;
	}
	public boolean isOn(){
		return (position>0);
	}
	public void shutOff() {
		position = 0;
	}
	public void shift(int shift) {
		if (shift>(top-position)) {
			position = top;
		}
		else if ((shift+position)<0) {
			position = 0;
		}
		else {
			position +=shift;
		}
	}
	public boolean isHalf() {
		return getPosition()>(0.5*getTop());
	}
	public static void main(String []args) {
		Throttle t1 = new Throttle(15);
		t1.setPosition(3);
		System.out.println(t1.getPosition());
		System.out.println(t1.isHalf());
		t1.shift(5);
		System.out.println(t1.getPosition()+" "+t1.isHalf());
		Throttle t2;
		t2 = t1;
		t2.shift(-2);
		System.out.println(t1.getPosition());
//		Throttle t3 = null;
//		t2 = t3;
//		System.out.println(t2.getTop());
		System.out.println(t1==t2);
	}
}

