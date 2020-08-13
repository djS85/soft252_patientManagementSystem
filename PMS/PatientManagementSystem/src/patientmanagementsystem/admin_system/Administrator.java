package patientmanagementsystem.admin_system;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import patientmanagementsystem.User;
import patientmanagementsystem.doctor_system.Doctor;
import patientmanagementsystem.doctor_system.Doctors;
import utils.Files;

public class Administrator extends User {
    
    protected Random r;
    
    protected Gson gson;
    
    public Doctors doctors;
    
    public Administrator() {
        gson = new GsonBuilder().setPrettyPrinting().create();
        doctors = new Doctors();
    }
    
    // adds a doctor to the ArrayList in Doctors.class, then writes the ArrayList to the
    // doctors.json file.
    public void addDoctorAccount(String firstname, String surname, String address, int age, String password) {
        
        try ( FileReader fr = new FileReader(Files.DOCTORS_PATH) ) {            
//            _doctors = gson.fromJson(fr, new TypeToken<ArrayList<Doctor>>() {}.getType());
            doctors.setDoctors(gson.fromJson(fr, new TypeToken<ArrayList<Doctor>>() {}.getType()));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        Doctor doctor = new Doctor();
        doctor.setFirstname(firstname);
        doctor.setSurname(surname);
        doctor.setAddress(address);
        doctor.setAge(age);
        doctor.setPassword(password);
        setDoctorUserID(doctor);
        
        doctors.addDoctor(doctor);
        
        writeDoctors(doctors);
    
    }
    
    // function for writing Doctors.class to the json file doctors.json.
    public void writeDoctors(Doctors _doctors) {
        // its all about the way this part is setup with filewriter/reader.
        try ( FileWriter fw = new FileWriter(Files.DOCTORS_PATH) ) {          
            gson.toJson(_doctors.getDoctors(), fw);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    // generates a userID for a doctor, with a "D" prefix.
    public void setDoctorUserID(Doctor _doctor) {
        r = new Random();
        _doctor.setUserID("D" + r.nextInt(10000));
    }
    
    // removes a doctor account from json file doctors.json, by doctors ID number.
    public void removeDoctorAccount(String _docID) {
        
        try ( FileReader fr = new FileReader(Files.DOCTORS_PATH) ) {            
            doctors.setDoctors(gson.fromJson(fr, new TypeToken<ArrayList<Doctor>>() {}.getType()));
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        for ( int i = 0; i < doctors.getDoctors().size(); i ++ ) {
            if ( doctors.getDoctors().get(i).getUserID().equalsIgnoreCase(_docID) ){
                doctors.getDoctors().remove(doctors.getDoctors().get(i));
            }
        }
         
        writeDoctors(doctors);
    
    }
    
}
