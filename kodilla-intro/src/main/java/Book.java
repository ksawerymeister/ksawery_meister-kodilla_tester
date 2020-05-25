public class Book {

    private String author;
    private String title;

    public static Book of(String author, String title){
        Book book = new Book();
        book.setAuthor(author);
        book.setTitle(title);
        return book;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
