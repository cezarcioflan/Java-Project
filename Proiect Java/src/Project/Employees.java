package Project;

public class Employees {
    private String firstName;
    private String lastName;
    private String email;
    private String birthDate;
    private String role;
    private int salary;
    private int rank;

    public Employees(String firstName, String lastName, String email, String birthDate, String role, int salary, int rank) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.birthDate = birthDate;
        this.role = role;
        this.salary = salary;
        this.rank = rank;
    }

    public void changeRank(Boolean x, int salaryDifference) {
        if(x) {
            rank++;
            salary += salaryDifference;
        }
        else
        {
            rank--;
            salary -= salaryDifference;
        }
    }

    public void interrogate() {
        System.out.println("Hello I am " + firstName + " " + lastName + " and my job name is " + role +
                 ". I love my job! Just between us, my salary is " + salary + ". That is awesome!");
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", role='" + role + '\'' +
                ", salary=" + salary +
                ", rank=" + rank +
                '}';
    }
}

