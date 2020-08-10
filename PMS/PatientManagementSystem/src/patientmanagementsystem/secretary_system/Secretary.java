package patientmanagementsystem.secretary_system;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import patientmanagementsystem.User;
import patientmanagementsystem.doctor_system.Appointment;
import patientmanagementsystem.doctor_system.Appointments;
import patientmanagementsystem.doctor_system.Prescription;
import patientmanagementsystem.doctor_system.Prescriptions;
import patientmanagementsystem.patient_system.Patient;
import patientmanagementsystem.patient_system.Patients;
import utils.Files;

public class Secretary extends User {

    private Gson gson;
    
    private Prescriptions prescriptions;
    private Medicines medicines;
    private Prescription prescription;
    private Medicine medicine;
    
    private Patients patients;
    
    public Secretary() {
        this.gson = new GsonBuilder().setPrettyPrinting().create();
        this.patients = new Patients();
        this.patients.setPatients(getPatients());
    }
    
    public void createAppointment(String doctor, String patientID, String patientFirstname, String patientSurname, String date, String doctorNotes) {
        
        Appointment app = new Appointment();
        app.setPatientID(patientID);
        app.setPatientFullname(patientFirstname + " " + patientSurname);
        app.setDate(date);
        app.setNotes(doctorNotes);
        app.setDoctor(doctor);
        
        Appointments apps = new Appointments();
        apps.setAppointments(getAppointments());
        
        apps.addAppointment(app);
        
        writeAppointments(apps);
        
    }
    
    public void orderMedicine(String _medicineName, int _quantity) {
        
        String stockMed = null;
        
        medicines = getMedicines();
        
        for ( Medicine m : medicines.getMedicines() ) {
            if ( m.getMedicineName().equalsIgnoreCase(_medicineName) ) {
                stockMed = m.getMedicineName();
            }
        }
        
        if ( _medicineName.equalsIgnoreCase(stockMed) ) {
            for ( Medicine m : medicines.getMedicines() ) {
                if ( m.getMedicineName().equalsIgnoreCase(stockMed) ) {
                    int stock = m.getQuantityInStock();
                    stock += _quantity;
                    m.setQuantityInStock(stock);
                }
            }
        } else {
            medicine = new Medicine();
        
            medicine.setMedicineName(_medicineName);
            medicine.setQuantityInStock(_quantity);

            medicines.addMedicine(medicine);
        }
        
        writeMedicines(medicines);
        
    }
    
    
    public void removePatient(String _patientID) {
    
        for ( int i = 0; i < this.patients.getPatients().size(); i++ ) {
            if ( this.patients.getPatients().get(i).getUserID().equalsIgnoreCase(_patientID) ) {
                this.patients.removePatient(this.patients.getPatients().get(i));
            } 
        }
    
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
    
    public void writeMedicines(Medicines _medicines) {
        
        if ( gson == null ) {
            gson = new GsonBuilder().setPrettyPrinting().create();
        }
        
        try ( FileWriter fw = new FileWriter(Files.STOCK_PATH) ) {          
            gson.toJson(_medicines.getMedicines(), fw);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }
    
    public void writePatients(Patients patients) {
        // its all about the way this part is setup with filewriter/reader.
        try ( FileWriter fw = new FileWriter(Files.PATIENTS_PATH) ) {          
            gson.toJson(patients.getPatients(), fw);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public ArrayList<Patient> getPatients() {
        
        ArrayList<Patient> _patients = new ArrayList<>();
        
        try ( FileReader fr = new FileReader(Files.PATIENTS_PATH) ) {
            _patients = gson.fromJson(fr, new TypeToken<ArrayList<Patient>>() {}.getType());
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        return _patients;
    
    }
    
    public Medicines getMedicines() {
        
        ArrayList<Medicine> _medicines = new ArrayList<>();
        
        if ( gson == null ) {
            gson = new GsonBuilder().setPrettyPrinting().create();
        }
        
        try ( FileReader fr = new FileReader(Files.STOCK_PATH) ) {
            _medicines = gson.fromJson(fr, new TypeToken<ArrayList<Medicine>>() {}.getType());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        Medicines medicines_ = new Medicines();
        medicines_.setMedicines(_medicines);
        
        return medicines_;
    
    }
    
    public Patients Patients() {
        return patients;
    }

    public Prescriptions Prescriptions() {
        return prescriptions;
    }

    public void setPrescriptions(Prescriptions prescriptions) {
        this.prescriptions = prescriptions;
    }

    public Medicines Medicines() {
        return medicines;
    }

    public void setMedicines(Medicines medicines) {
        this.medicines = medicines;
    }
    
    
    
}
