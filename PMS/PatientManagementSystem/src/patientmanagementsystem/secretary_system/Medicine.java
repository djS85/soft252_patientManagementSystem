package patientmanagementsystem.secretary_system;

public class Medicine {
    
    // POJO class for serialization/deserialization from json.
    
    private String medicineName;
    private int quantityInStock;
    
    public Medicine() {
        
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }
    
    

}
