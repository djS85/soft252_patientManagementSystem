package patientmanagementsystem.patient_system;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import patientmanagementsystem.User;
import patientmanagementsystem.doctor_system.Appointment;
import patientmanagementsystem.doctor_system.Appointments;
import patientmanagementsystem.doctor_system.DoctorRating;
import patientmanagementsystem.doctor_system.DoctorRatings;
import utils.Files;

public class Patient extends User {
    
    protected DoctorRating doctorRating;
    
    protected Gson gson;
    
    public Patient() {
        
    }
    
    public Patient(String _firstname, String _lastname, String _address, int _age) {
        this.setFirstname(_firstname);
        this.setSurname(_lastname);
        this.setAddress(_address);
        this.setAge(_age);
        
    }
    
    // adds rating to DoctorRatings.class ArrayList for serialization to json file
    // doctor_ratings.json.
    public void rateDoctor(String doctorSurname, String docID, String feedback, int rating) {
        
        DoctorRating doctorRating = new DoctorRating();
        DoctorRatings doctorRatings = new DoctorRatings();
        
        doctorRatings.setRatings(getDoctorRatings());
        
//        System.out.println(doctorRatings.getRatings());
        
        doctorRating.create(doctorSurname, docID, feedback, rating);
        
        doctorRatings.addRating(doctorRating);
        
        writeRatings(doctorRatings);
        
    }
    
    
    // creates an appointment to approved by a secretary user.
    public void requestAppointment(String patientID, String patientFullname, String doctor, String date, String notes) {
        
        Appointment a = new Appointment();
        a.setPatientID(patientID);
        a.setPatientFullname(patientFullname);
        a.setDoctor(doctor);
        a.setNotes(notes);
        a.setDate(date);
        
        Appointments apps = new Appointments();
        apps.setAppointments(getAppointments());
        
        apps.addAppointment(a);
        
        writeAppointments(apps);
        
    }
    
    // de-serializes all appointments from the json file to ArrayList.
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
    
    // serializes to json file appointments.json.
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
    
    // de-serializes all doctor ratings from the json file to ArrayList.
    public ArrayList<DoctorRating> getDoctorRatings() {
        
        ArrayList<DoctorRating> doctorRatings = new ArrayList<>();
        
        if ( gson == null ) {
            gson = new GsonBuilder().setPrettyPrinting().create();
        }
        
        try ( FileReader fr = new FileReader(Files.DOCTOR_RATINGS_PATH) ) {
            doctorRatings = gson.fromJson(fr, new TypeToken<ArrayList<DoctorRating>>() {}.getType());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        return doctorRatings;
        
    }
    
    // serializes to json file doctor_ratings.json.
    public void writeRatings(DoctorRatings _doctorRatings) {
        // its all about the way this part is setup with filewriter/reader.
        
        if ( gson == null ) {
            gson = new GsonBuilder().setPrettyPrinting().create();
        }
        
        try ( FileWriter fw = new FileWriter(Files.DOCTOR_RATINGS_PATH) ) {          
            gson.toJson(_doctorRatings.getRatings(), fw);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
}
