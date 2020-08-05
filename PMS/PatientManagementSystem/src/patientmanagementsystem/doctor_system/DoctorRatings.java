package patientmanagementsystem.doctor_system;

import java.util.ArrayList;

public class DoctorRatings {
    
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
        this.ratings.add(_rating);
    }
    
}
