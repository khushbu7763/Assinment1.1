
package Model;

public class Book {

    private String title;
    private String author;
    private String isbn;
    private boolean borrowed;
    private boolean reserved = false;

    // constructor
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.borrowed = false;
    }

    // get title
    public String getTitle() {
        return title;
    }

    // get author
    public String getAuthor() {
        return author;
    }

    // get isbn
    public String getIsbn() {
        return isbn;
    }

    // check borrowed status
    public boolean isBorrowed() {
        return borrowed;
    }

    // check reserved status
    public boolean isReserved() {
        return reserved;
    }

    // set borrowed status
    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    // set reserved status
    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }
}
