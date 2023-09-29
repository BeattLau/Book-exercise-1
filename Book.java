public class Book {
	public static void main(String[] args) {
		public void viewBooks(List<Book> books) {
			if(books.isEmpty()) {
				System.out.println("No books here.");
			} else {
				System.out.println("List of books: ");
				for (int i = 0; i < books.length; i++) {
					System.out.println(books[i].tile + "by: " + books[i].author);
				}
			}

		}
	}
}
