package patientmanagementsystem.patient_system;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import patientmanagementsystem.doctor_system.Appointment;
import patientmanagementsystem.doctor_system.Appointments;
import patientmanagementsystem.doctor_system.Prescription;
import patientmanagementsystem.doctor_system.Prescriptions;
import utils.Files;

public class PatientHistory {

    protected Appointments appointments;
    protected Prescriptions prescriptions;
    protected Patient patient;
    
    protected Gson gson;
    
    public PatientHistory(Patient _patient) {
        gson = new GsonBuilder().setPrettyPrinting().create();
        this.patient = _patient;
        this.appointments = new Appointments();
        this.prescriptions = new Prescriptions();
    }
    
    
    public void initPatientHistory() {
        initAppointments();
        initPrescriptions();
    }
    

    public void initAppointments() {
        
        if ( gson == null ) {
            gson = new GsonBuilder().setPrettyPrinting().create();
        }
        
        try ( FileReader fr = new FileReader(Files.APPOINTMENTS_PATH) ) {
            appointments.setAppointments(gson.fromJson(fr, new TypeToken<ArrayList<Appointment>>() {}.getType()));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        for ( int i = 0; i < appointments.getAppointments().size(); i++ ) {
            if ( !appointments.getAppointments().get(i).getPatientID().equalsIgnoreCase(patient.getUserID()) ) {
                Appointment app = appointments.getAppointments().get(i);
                
                if ( !app.getPatientID().equals(patient.getUserID()) ) {
                    appointments.getAppointments().remove(appointments.getAppointments().get(i));
                }
                
            }
        }
        
    }
    
    
    public void initPrescriptions() {
        
        if ( gson == null ) {
            gson = new GsonBuilder().setPrettyPrinting().create();
        }
        
        try ( FileReader fr = new FileReader(Files.PRESCRIPTIONS_PATH) ) {
            prescriptions.setPrescriptions(gson.fromJson(fr, new TypeToken<ArrayList<Prescription>>() {}.getType()));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        for ( int i = 0; i < prescriptions.getPrescriptions().size(); i++ ) {
            if ( !prescriptions.getPrescriptions().get(i).getPatientID().equalsIgnoreCase(patient.getUserID()) ) {
                Prescription p = prescriptions.getPrescriptions().get(i);
                
                if ( !p.getPatientID().equals(patient.getUserID()) ) {
                    prescriptions.getPrescriptions().remove(prescriptions.getPrescriptions().get(i));
                }
                
            }
        }
    
    }

    public Appointments Appointments() {
        return appointments;
    }

    public Prescriptions Prescriptions() {
        return prescriptions;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

}
