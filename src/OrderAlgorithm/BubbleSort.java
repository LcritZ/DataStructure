/**    
 *  name：BubbleSort   
 *  description：   
 *  author：Lcrit_Z   
 *  date：2017年4月14日 下午12:17:12 
 *  @version 
 */

/**
 *   @date：2017年4月14日 下午12:17:12 
 *  @author Lcrit_Z
 *  description：   
 */
public class BubbleSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,2,2,4,7,8};
		bubbleSort(arr);
		for (int i : arr) {
			System.out.print(i+", ");
		}

	}
	public static void bubbleSort(int[] arr) {        //时间复杂度：O(n*2)
		int count = 0;
		for(int i = 0;i<arr.length;i++){           //循环遍历，每次找出最大值放在数组最后
			int flag = 0;
			for(int j = 1;j<arr.length-i;j++){			//子循环每次比较相邻的两个数，逐个的推到最后	
				if (arr[j]<arr[j-1]) {	//只是在小于时才交换，所以是稳定的排序，也就是说不会改变相对位置
					flag=1;
					count++;
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
			if (flag == 0) {			//flag记录了单次遍历是否有过交换，若没有则说明在这之后都没有
				System.out.println(count);  //打印出我们共进行了多少次遍历
				break;
			}
		}
		
	}
}
