
public class LibraryMain {

    public static void main(String[] args) {

        // create library
        Library library = new Library();

        // create book objects
        Book book1 = new Book("The God of Small Things", "Arundhati Roy", 1997);
        Book book2 = new Book("Godan", "Premchand", 1936);
        Book book3 = new Book("The Inheritance of Loss", "Kiran Desai", 2006);

        // add books to library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // task 1: display all books
        System.out.println("\n--- task 1 ---");
        library.displayBooks();

        // task 1: find books by author
        library.findBooksByAuthor("Premchand");


        // task2: borrow a book
        System.out.println("\n--- task 2 ---");

        library.borrowBook("Godan");

        // display books after borrowing
        library.displayBooks();

        // return the book
        library.returnBook(book2);

        // display books after returning
        library.displayBooks();


        // tsk 3: Check book availability
        System.out.println("\n--- task 3 ---");

        System.out.println("Is Godan available? " +
                library.isBookAvailable("Godan"));

        System.out.println("Is Rambatoli available? " +
                library.isBookAvailable("Rambatoli"));




        // task 4: book ratings and reviews
        System.out.println("\n--- task 4 ---");


        // set book rating
        book1.setRating(5.0);


        // add reviews
        book1.addReview("Very interesting book!");
        book1.addReview("Excellent storytelling.");


        // display rating
        System.out.println("Book: " + book1.getTitle());
        System.out.println("Rating: " + book1.getRating());


        // display reviews
        System.out.println("Reviews:");
        for (String review : book1.getReviews()) {
            System.out.println("- " + review);
        }


        // TASK 5: Library Statistics
        System.out.println("\n--- TASK 5 ---");


        // Set ratings for books
        book1.setRating(4.5);
        book2.setRating(4.7);
        book3.setRating(5.0);


        // display average rating
        System.out.println("Average book rating: "
                + library.getAverageBookRating());


        // find most reviewed book
        Book mostReviewed = library.getMostReviewedBook();

        if (mostReviewed != null) {
            System.out.println("Most reviewed book: "
                    + mostReviewed.getTitle());

            System.out.println("Number of reviews: "
                    + mostReviewed.getReviews().size());
        }

        // task 6: library users
        System.out.println("\n--- TASK 6 ---");

     // create users
        User user1 = new User("Khush", 22);
        User user2 = new User("Riya", 20);

// add users
        library.addUser(user1);
        library.addUser(user2);

// display users
        library.displayUsers();

// user borrows a book
        library.borrowBook(user1, "Godan");

// display borrowed books
        System.out.println("Riya's borrowed books:");

        for (Book book : user1.getBorrowedBooks()) {
            System.out.println(book.getTitle());
        }

// user returns a book
        library.returnBook(user1, "Godan");

// display users again
        library.displayUsers();

// find user
        User foundUser = library.findUserByName("Khush");

        if (foundUser != null) {
            System.out.println("Found user: " + foundUser.getName());
        }



    }


}
