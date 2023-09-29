public class addBooks {



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    String title;
    String author;

    public void main(String[] args) {
        addBooks AddBooks = new addBooks();
        AddBooks.setTitle("Moby Dick");
        AddBooks.setAuthor("Herman Melville");

        System.out.println(title + author + " added to inventory ");
    }

}
