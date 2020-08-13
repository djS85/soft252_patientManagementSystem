package patientmanagementsystem.doctor_system;

import java.util.ArrayList;

public class DoctorRatings {
    
    // class is used to store objects for serialization/deserialization.
    
    protected ArrayList<DoctorRating> ratings;
    
    public DoctorRatings() {
       ratings = new ArrayList<DoctorRating>();
    }

    public ArrayList<DoctorRating> getRatings() {
        return ratings;
    }

    public void setRatings(ArrayList<DoctorRating> ratings) {
        this.ratings = ratings;
    }

    public void addRating(DoctorRating _rating) {
        ratings.add(_rating);
    }
    
}
