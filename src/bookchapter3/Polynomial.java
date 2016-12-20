package bookchapter3;

import javax.management.RuntimeErrorException;

public class Polynomial implements Cloneable{
	private double[] coe;
	private int degree;
	public Polynomial(int d) {
		degree = d;
		coe = new double[d+1];
	}
	public Polynomial(double d0) {
		// TODO 自动生成的构造函数存根
		degree = 0;
		coe = new double[]{d0};
	}
	public void setcoe(double ... coes) {
		for (int i = 0; i < coe.length; i++) {
			coe[i] = coes[i];			
		}
	}
	public double getcoe(int k) {
		return coe[k];
	}
	public void print() {			
			System.out.print(coe[0]+"+");			
			System.out.print(coe[1]+"x"+"+");		
		
			for (int i = 2; i < coe.length-1; i++) {
				
			System.out.print(coe[i]+"x^"+i+"+");
			}
			
			System.out.println(coe[coe.length-1]+"x^"+(coe.length-1));		
		System.out.println();
	}
	public double eval(double x) {
		double res=0;
		for (int i = 0; i < coe.length; i++) {
			res += coe[i]*Math.pow(x, i);
			
		}
		return res;
	}
	public Polynomial clone() {
		Polynomial polynomial;
		try {
			polynomial = (Polynomial) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException("this class does not implents clone");
		}
		polynomial.coe = coe.clone();
		return polynomial;
	}
	public int getdegree() {
		return degree;
	}
	public static Polynomial add(Polynomial p1,Polynomial p2) {
		int big = 0,small = 0;
		Polynomial test;
		Polynomial polynomial;
		if (p1.degree>p2.degree) {
			big = p1.degree;
			small = p2.degree;
			test = p1.clone();
		}
		else{
			big = p2.degree;
			small = p1.degree;
			test = p2.clone();
		}
		polynomial = new Polynomial(big);
		for (int i = 0; i <= small; i++) {
			polynomial.coe[i]=p1.coe[i]+p2.coe[i];			
		}
		for (int i = small+1; i < big+1; i++) {
			polynomial.coe[i] = test.coe[i];			
		}
		return polynomial;
		
	}
	public static void main(String[] args) {
		Polynomial p = new Polynomial(3);
		p.setcoe(1,2,3,4);
		p.print();
		System.out.println(p.eval(2));
		Polynomial p2 = new Polynomial(5);
		Polynomial p3 = new Polynomial(5);
		p2.setcoe(1,2,3,4,5,6);
		p2.print();
		p3 = p2.clone();
		p3.print();
		System.out.println(add(p, p2).getdegree());
		System.out.println(add(p,p2).getcoe(5));
		System.out.println(add(p,p2).getcoe(4));
		add(p, p2).print();
		System.out.println(add(p, p2).eval(1));
	}

}
