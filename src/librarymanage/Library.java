/**    
 *  name：Library   
 *  description：   
 *  author：Lcrit_Z   
 *  date：2017年3月25日 下午8:44:51 
 *  @version 
 */
package librarymanage;

import java.io.BufferedReader;
import java.io.InputStreamReader;


/**
 *   @date：2017年3月25日 下午8:44:51 
 *  @author Lcrit_Z
 *  description：   
 */
public class Library {
	private AuthorList[] catlog = new AuthorList[27];
	private PatronList[] reader = new PatronList[27];
	private String input;
	private BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
	
	/**
	 * 
	 */
	public Library() {
		for(int i=0;i< 27;i++){
			catlog[i] = new AuthorList();
			reader[i] = new PatronList();
		}
	}
	
	public String getString(String msg) {
		System.out.println(msg+"  ");
		System.out.flush();
		try {
			input = buffer.readLine();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return input.substring(0, 1).toUpperCase()+input.substring(1);
	}
	
	public void status() {
		System.out.println("library now has following books:\n");
		for(int i = 0 ;i<27;i++){
			if (!catlog[i].isEmpty()) {
				catlog[i].display();
			}
		}
		System.out.println("\n now there are following people are reading books:\n");
		for(int i = 0 ;i<27;i++){
			if (!reader[i].isEmpty()) {
				reader[i].display();
			}
		}
		
	}
	
	@SuppressWarnings("unchecked")
	public void includeBook() {
		Author new_author = new Author();
		int old_author;
		Book new_book = new Book();
		new_author.name = getString("please input author's name: \n");
		new_book.title = getString("please input book's title");
		old_author = catlog[new_author.name.charAt(0)-'A'].indexOf(new_author);
		System.out.println("是否已有该作者："+old_author);
		if (old_author==-1) {
			new_author.books.add(new_book);
			catlog[new_author.name.charAt(0)-'A'].add(new_author);
			System.out.println(catlog[new_author.name.charAt(0)-'A'].get(0).toString());
			System.out.println("zuozhe xiabiao:"+catlog[new_author.name.charAt(0)-'A'].indexOf(new_author));
		}else{
			((Author)catlog[new_author.name.charAt(0)-'A']
					.get(old_author)).books.add(new_book);
		}
		
		
	}
	
	public void checkOutBook(){
		Patron patron = new Patron(),patronRef;
		Author author = new Author(), authorRef = new Author();
		Book book = new Book();
		int patronIndex , bookIndex = -1,authorIndex = -1;
		patron.name =getString("please input patron's name:");
		int count = 0;
		while(authorIndex ==-1){
			author.name = getString("please input author's name:");
			authorIndex = catlog[author.name.charAt(0)-'A'].indexOf(author);
			System.out.println("authorindex:"+authorIndex);
			if (authorIndex==-1) {
				System.out.println("misspelled author's name");
			}
			count++;
			if (count==3) {
				return ;
			}
			
		}
		while(bookIndex==-1){
			book.title = getString("please input book's title :");
			authorRef = (Author)catlog[author.name.charAt(0)-'A'].get(authorIndex);
			bookIndex = authorRef.books.indexOf(book);
			if (bookIndex == -1) {
				System.out.println("misspelled title");
			}
		}
		Book bookref = (Book)authorRef.books.get(bookIndex);
		CheckOutBook booktoCheckedout = new CheckOutBook();
		booktoCheckedout.author = authorRef;
		booktoCheckedout.book = bookref;
		patronIndex = reader[patron.name.charAt(0)-'A'].indexOf(patron);
		if (patronIndex == -1) {
			patron.list.add(booktoCheckedout);
			reader[patron.name.charAt(0)-'A'].add(patron);
			bookref.p= (Patron)reader[patron.name.charAt(0)-'A'].getFirst();
			
		}else {
			patronRef = (Patron)reader[patron.name.charAt(0)-'A'].get(patronIndex);
			patronRef.list.add(booktoCheckedout);
			bookref.p = patronRef;
			
		}
		
	}
	
	public void returnBook() {
		Patron patron = new Patron();
		Book book = new Book();
		Author author = new Author(),authorref = new Author();
		int patronIndex = -1,bookIndex = -1,authorIndex = -1;
		int count = 0;
		while(patronIndex==-1){
			patron.name = getString("please input patron's name:");
			patronIndex = reader[patron.name.charAt(0)-'A'].indexOf(patron);
			if (patronIndex ==-1) {
				System.out.println("patron's name misspelled");
			}
			count++;
			if (count==3) {
				return ;
			}
		}
		while(authorIndex == -1){
			author.name = getString("please input author's name:");
			authorIndex = catlog[author.name.charAt(0)-'A'].indexOf(author);
			if (authorIndex ==-1) {
				System.out.println("author's name misspelled");
			}
		}
		while(bookIndex == -1){
			book.title = getString("please input book's title:");
			authorref = (Author)catlog[author.name.charAt(0)-'A'].get(authorIndex);
			bookIndex = authorref.books.indexOf(book);
			
			if (bookIndex ==-1) {
				System.out.println("book's title misspelled");
			}
		}
		CheckOutBook checkedOutBook = new CheckOutBook();
		checkedOutBook.author = authorref;
		checkedOutBook.book = (Book)authorref.books.get(bookIndex);
		((Book)authorref.books.get(bookIndex)).p = null;
		((Patron)reader[patron.name.charAt(0)-'A'].get(patronIndex)).list.remove(checkedOutBook);
		
		
	}
	
	public void run() {
		while(true){
			char option = getString("\n please select options:\n"+"1:add book in catlog\n"+
						"2: check out a book\n"+"3:return a book \n 4: status \n 5:exit system.\n"+"your option:").charAt(0);
			switch (option) {
			case '1':
				includeBook();
				break;
			case '2':
				checkOutBook();
				break;
			case '3':
				returnBook();
				break;
			case '4':
				status();
				break;
			case '5':
				System.exit(1);
			default:
				System.out.println("input wrong,try again:");
			}
		}
	}
	
}
