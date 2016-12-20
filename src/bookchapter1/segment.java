package bookchapter1;

public class segment {
	private	Threeddot  t;
	private	Threeddot  k;
	public segment(Threeddot q,Threeddot w) {
		this.t= q;
		this.k = w;
		
	}
	
	
	public Threeddot getT() {
		return t;
	}


	public Threeddot getK() {
		return k;
	}

	public static void main(String[] args) {
		segment s = new segment(new Threeddot(1,1,1), new Threeddot(0, 0, 0));
		System.out.println(s.getT().getX());
	}

}
