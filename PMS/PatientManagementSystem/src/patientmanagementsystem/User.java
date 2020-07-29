package patientmanagementsystem;

public abstract class User {

    private String userID;
    private String address;
    private String firstname;
    private String surname;
    
    public User() {
        
    }
    
    public abstract void createAccount();
    public abstract void deleteAccount();
    
    public void login() {
        System.out.println("You are now logged in.");
    }
    
    public void logout() {
        System.out.println("you are now logged out.");
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
    
}
