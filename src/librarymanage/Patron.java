/**    
 *  name：Patron   
 *  description：   
 *  author：Lcrit_Z   
 *  date：2017年3月25日 下午8:18:34 
 *  @version 
 */
package librarymanage;

/**
 *   @date：2017年3月25日 下午8:18:34 
 *  @author Lcrit_Z
 *  description：   
 */
public class Patron {

	public String name;
	
	public BookList list = new BookList();
	/**
	 * 
	 */
	
	public Patron() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return this.name.equals(((Patron)obj).name);
	}
	public void display() {
		if (!list.isEmpty()) {
			System.out.println(this.name+" has brrow follwing books:");
			list.display();
		}else {
			System.out.println(name+" has no books");
		}
	}
}
