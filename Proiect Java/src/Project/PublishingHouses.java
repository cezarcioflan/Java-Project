package Project;

import java.util.List;
//import java.util.Map;

public class PublishingHouses {

    private String name;
    private String phoneNumber;
    private String email;
    private List<BookInfo> producedBooks;
    private int profitLast5Years;

    public PublishingHouses(String name, String phoneNumber, String email, List<BookInfo> producedBooks, int profitLast5Years) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.producedBooks = producedBooks;
        this.profitLast5Years = profitLast5Years;
    }

    public PublishingHouses() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<BookInfo> getProducedBooks() {
        return producedBooks;
    }

    public void setProducedBooks(List<BookInfo> producedBooks) {
        this.producedBooks = producedBooks;
    }

    public int getProfitLast5Years() {
        return profitLast5Years;
    }

    public void setProfitLast5Years(int profitLast5Years) {
        this.profitLast5Years = profitLast5Years;
    }

    @Override
    public String toString() {
        return "PublishingHouses{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", producedBooks=" + producedBooks +
                ", profitLast5Years=" + profitLast5Years +
                '}';
    }
}
