import java.util.ArrayList;

public class User {
    private String name;
    private int age;
    private ArrayList<Book> borrowedBooks = new ArrayList<>();

    // Constructor
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Get name
    public String getName() {
        return name;
    }

    // Get age
    public int getAge() {
        return age;
    }

    // Get borrowed books
    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    // Borrow a book
    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }
    // Return a book
    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }

}
