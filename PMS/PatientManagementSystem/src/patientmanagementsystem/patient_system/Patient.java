package patientmanagementsystem.patient_system;

import patientmanagementsystem.User;
import patientmanagementsystem.doctor_system.DoctorRating;

public class Patient extends User {
    
    protected DoctorRating doctorRating;
    
    public Patient(String _firstname, String _lastname, String _address, int _age) {
        this.setFirstname(_firstname);
        this.setSurname(_lastname);
        this.setAddress(_address);
        this.setAge(_age);
    }
    
    public void rateDoctor() {
        
        doctorRating = new DoctorRating();
        
    }
    
    
    public void viewDoctorRatings() {}
    public void requestAppointment() {}
    public void viewHistory() {}
    public void viewAppointment() {}
    public void requestAccountDeletion() {}

}
