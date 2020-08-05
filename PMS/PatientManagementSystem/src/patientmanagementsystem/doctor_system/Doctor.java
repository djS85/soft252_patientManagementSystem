package patientmanagementsystem.doctor_system;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import patientmanagementsystem.User;

public class Doctor extends User {
    
    //Laptop
//    protected final String appointmentsPath = "C:\\Users\\djs85\\Desktop\\soft252_patientManagementSystem\\PMS\\PatientManagementSystem\\src\\json\\appointments.json";
    
    
    //Desktop
    protected final String appointmentsPath = "C:\\Users\\Dyn\\Desktop\\soft252_patientManagementSystem\\PMS\\PatientManagementSystem\\src\\json\\appointments.json";
    
    private Gson gson;
    
    public Doctor() {
        this.gson = new GsonBuilder().setPrettyPrinting().create();
    }
    
    public void createAppointment(String doctor, String patientID, String patientFirstname, String patientSurname, String date, String doctorNotes) {
        
        Appointment app = new Appointment();
        app.setPatientID(patientID);
        app.setPatientFullname(patientFirstname + " " + patientSurname);
        app.setDate(date);
        app.setNotes(doctorNotes);
        app.setDoctor(doctor);
        
        // Finish doctor Appointment creator...
        
    }
    
    
    public void viewAppointments() {}
    public void makeAppoointmentNotes() {}
    public void viewPatientHistory() {}
    
    public void createPrescription() {}

    
    
}
