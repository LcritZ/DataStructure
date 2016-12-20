package bookchapter1;

public class Quadratic {
	private double a,b,c;
	public Quadratic(double i,double j,double k) {
		this.a = i;
		this.b = j;
		this.c = k;
	}
	public void changecoe(double i,double j,double k) {
		this.a = i;
		this.b = j;
		this.c = k;
	}
	public double cal(double i) {
		return a*(i*i)+b*i+c;
	}
	public  Quadratic sum(Quadratic q1) {
		this.a = q1.a+a;
		this.b = q1.b+b;
		this.c = q1.c+c;
		return this;
	}
	public double solveequation() throws NullPointerException{
//		case (this){
//			case 1: 
//		}
		if (c==0&a==0&b==0) {
		throw	new NullPointerException("所有值都为解");
		}
		if (a==0&b==0&c!=0) {
			return 1;
		}
		if (a==0&b!=0) {
			return (-c)/b;
		}
		if (a!=0&(b*b<4*a*c)) {
			throw new NullPointerException("无解");
			
		}
		if (a!=0&(b*b==4*a*c)) {
			return (-b)/(2*a);
		}
		if (a!=0&&((b*b)>(4*a*c))){
			return (-b-(Math.sqrt(b*b-4*a*c)))/(2*a);
		}
		else throw new NullPointerException("wujie");
	}
	public static void main(String[] args) {
		Quadratic q = new Quadratic(1, 2, 3);
		System.out.println(q.cal(1));
		q.sum(q);
		System.out.println(q.cal(1));
		Quadratic q2 = new Quadratic(1, -4,0 );
		System.out.println(Math.sqrt(16));
		System.out.println(q2.solveequation());
	}

}
