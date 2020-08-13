/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patientmanagementsystem.secretary_system;

import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import patientmanagementsystem.doctor_system.Appointment;
import patientmanagementsystem.doctor_system.Appointments;
import patientmanagementsystem.doctor_system.Prescriptions;
import patientmanagementsystem.patient_system.Patient;
import patientmanagementsystem.patient_system.Patients;

/**
 *
 * @author Dyn
 */
public class SecretaryTest {
    
    public SecretaryTest() {
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
        Secretary instance = new Secretary();
        instance.createAppointment(doctor, patientID, patientFirstname, patientSurname, date, doctorNotes);
        
    }

    @Test
    public void testOrderMedicine() {
        System.out.println("orderMedicine");
        String _medicineName = "";
        int _quantity = 0;
        Secretary instance = new Secretary();
        instance.orderMedicine(_medicineName, _quantity);
        
    }

    @Test
    public void testRemovePatient() {
        System.out.println("removePatient");
        String _patientID = "";
        Secretary instance = new Secretary();
        instance.removePatient(_patientID);
        
    }

    @Test
    public void testGetAppointments() {
        System.out.println("getAppointments");
        Secretary instance = new Secretary();
        ArrayList<Appointment> expResult = null;
        ArrayList<Appointment> result = instance.getAppointments();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testWriteAppointments() {
        System.out.println("writeAppointments");
        Appointments _appointments = null;
        Secretary instance = new Secretary();
        instance.writeAppointments(_appointments);
        
    }

    @Test
    public void testWriteMedicines() {
        System.out.println("writeMedicines");
        Medicines _medicines = null;
        Secretary instance = new Secretary();
        instance.writeMedicines(_medicines);
        
    }

    @Test
    public void testWritePatients() {
        System.out.println("writePatients");
        Patients patients = null;
        Secretary instance = new Secretary();
        instance.writePatients(patients);
        
    }

    @Test
    public void testGetPatients() {
        System.out.println("getPatients");
        Secretary instance = new Secretary();
        ArrayList<Patient> expResult = null;
        ArrayList<Patient> result = instance.getPatients();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testGetMedicines() {
        System.out.println("getMedicines");
        Secretary instance = new Secretary();
        Medicines expResult = null;
        Medicines result = instance.getMedicines();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testPatients() {
        System.out.println("Patients");
        Secretary instance = new Secretary();
        Patients expResult = null;
        Patients result = instance.Patients();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testPrescriptions() {
        System.out.println("Prescriptions");
        Secretary instance = new Secretary();
        Prescriptions expResult = null;
        Prescriptions result = instance.Prescriptions();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetPrescriptions() {
        System.out.println("setPrescriptions");
        Prescriptions prescriptions = null;
        Secretary instance = new Secretary();
        instance.setPrescriptions(prescriptions);
        
    }

    @Test
    public void testMedicines() {
        System.out.println("Medicines");
        Secretary instance = new Secretary();
        Medicines expResult = null;
        Medicines result = instance.Medicines();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetMedicines() {
        System.out.println("setMedicines");
        Medicines medicines = null;
        Secretary instance = new Secretary();
        instance.setMedicines(medicines);
        
    }
    
}
