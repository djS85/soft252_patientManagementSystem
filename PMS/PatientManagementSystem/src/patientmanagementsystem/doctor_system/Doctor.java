package patientmanagementsystem.doctor_system;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
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
//        System.out.println(doctor);
        
        Appointments apps = new Appointments();
        apps.setAppointments(getAppointments());
        
        apps.addAppointment(app);
        
        writeAppointments(apps);
        
        
    }
    
    
    public void viewAppointments() {}
    public void makeAppoointmentNotes() {}
    public void viewPatientHistory() {}
    
    public void createPrescription() {}

    public ArrayList<Appointment> getAppointments() {
        
        ArrayList<Appointment> appointments = new ArrayList<>();
        
        if ( gson == null ) {
            gson = new GsonBuilder().setPrettyPrinting().create();
        }
        
        try ( FileReader fr = new FileReader(appointmentsPath) ) {
            appointments = gson.fromJson(fr, new TypeToken<ArrayList<Appointment>>() {}.getType());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        return appointments;
    
    }
    
    public void writeAppointments(Appointments _appointments) {
        
        if ( gson == null ) {
            gson = new GsonBuilder().setPrettyPrinting().create();
        }
        
        try ( FileWriter fw = new FileWriter(appointmentsPath) ) {          
            gson.toJson(_appointments.getAppointments(), fw);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }
    
}
