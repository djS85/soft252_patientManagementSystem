/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patientmanagementsystem.patient_system;

import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import patientmanagementsystem.doctor_system.Appointment;
import patientmanagementsystem.doctor_system.Appointments;
import patientmanagementsystem.doctor_system.DoctorRating;
import patientmanagementsystem.doctor_system.DoctorRatings;

/**
 *
 * @author Dyn
 */
public class PatientTest {
    
    public PatientTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testRateDoctor() {
        System.out.println("rateDoctor");
        String doctorSurname = "";
        String docID = "";
        String feedback = "";
        int rating = 0;
        Patient instance = new Patient();
        instance.rateDoctor(doctorSurname, docID, feedback, rating);
        
    }

    @Test
    public void testRequestAppointment() {
        System.out.println("requestAppointment");
        String patientID = "";
        String patientFullname = "";
        String doctor = "";
        String date = "";
        String notes = "";
        Patient instance = new Patient();
        instance.requestAppointment(patientID, patientFullname, doctor, date, notes);
        
    }

    @Test
    public void testGetAppointments() {
        System.out.println("getAppointments");
        Patient instance = new Patient();
        ArrayList<Appointment> expResult = null;
        ArrayList<Appointment> result = instance.getAppointments();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testWriteAppointments() {
        System.out.println("writeAppointments");
        Appointments _appointments = null;
        Patient instance = new Patient();
        instance.writeAppointments(_appointments);
        
    }

    @Test
    public void testGetDoctorRatings() {
        System.out.println("getDoctorRatings");
        Patient instance = new Patient();
        ArrayList<DoctorRating> expResult = null;
        ArrayList<DoctorRating> result = instance.getDoctorRatings();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testWriteRatings() {
        System.out.println("writeRatings");
        DoctorRatings _doctorRatings = null;
        Patient instance = new Patient();
        instance.writeRatings(_doctorRatings);
        
    }
    
}
