package Project;

import java.util.List;

public class Customers {

    private String firstName;
    private String lastName;
    private List<BookInfo> borrowedBooks; // Limited to one copy of a book edition.

    public Customers(String firstName, String lastName, List<BookInfo> borrowedBooks) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.borrowedBooks = borrowedBooks;
    }

    public void borrowNewBook(BookInfo b) {
        borrowedBooks.add(b);
    }

    public void returnBook(BookInfo b) {
        borrowedBooks.remove(b);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<BookInfo> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(List<BookInfo> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    @Override
    public String toString() {
        return "Customers{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", borrowedBooks=" + borrowedBooks +
                '}';
    }
}
