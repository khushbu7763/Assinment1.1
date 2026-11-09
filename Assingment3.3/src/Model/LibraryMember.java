
package Model;

import java.util.ArrayList;
import java.util.List;

public class LibraryMember {

    private String name;
    private int memberId;
    private List<Book> borrowedBooks;
    private List<Book> reservedBooks;

    // constructor
    public LibraryMember(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
        borrowedBooks = new ArrayList<>();
        reservedBooks = new ArrayList<>();
    }

    // get name
    public String getName() {
        return name;
    }

    // get member id
    public int getMemberId() {
        return memberId;
    }

    // get borrowed books
    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    // get reserved books
    public List<Book> getReservedBooks() {
        return reservedBooks;
    }

    // add borrowed book
    public void addBorrowedBook(Book book) {
        borrowedBooks.add(book);
    }

    // remove borrowed book
    public void removeBorrowedBook(Book book) {
        borrowedBooks.remove(book);
    }

    // add reserved book
    public void addReservedBook(Book book) {
        reservedBooks.add(book);
    }

    // remove reserved book
    public void removeReservedBook(Book book) {
        reservedBooks.remove(book);
    }

    // check reserved book
    public boolean hasReservedBook(Book book) {
        return reservedBooks.contains(book);
    }
}
