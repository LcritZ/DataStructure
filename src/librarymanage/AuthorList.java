/**    
 *  name：AuthorList   
 *  description：   
 *  author：Lcrit_Z   
 *  date：2017年3月25日 下午8:19:51 
 *  @version 
 */
package librarymanage;

import java.util.LinkedList;

/**
 *   @date：2017年3月25日 下午8:19:51 
 *  @author Lcrit_Z
 *  description：   
 */
@SuppressWarnings("rawtypes")
public class AuthorList extends LinkedList {
	
	//LinkedList<Author> authorList;
	/**
	 * 
	 */
	/**
	 * 
	 */
	public AuthorList() {
		super();
	}
	
	/* (non-Javadoc)
	 * @see java.util.LinkedList#add(java.lang.Object)
	 */
	public void display(){
		Object[] authors = toArray();
		for(int i=0;i<authors.length;i++){
			((Author)authors[i]).display();
		}
	}
	
}
