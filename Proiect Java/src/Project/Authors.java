package Project;

//import java.awt.print.Book;
import java.util.List;

public class Authors {

    private String firstName;
    private String lastName;
    private String email;
    private String birthDate;
    private List<BookInfo> booksWritten;

    public Authors(String firstName, String lastName, String email, String birthDate, List<BookInfo> booksWritten) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.birthDate = birthDate;
        this.booksWritten = booksWritten;
    }

    public void newBookWritten(BookInfo b) {
        booksWritten.add(b);
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public List<BookInfo> getBooksWritten() {
        return booksWritten;
    }

    public void setBooksWritten(List<BookInfo> booksWritten) {
        this.booksWritten = booksWritten;
    }

    @Override
    public String toString() {
        return "Authors{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", booksWritten=" + booksWritten +
                '}';
    }
}
