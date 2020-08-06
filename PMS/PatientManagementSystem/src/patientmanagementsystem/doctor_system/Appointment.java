package patientmanagementsystem.doctor_system;

public class Appointment {
    
    private String patientFullname;
    private String doctor;
    private String patientID;
    private String date;
    private String notes;
    
    public Appointment() {
        
        
    
    }

    public String getPatientFullname() {
        return patientFullname;
    }

    public void setPatientFullname(String patientFullname) {
        this.patientFullname = patientFullname;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
    
    public void doctorAddNotes(String _doctorNotes) {
        this.notes = this.notes + "\n" + _doctorNotes;
    }

}
