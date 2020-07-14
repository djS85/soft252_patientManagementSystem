package patientmanagementsystem;

public abstract class User {

    private String userID;
    private String address;
    private String name;
    
    public void login() {
        System.out.println("You are now logged in.");
    }
}
