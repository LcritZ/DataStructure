

/**
 *   @date：2017年4月16日 下午8:53:41 
 *  @author Lcrit_Z
 *  description：   
 */
public class ShellSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,5,3,8,6,1,10,4};
		shellSort(arr);
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}
	
	public static void shellSort(int[] arr) {  //希尔排序，每次分出子序列出来，在子序列内部进行排序，
		int incre = arr.length/2;  				//使用的是选择排序，当然用插入排序也是很好的
		while(incre>=1){
			for(int i = 0;i<incre;i++){
				for(int j = i;j < arr.length;j+=incre){
					int index = j;
					for(int k = j;k<arr.length;k+=incre){
						if (arr[k]<arr[index]) {
							index = k;
						}
					}
					int temp = arr[j];
					arr[j] = arr[index];
					arr[index] = temp;
				}
			}
			incre/=2;
		}
	}
	
}
