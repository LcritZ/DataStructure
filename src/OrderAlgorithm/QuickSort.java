import org.omg.CORBA.LongLongSeqHelper;

/**    
 *  name：QuickSort   
 *  description：   
 *  author：Lcrit_Z   
 *  date：2017年4月14日 下午3:52:12 
 *  @version 
 */

/**
 *   @date：2017年4月14日 下午3:52:12 
 *  @author Lcrit_Z
 *  description：   
 */
public class QuickSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {6,8,4,12,45,23,2,1,3,4,23,56,246,786,345,243,12,532,673,56,29,6774};
		quickSort(arr, 0, arr.length-1);
		for (int i : arr) {
			System.out.print(i+" ,");
		}
	}
	
	public static void quickSort(int[] arr,int low,int high) {
			if(low<high){
			int p = partition2(arr, low, high);
			quickSort(arr,low,p-1);   //使用递归分别对左子数组，右子数组进行排序
			quickSort(arr, p+1,high);
		}
		
	}
	public static int partition(int [] arr,int low,int high){  //将数组进行分治，即小于关键字放在左边，大于关键字放在右边，关键字每次选择为数组的第一个数
		int temp = arr[low];								//返回值为当前关键字的下标
		while(low<high){
			while(low<high&&arr[high]>temp){
				high--;
			}
			arr[low] = arr[high];					//查找到比关键字小的数时把它放到左边来，此时arr[high]仍为以前的值
			while(low<high&&arr[low]<=temp){
				low++;
			}
			arr[high] = arr[low];				//从左边找到比当前关键字大的数放到右边来，即之前的arr[high]改成此较大数。保证了数组的一致性
		}
		arr[low] = temp;         //此时low==high，关键字赋值给此下标，返回下标。
		return low;
	}
	public static int partition2(int [] arr,int low,int high){ //这里介绍一个不抽象的分治，即我们实时都知道关键字的位置
		int temp = arr[low];
		while(low<high){
			while(low<high&&arr[high]>temp){
				high--;
			}			
			arr[low] = arr[high];    //找到较小值后放到右边
			arr[high] = temp;			//这时将关键字赋值给arr[high]
			while(low<high&&arr[low]<=temp){
				low++;
			}
			arr[high] = arr[low];		//与之前相反，较大值放到左边，并且arr[low]保持为关键字
			arr[low] = temp;
		}
		arr[low] = temp;
		return low;
	}
	
}
