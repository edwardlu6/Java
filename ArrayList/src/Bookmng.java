import java.util.*;


public class Bookmng {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Book> books = new ArrayList<Book> ();
		
		int choice = 0;
		String author;
		int ISBN = 0;
		
		do {
			menu();
			
			choice = sc.nextInt();
			
			if (choice == 1) {
				System.out.println("Enter an author: ");
				author = sc.next();
				System.out.println("Enter an ISBN: ");
				ISBN = sc.nextInt();
				Book newBook = new Book(author, ISBN);
				books.add(newBook); //Without using methods
				
			} else if (choice == 2) {
				System.out.println("Enter an author: ");
				author = sc.next();
				System.out.println("Enter an ISBN: ");
				ISBN = sc.nextInt();
				for (int count = 0; count<books.size(); count++) {
					if (books.get(count).getAuthorName().equals(author) && books.get(count).getISBN()==ISBN) {
						books.remove(books.get(count));
					}
				}
				
				
			} else if (choice == 3) {
				
			} else {
				System.out.println("Invalid Choice");
			}
			
		} while (choice != 4);
	}
	
	//Unnecessary Methods
	public static void add(ArrayList<Book> array, Book entry) {
		array.add(entry);
	}
	
	public static void delete(ArrayList<Book> array, Book entry) {
		
	}
	
	public static void menu() {
		System.out.println("Choose an option to do: ");
		System.out.println("1.Add \n 2.Delete \n 3.Print \n 4.Exit");
		
	}


}
