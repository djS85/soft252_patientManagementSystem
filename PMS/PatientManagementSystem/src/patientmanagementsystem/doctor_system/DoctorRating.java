package patientmanagementsystem.doctor_system;

public class DoctorRating {
    
    // POJO class for serialization/deserialization from json.
    
    private String doctorSurname;
    private String doctorID;
    private int rating;
    private String feedback;
    
    public DoctorRating() {}
    
    public void create(String _doctorSurname, String _doctorID, String _feedback, int _rating) {
        this.setDoctorSurname(_doctorSurname);
        this.setDoctorID(_doctorID);
        this.setFeedback(_feedback);
        this.setRating(_rating);
    }

    public String getDoctorSurname() {
        return doctorSurname;
    }

    public void setDoctorSurname(String doctorSurname) {
        this.doctorSurname = doctorSurname;
    }

    public String getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(String doctorID) {
        this.doctorID = doctorID;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
    
}
