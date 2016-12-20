package bookchapter1;

public class PRnumber {
	private int seed,mul,incre,mod;
	public PRnumber(int i,int j,int k,int l) {
		this.seed = i;
		this.mul = j;
		this.incre = k;
		this.mod = l;
	}
	public void alterseed(int i){
		this.seed = i;
	}
	public int generate(){		
		int temp = (mul*seed+incre)%mod;
		this.seed = temp;
		return temp;
		
	}
	public static void main(String[] args) {
		PRnumber pRnumber = new PRnumber(1, 40, 3641, 729);
		System.out.println(pRnumber.generate());
		System.out.println(pRnumber.generate());
	}

}
