import java.util.List;

public class Book {
		public void viewBooks(List<Book> books) {
			if(books.isEmpty()) {
				System.out.println("No books here.");
			} else {
				System.out.println("List of books: ");
				for (Book book : books) {
                			System.out.println(book);
				}
			}
		}

//		public void removeBook(List<Book> books, String bookTitle) {
//			books.removeIf(book -> book.title.equals(bookTitle));
//			System.out.println("Book removed: " + title);
//		}
}
