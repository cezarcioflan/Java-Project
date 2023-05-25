package Service;

import Project.*;

//import java.awt.print.Book;
import java.io.IOException;
import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;



public class LibraryService { 

    public List<String> input() {
        List<String> s = new ArrayList<>();
        s = ReadSingleton.getReadSingleton().input();
        return s;
    }

    public void output(Object o) {

        WriteSingleton.getWriteSingleton().output(o);
    }

    public void closeOutput() throws IOException {
        WriteSingleton.getWriteSingleton().close();
    }

    public void changePrimaryCharacterFunction(int i, BookInfo b) {

        b.changePrimaryCharacter(i);
    }

    public void bookCoverPassageFunction(BookInfo b) {

        b.bookCoverPassage();
        AuditService.logAction("bookCoverPassageFunction");
    }

    public void borrowNewBookFunction(Customers c, BookInfo b, Libraries l) {

        c.borrowNewBook(b);
        l.customerBorrowedBook(b);
    }

    public void returnBookFunction(Customers c, BookInfo b, Libraries l) {

        c.returnBook(b);
        l.customerReturnedBook(b);
    }

    public void fireEmployeeFunction(Employees e, Libraries l) {

        l.fireEmployee(e);
    }

    public void employFunction(Employees e, Libraries l) {

        l.employ(e);
    }

    public void changeRankFunction(Boolean x, int salaryDifference, Employees e) {

        e.changeRank(x, salaryDifference);
    }

    public void interrogateFunction(Employees e) {

        e.interrogate();
    }

    public void newBookWrittenFunction(Authors a, BookInfo b) {

        a.newBookWritten(b);
    }

    public PublishingHouses publishingHouseTemporaryMerger(PublishingHouses p1, PublishingHouses p2,
                                                  String newName, String newPhoneNumber, String newEmail) {

        List<BookInfo> mergedProducedBooks = new ArrayList<BookInfo>();
        mergedProducedBooks.addAll(p1.getProducedBooks());
        mergedProducedBooks.addAll(p2.getProducedBooks());
 
        int merged5YearProfit = p1.getProfitLast5Years() + p2.getProfitLast5Years();


        PublishingHouses p = new PublishingHouses(newName, newPhoneNumber, newEmail, mergedProducedBooks, merged5YearProfit);

        return p;
    }
}
