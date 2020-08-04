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
    
    public Patient createPatient(String _firstname, String _surname, String _address, int _age) {
        Patient p = new Patient(_firstname, _surname, _address, _age);
        return p;
    }

}
