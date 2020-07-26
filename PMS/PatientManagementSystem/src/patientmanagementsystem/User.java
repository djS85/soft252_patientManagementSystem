package patientmanagementsystem;

public abstract class User {

    private String userID;
    private String address;
    private String name;
    
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
