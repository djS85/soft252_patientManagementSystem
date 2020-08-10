package patientmanagementsystem;

public abstract class User {

    private String userID;
    private String address;
    private String firstname;
    private String surname;
    private String password;
    
    private int age;
    
    private String gender;
    
    private boolean accountApproved;
    
    public User() {
        this.accountApproved = false;
    }
    
    // getters and setters.
    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFullName() {
        String fullname = firstname + " " + surname;
        return fullname;
    }
    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAccountApproved() {
        return accountApproved;
    }

    public void setAccountApproved(boolean accountApproved) {
        this.accountApproved = accountApproved;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    
    
}
