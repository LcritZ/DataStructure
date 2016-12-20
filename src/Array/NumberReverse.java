package Array;

public class NumberReverse {
	
	void Reverse(int R[],int l,int r){
		int i,j;
		int temp;
		for ( i = l,j=r; i<=j; i++,j--) {
			temp=R[i];
			R[i]=R[j];
			R[j]=temp;			
		}
	}

	public static void main(String[] args) {
		int R[]={1,2,3,4,5,2,6,7,1,9,4,8,1};
		new NumberReverse().Reverse(R, 0, 3);
		new NumberReverse().Reverse(R, 4, 12);
		new NumberReverse().Reverse(R, 0, 12);
		for (int i = 0; i < R.length; i++) {
			System.out.print(R[i]+"  ");
			
		}
		
	}

}
