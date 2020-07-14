

package patientmanagementsystem;

import patientmanagementsystem.doctor_system.Doctor;

/**
 * @author djs85
 */
public class PatientManagementSystem {

    public static void main(String[] args) {
        
        User doctor = new Doctor();
        
        doctor.login();
        
    }

}
