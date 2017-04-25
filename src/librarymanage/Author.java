/**    
 *  name：Author   
 *  description：   
 *  author：Lcrit_Z   
 *  date：2017年3月25日 下午8:18:05 
 *  @version 
 */
package librarymanage;

//import netease.Author;

/**
 *   @date：2017年3月25日 下午8:18:05 
 *  @author Lcrit_Z
 *  description：   
 */
public class Author {
		public String name;
		public BookList books = new BookList();
		/**
		 * 
		 */
		public Author() {
			// TODO Auto-generated constructor stub
		}
		
		/* (non-Javadoc)
		* @see java.lang.Object#equals(java.lang.Object)
		*/
		@Override
		public boolean equals(Object obj) {
			return this.name.equals(((Author) obj).name);
		}
		public void display() {
			System.out.println(this.name);
			books.display();
		}
		/* (non-Javadoc)
		* @see java.lang.Object#toString()
		*/
		@Override
		public String toString() {
		// TODO Auto-generated method stub
			return name;
		}
		
	
}
