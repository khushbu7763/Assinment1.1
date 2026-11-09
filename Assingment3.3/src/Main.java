
import Model.Book;
import Model.LibraryMember;
import System.Library;

public class Main {

    public static void main(String[] args) {

        // create library
        Library library = new Library();

        // create books
        Book book1 = new Book(
                "The God of Small Things", "Arundhati Roy", "101"
        );

        Book book2 = new Book("Godan", "Munshi Premchand", "102"
        );

        // create members
        LibraryMember member1 = new LibraryMember("Shivani", 1);
        LibraryMember member2 = new LibraryMember("Priya", 2);

        // add books
        library.addBook(book1);
        library.addBook(book2);

        // add members
        library.addMember(member1);
        library.addMember(member2);

        // borrow books
        library.borrowBook(member1, book1);
        library.borrowBook(member2, book2);

        // return book
        library.returnBook(member1, book1);

//task 3

        // Reserve book
        library.reserveBook(member1, book1);

        // Try to reserve the same book
        library.reserveBook(member2, book1);

        // Display reserved books
        library.displayReservedBooks(member1);

        // Cancel reservation
        library.cancelReservation(member1, book1);

        // Display reserved books again
        library.displayReservedBooks(member1);
    }
}

