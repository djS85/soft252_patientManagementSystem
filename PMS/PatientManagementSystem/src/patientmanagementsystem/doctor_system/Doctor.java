package patientmanagementsystem.doctor_system;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import patientmanagementsystem.User;
import utils.Files;

public class Doctor extends User {
    
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
    
    public void createPrescription(String _doctorID, String _patientID, String _medicine, String _dosage, int _quantity) {
        
        Prescription prescription = new Prescription();
        
        prescription.setDoctorID(_doctorID);
        prescription.setPatientID(_patientID);
        prescription.setMedicine(_medicine);
        prescription.setDosage(_dosage);
        prescription.setQuantity(_quantity);
        
        Prescriptions prescriptions = new Prescriptions();
        
        prescriptions.setPrescriptions(getPrescriptions());
        
        prescriptions.addPrescription(prescription);
        
        writePrescriptions(prescriptions);
        
    }
    
    public ArrayList<Appointment> getAppointments() {
        
        ArrayList<Appointment> appointments = new ArrayList<>();
        
        if ( gson == null ) {
            gson = new GsonBuilder().setPrettyPrinting().create();
        }
        
        try ( FileReader fr = new FileReader(Files.APPOINTMENTS_PATH) ) {
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
        
        try ( FileWriter fw = new FileWriter(Files.APPOINTMENTS_PATH) ) {          
            gson.toJson(_appointments.getAppointments(), fw);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }
    
    public ArrayList<Prescription> getPrescriptions() {
        
        ArrayList<Prescription> prescriptions = new ArrayList<>();
        
        if ( gson == null ) {
            gson = new GsonBuilder().setPrettyPrinting().create();
        }
        
        try ( FileReader fr = new FileReader(Files.PRESCRIPTIONS_PATH) ) {
            prescriptions = gson.fromJson(fr, new TypeToken<ArrayList<Prescription>>() {}.getType());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        return prescriptions;
    
    }
    
    
    public void writePrescriptions(Prescriptions _prescriptions) {
        
        if ( gson == null ) {
            gson = new GsonBuilder().setPrettyPrinting().create();
        }
        
        try ( FileWriter fw = new FileWriter(Files.PRESCRIPTIONS_PATH) ) {          
            gson.toJson(_prescriptions.getPrescriptions(), fw);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }
    
}
