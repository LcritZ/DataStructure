/**    
 *  name：BookList   
 *  description：   
 *  author：Lcrit_Z   
 *  date：2017年3月25日 下午8:20:23 
 *  @version 
 */
package librarymanage;

import java.util.LinkedList;

/**
 *   @date：2017年3月25日 下午8:20:23 
 *  @author Lcrit_Z
 *  description：   
 */
public class BookList extends LinkedList{
	
	
	public BookList() {
		super();
	}

	public void display() {
		// TODO Auto-generated method stub
		for(int i = 0 ;i<size();i++){
			System.out.print(get(i)+" ");
		}
	}


	

	

}
