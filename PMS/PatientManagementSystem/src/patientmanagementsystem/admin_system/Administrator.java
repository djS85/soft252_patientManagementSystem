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

public class Administrator extends User {
    
    // Laptop
//    protected final String doctorPath = "C:\\Users\\djs85\\Desktop\\soft252_patientManagementSystem\\PMS\\PatientManagementSystem\\src\\json\\doctors.json";
    
    // Desktop
    protected final String doctorPath = "C:\\Users\\Dyn\\Desktop\\soft252_patientManagementSystem\\PMS\\PatientManagementSystem\\src\\json\\doctors.json";
    
    protected Random r;
    
    protected Gson gson;
    
    public Administrator() {
        gson = new GsonBuilder().setPrettyPrinting().create();
    }
    
    public void addDoctorAccount(String firstname, String surname, String address, int age, String password) {
        
        ArrayList<Doctor> doctors = new ArrayList<Doctor>();
        
        try ( FileReader fr = new FileReader(doctorPath) ) {            
            doctors = gson.fromJson(fr, new TypeToken<ArrayList<Doctor>>() {}.getType());
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
        
        doctors.add(doctor);
        
        writeDoctors(doctors);
    
    }
    
    public void writeDoctors(ArrayList<Doctor> _doctors) {
        // its all about the way this part is setup with filewriter/reader.
        try ( FileWriter fw = new FileWriter(doctorPath) ) {          
            gson.toJson(_doctors, fw);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public void setDoctorUserID(Doctor _doctor) {
        r = new Random();
        _doctor.setUserID("D" + r.nextInt(10000));
    }
    
    public void removeDoctorAccount(String _docID) {
        
        ArrayList<Doctor> doctors = new ArrayList<Doctor>();
        
        try ( FileReader fr = new FileReader(doctorPath) ) {            
            doctors = gson.fromJson(fr, new TypeToken<ArrayList<Doctor>>() {}.getType());
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        for ( int i = 0; i < doctors.size(); i ++ ) {
            if ( doctors.get(i).getUserID().equalsIgnoreCase(_docID) ){
                doctors.remove(doctors.get(i));
            }
        }
         
        writeDoctors(doctors);
    
    }
    
}
