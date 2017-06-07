/**    
 *  name：SelectSort   
 *  description：   
 *  author：Lcrit_Z   
 *  date：2017年4月14日 下午2:23:39 
 *  @version 
 */

/**
 *   @date：2017年4月14日 下午2:23:39 
 *  @author Lcrit_Z
 *  description：   
 */
public class SelectSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,5,3,8,6,1,10,4,0};
		selectSort2(arr);
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}
	public static void selectSort(int[] arr) {		//每次选出最大值 与冒泡排序相似，但不同的是选择排序是只是比较，取下标，不会每相邻两个数都交换，每次遍历只交换一次。
		for (int i = 0; i < arr.length; i++) {
			int index = 0;
			for (int j = 0; j < arr.length-i; j++) { //每次遍历找出最小值记录该最小值的下标
				if(arr[j]>arr[index]){
					index = j;
				}
			}
			int temp = arr[arr.length-i-1];     //获取最小值放到当前遍历的起始点。
			arr[arr.length-i-1] = arr[index];   
			arr[index] = temp;					//将原本的值放到最小值的那个下标去
		}
	}
	public static void selectSort2(int[] arr) { //每次选出最小值
		for(int i = 0;i<arr.length-1;i++){
			int index = i+1;
			for (int j = i; j < arr.length; j++) {
				if (arr[j]<arr[index]) {
					index = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[index];
			arr[index]  = temp;
		}
	}
}
