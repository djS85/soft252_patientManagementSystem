package patientmanagementsystem.patient_system;

import patientmanagementsystem.User;

public class Patient extends User {
    
    public Patient(String _firstname, String _lastname, String _address, int _age) {
        this.setFirstname(_firstname);
        this.setSurname(_lastname);
        this.setAddress(_address);
        this.setAge(_age);
    }

}
