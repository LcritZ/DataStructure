package bookchapter1;

public class Threeddot {
	private double x,z;
	double y;
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public Threeddot(int i,int j, int k) {
		this.x = i;
		this.y = j;
		this.z = k;
	}
	public void replace(int i,int j, int k) {
		this.x = i;
		this.y = j;
		this.z = k;
	}
	public void movex(double i) {
		x +=i;
	}
	public void movey(double i) {
		y +=i;
	}
	public void movez(double i) {
		z +=i;
	}
	public void spinx(double i){
		double j=y;
		double k=z;
		y = j*(Math.cos(i))-k*Math.sin(i);
		z = j*(Math.sin(i))+k*Math.cos(i);
		
	}
	public void spiny(double i){
		double j=x;
		double k=z;
		x = j*(Math.cos(i))+k*Math.sin(i);
		z = -(j*(Math.sin(i)))+k*Math.cos(i);
		
	}
	public void spinz(double i){
		double j=x;
		double k=y;
		x = j*(Math.cos(i))-k*Math.sin(i);
	
		y = j*(Math.sin(i))+k*Math.cos(i);		
	}
	
	public static void main(String[] args) {
		Threeddot t = new Threeddot(1,0,0);
		System.out.println(t.getX()+" "+t.getY()+" "+t.getZ());
		//t.movex();
		System.out.println(t.getX()+" "+t.getY()+" "+t.getZ());
		t.spinz(Math.PI);
		System.out.println(t.getX()+" "+t.getY()+" "+t.getZ());
		//System.out.println(Math.cos(3.14));
	}

}
