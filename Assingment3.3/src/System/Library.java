
package System;

import Model.Book;
import Model.LibraryMember;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books;
    private List<LibraryMember> members;

    // constructor
    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    // add book
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    // add member
    public void addMember(LibraryMember member) {
        members.add(member);
        System.out.println("Member added: " + member.getName());
    }

    // borrow book
    public void borrowBook(LibraryMember member, Book book) {

        if (members.contains(member) && books.contains(book)
                && !book.isBorrowed() && !book.isReserved()) {

            book.setBorrowed(true);
            member.addBorrowedBook(book);

            System.out.println(member.getName()
                    + " borrowed " + book.getTitle());

        } else {
            System.out.println("Book is not available.");
        }
    }

    // return book
    public void returnBook(LibraryMember member, Book book) {

        if (member.getBorrowedBooks().contains(book)) {

            book.setBorrowed(false);
            member.removeBorrowedBook(book);

            System.out.println(member.getName()
                    + " returned " + book.getTitle());

        } else {
            System.out.println("This book was not borrowed by this member.");
        }
    }

    // reserve book
    public void reserveBook(LibraryMember member, Book book) {

        if (members.contains(member) && books.contains(book)
                && !book.isReserved() && !book.isBorrowed()) {

            book.setReserved(true);
            member.addReservedBook(book);

            System.out.println("Book reserved successfully.");

        } else {
            System.out.println("Book is already reserved or unavailable.");
        }
    }

    // cancel reservation
    public void cancelReservation(LibraryMember member, Book book) {

        if (book.isReserved() && member.hasReservedBook(book)) {

            book.setReserved(false);
            member.removeReservedBook(book);

            System.out.println("Reservation canceled successfully.");

        } else {
            System.out.println("Book was not reserved by this member.");
        }
    }

    // display reserved books
    public void displayReservedBooks(LibraryMember member) {

        System.out.println("Reserved books for " + member.getName() + ":");

        for (Book book : member.getReservedBooks()) {
            System.out.println(book.getTitle());
        }
    }
}
