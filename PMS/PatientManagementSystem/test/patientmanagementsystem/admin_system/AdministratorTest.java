/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patientmanagementsystem.admin_system;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import patientmanagementsystem.doctor_system.Doctor;
import patientmanagementsystem.doctor_system.Doctors;

/**
 *
 * @author Dyn
 */
public class AdministratorTest {
    
    public AdministratorTest() {
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

    /**
     * Test of addDoctorAccount method, of class Administrator.
     */
    @Test
    public void testAddDoctorAccount() {
        System.out.println("addDoctorAccount");
        String firstname = "";
        String surname = "";
        String address = "";
        int age = 0;
        String password = "";
        Administrator instance = new Administrator();
        instance.addDoctorAccount(firstname, surname, address, age, password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of writeDoctors method, of class Administrator.
     */
    @Test
    public void testWriteDoctors() {
        System.out.println("writeDoctors");
        Doctors _doctors = null;
        Administrator instance = new Administrator();
        instance.writeDoctors(_doctors);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDoctorUserID method, of class Administrator.
     */
    @Test
    public void testSetDoctorUserID() {
        System.out.println("setDoctorUserID");
        Doctor _doctor = null;
        Administrator instance = new Administrator();
        instance.setDoctorUserID(_doctor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeDoctorAccount method, of class Administrator.
     */
    @Test
    public void testRemoveDoctorAccount() {
        System.out.println("removeDoctorAccount");
        String _docID = "";
        Administrator instance = new Administrator();
        instance.removeDoctorAccount(_docID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
