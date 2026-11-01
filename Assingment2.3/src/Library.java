
import java.util.ArrayList;
public class Library {


    private ArrayList<Book> books = new ArrayList<>();

    // Task 6: Library users
    private ArrayList<User> users = new ArrayList<>();

    //add books
    public void addBook(Book book) {
        books.add(book);

    }
//display books
public void displayBooks() {
    System.out.println("Library Books:");


    for (Book book : books) {
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Publication Year: " + book.getPublicationyear());
        System.out.println("----------------------");
    }

}
    // find books by author
    public void findBooksByAuthor(String author) {
        System.out.println("Books by " + author + ":");

        boolean found = false;
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                System.out.println(book.getTitle());
                found = true;
            }
        }

        if (!found) {
            System.out.println("No books found by this author.");
        }
    }


    //task 2

    // borrow book
    public void borrowBook(String title) {

        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {

                books.remove(book);
                System.out.println(title + " has been borrowed.");
                return;
            }
        }
        System.out.println(title + " is not available.");
    }

    // return a book
    public void returnBook(Book book) {

        if (!books.contains(book)) {

            books.add(book);
            System.out.println(book.getTitle() + " has been returned.");

        } else {
            System.out.println("Book is already in the library.");
        }
}
    // task 3: Check book availability
    public boolean isBookAvailable(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return true;
            }
        }
        return false;}

    //task 5: Average book rating
    public double getAverageBookRating() {
        if (books.isEmpty()) {
            return 0.0;
        }

        double totalRating = 0;
        for (Book book : books) {
            totalRating += book.getRating();
        }

        return totalRating / books.size();
    }

    // task 5: get most reviewed book
    public Book getMostReviewedBook() {
        if (books.isEmpty()) {
            return null;
        }

        Book mostReviewed = books.get(0);

        for (Book book : books) {
            if (book.getReviews().size() > mostReviewed.getReviews().size()) {
                mostReviewed = book;
            }
        }

        return mostReviewed;
    }

    // TASK 6: Add user
    public void addUser(User user) {
        users.add(user);
        System.out.println(user.getName() + " has been added.");
    }

    // Remove user
    public void removeUser(String name) {
        for (User user : users) {
            if (user.getName().equalsIgnoreCase(name)) {

                if (user.getBorrowedBooks().isEmpty()) {
                    users.remove(user);
                    System.out.println(name + " has been removed.");
                } else {
                    System.out.println("User has borrowed books. Return them first.");
                }
                return;
            }
        }

        System.out.println("User not found.");
    }

    // Find user
    public User findUserByName(String name) {
        for (User user : users) {
            if (user.getName().equalsIgnoreCase(name)) {
                return user;
            }
        }
        return null;
    }

    // Display all users
    public void displayUsers() {
        System.out.println("Library Users:");

        for (User user : users) {
            System.out.println("Name: " + user.getName());
            System.out.println("Age: " + user.getAge());
            System.out.println("Borrowed Books: "
                    + user.getBorrowedBooks().size());
        }
    }

    // Borrow book through library
    public void borrowBook(User user, String title) {

        if (!users.contains(user)) {
            System.out.println("User is not registered.");
            return;
        }

        Book selectedBook = null;

        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                selectedBook = book;
                break;
            }
        }

        if (selectedBook != null) {
            books.remove(selectedBook);
            user.borrowBook(selectedBook);

            System.out.println(user.getName() + " borrowed " + title);
        } else {
            System.out.println(title + " is not available.");
        }
    }

    // Return book through library
    public void returnBook(User user, String title) {

        Book selectedBook = null;

        for (Book book : user.getBorrowedBooks()) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                selectedBook = book;
                break;
            }
        }

        if (selectedBook != null) {
            user.returnBook(selectedBook);
            books.add(selectedBook);

            System.out.println(user.getName() + " returned " + title);
        } else {
            System.out.println("This user has not borrowed this book.");
        }
    }


}