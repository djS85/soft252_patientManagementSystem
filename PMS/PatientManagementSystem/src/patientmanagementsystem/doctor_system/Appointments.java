package patientmanagementsystem.doctor_system;

import java.util.ArrayList;

public class Appointments {
    
    private ArrayList<Appointment> appointments;
    
    public Appointments() {
        this.appointments = new ArrayList<Appointment>();
    }
    
    public void addAppointment(Appointment _appointment) {
        this.appointments.add(_appointment);
    }

    public ArrayList<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(ArrayList<Appointment> appointments) {
        this.appointments = appointments;
    }
}
