package patientmanagementsystem;

import patientmanagementsystem.admin_system.Administrator;
import patientmanagementsystem.doctor_system.Doctor;
import patientmanagementsystem.patient_system.Patient;
import patientmanagementsystem.secretary_system.Secretary;

public class UserFactory {
    
    public enum UserType {
        
        ADMIN,
        DOCTOR,
        PATIENT,
        SECRETARY
    
    }
    
    public UserFactory() {
    
    }
    
    public User createUser(UserType _userType) {
        
        User user = null;
        
        switch (_userType) {
        
            case ADMIN:
                user = createAdminUser();
                break;
            case DOCTOR:
                user = createDoctor();
                break;
            case SECRETARY:
                user = createSecretary();
                break;
            case PATIENT:
                user = createPatient();
                break;
        
            default:
                break;
                
        }
        
        return user;
        
    }
    
    public Doctor createDoctor() {
    
        Doctor doctor = new Doctor();
        
        return doctor;
    
    }
    
    public Administrator createAdminUser() {
    
        Administrator admin = new Administrator();
        
        return admin;
        
    }
    
    public Secretary createSecretary() {
        
        Secretary sec = new Secretary();
        
        return sec;
    
    }
    
    public Patient createPatient() {
    
        Patient patient = new Patient();
        
        return patient;
        
    }

}
