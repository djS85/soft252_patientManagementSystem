package patientmanagementsystem;

import patientmanagementsystem.admin_system.Administrator;

public class UserFactory {
    
    public enum UserType {
        
        ADMIN,
    
    }
    
    public UserFactory() {
    
    }
    
    public User createUser(UserType _userType) {
        
        User user = null;
        
        switch (_userType) {
        
            case ADMIN:
                user = createAdminUser();
                break;
        
            default:
                break;
                
        }
        
        return user;
        
    }
    
    public Administrator createAdminUser() {
    
        Administrator admin = new Administrator();
        
        return admin;
        
    }

}
