package patientmanagementsystem.patient_system;

import java.util.ArrayList;

public class Patients {
    
    protected ArrayList<Patient> patients;
    
    public Patients() {
        patients = new ArrayList<Patient>();
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public void setPatients(ArrayList<Patient> patients) {
        this.patients = patients;
    }
    
    public void addPatient(Patient _patient) {
        this.patients.add(_patient);
    }
    
    public void removePatient(Patient _patient) {
        this.patients.remove(_patient);
    }

}
