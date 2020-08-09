package patientmanagementsystem.doctor_system;

import java.util.ArrayList;

public class Doctors {
    
    protected ArrayList<Doctor> doctors;
    
    public Doctors() {
        doctors = new ArrayList<>();
    }

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(ArrayList<Doctor> doctors) {
        this.doctors = doctors;
    }
    
    public void addDoctor(Doctor _doctor) {
        this.doctors.add(_doctor);
    }

}
