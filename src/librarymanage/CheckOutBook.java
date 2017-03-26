/**    
 *  name：CheckOutBook   
 *  description：   
 *  author：Lcrit_Z   
 *  date：2017年3月25日 下午8:18:57 
 *  @version 
 */
package librarymanage;

/**
 *   @date：2017年3月25日 下午8:18:57 
 *  @author Lcrit_Z
 *  description：   
 */
public class CheckOutBook {
	public Author author = null;
	public Book book = null;
	/**
	 * 
	 */
	public CheckOutBook() {
		// TODO Auto-generated constructor stub
	}
	
	
	public boolean equals(CheckOutBook obj) {
		// TODO Auto-generated method stub
		return (this.book.title.equals(obj.book.title))
				&&(this.author.name.equals(obj.author.name));
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " --*-- "+author.name+" , "+book.title+"\n";
	}
}
