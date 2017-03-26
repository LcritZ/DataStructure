/**    
 *  name：PatronList   
 *  description：   
 *  author：Lcrit_Z   
 *  date：2017年3月25日 下午8:20:39 
 *  @version 
 */
package librarymanage;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *   @date：2017年3月25日 下午8:20:39 
 *  @author Lcrit_Z
 *  description：   
 */
public class PatronList extends LinkedList{
	/**
	 * 
	 */
	public PatronList() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public void display() {
		Iterator<Patron> ite = iterator();
		while(ite.hasNext()){
			((Patron) ite.next()).display();
		}
	}
}
