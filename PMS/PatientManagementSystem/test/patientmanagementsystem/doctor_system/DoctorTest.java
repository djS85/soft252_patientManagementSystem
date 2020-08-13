/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patientmanagementsystem.doctor_system;

import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Dyn
 */
public class DoctorTest {
    
    public DoctorTest() {
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
    public void testCreateAppointment() {
        System.out.println("createAppointment");
        String doctor = "";
        String patientID = "";
        String patientFirstname = "";
        String patientSurname = "";
        String date = "";
        String doctorNotes = "";
        Doctor instance = new Doctor();
        instance.createAppointment(doctor, patientID, patientFirstname, patientSurname, date, doctorNotes);
        
    }

    @Test
    public void testCreatePrescription() {
        System.out.println("createPrescription");
        String _doctorID = "";
        String _patientID = "";
        String _medicine = "";
        String _dosage = "";
        int _quantity = 0;
        Doctor instance = new Doctor();
        instance.createPrescription(_doctorID, _patientID, _medicine, _dosage, _quantity);
        
    }

    @Test
    public void testGetAppointments() {
        System.out.println("getAppointments");
        Doctor instance = new Doctor();
        ArrayList<Appointment> expResult = null;
        ArrayList<Appointment> result = instance.getAppointments();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testWriteAppointments() {
        System.out.println("writeAppointments");
        Appointments _appointments = null;
        Doctor instance = new Doctor();
        instance.writeAppointments(_appointments);
        
    }

    @Test
    public void testGetPrescriptions() {
        System.out.println("getPrescriptions");
        Doctor instance = new Doctor();
        ArrayList<Prescription> expResult = null;
        ArrayList<Prescription> result = instance.getPrescriptions();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testWritePrescriptions() {
        System.out.println("writePrescriptions");
        Prescriptions _prescriptions = null;
        Doctor instance = new Doctor();
        instance.writePrescriptions(_prescriptions);
        
    }
    
}
