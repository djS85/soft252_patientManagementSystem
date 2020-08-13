package patientmanagementsystem.doctor_system;

import java.util.ArrayList;

public class Prescriptions {
    
    // class is used to store objects for serialization/deserialization.
    
    private ArrayList<Prescription> prescriptions;
    
    public Prescriptions() {
        this.prescriptions = new ArrayList<>();
    }

    public ArrayList<Prescription> getPrescriptions() {
        return prescriptions;
    }

    public void setPrescriptions(ArrayList<Prescription> prescriptions) {
        this.prescriptions = prescriptions;
    }

    public void addPrescription(Prescription _prescription) {
        this.prescriptions.add(_prescription);
    }
    
}
