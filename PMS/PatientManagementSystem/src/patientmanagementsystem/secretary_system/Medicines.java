package patientmanagementsystem.secretary_system;

import java.util.ArrayList;

public class Medicines {

    private ArrayList<Medicine> medicines;
    
    public Medicines() {
        this.medicines = new ArrayList<>();
    }
    
    public void addMedicine(Medicine _medicine) {
        this.medicines.add(_medicine);
    }

    public ArrayList<Medicine> getMedicines() {
        return medicines;
    }

    public void setMedicines(ArrayList<Medicine> medicines) {
        this.medicines = medicines;
    }
}
