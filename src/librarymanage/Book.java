/**    
 *  name：Book   
 *  description：   
 *  author：Lcrit_Z   
 *  date：2017年3月25日 下午8:18:18 
 *  @version 
 */
package librarymanage;

/**
 *   @date：2017年3月25日 下午8:18:18 
 *  @author Lcrit_Z
 *  description：   
 */
public class Book {
	public String title;
	public Patron p = null;
	
	/**
	 * 
	 */
	public Book() {
		// TODO Auto-generated constructor stub
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		return this.title.equals(((Book)obj).title);
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " --  * --  "+title+(p !=null?"--checked out to "+p.name:"")+"\n";
	}
	
	
}
