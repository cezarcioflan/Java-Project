package Project;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Libraries {

    private List<Employees> employees; // A customer can be a member of one library max.
    private Map<BookInfo, Integer> books;
    private Set<Customers> customers;
    private String address;
    private String name;

    public Libraries(List<Employees> employees, Map<BookInfo, Integer> books, Set<Customers> customers, String address, String name) {
        this.employees = employees;
        this.books = books;
        this.customers = customers;
        this.address = address;
        this.name = name;
    }

    public void fireEmployee(Employees e) {
        if(employees.contains(e))
            employees.remove(e);
    }

    public void employ (Employees e) {
        employees.add(e);
    }

    public void customerBorrowedBook(BookInfo b) {
        if(books.get(b) >= 1 && books.containsKey(b))
            books.put(b, books.get(b) - 1);
    }

    public void customerReturnedBook(BookInfo b) {
        if(books.containsKey(b))
            books.put(b, books.get(b) + 1);
    }

    public List<Employees> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employees> employees) {
        this.employees = employees;
    }

    public Map<BookInfo, Integer> getBooks() {
        return books;
    }

    public void setBooks(Map<BookInfo, Integer> books) {
        this.books = books;
    }

    public Set<Customers> getCustomers() {
        return customers;
    }

    public void setCustomers(Set<Customers> customers) {
        this.customers = customers;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Library{" +
                "employees=" + employees +
                ", books=" + books +
                ", customers=" + customers +
                ", address='" + address + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
