package utils;

import java.io.File;

public class Files {
    
//    public static final String APPOINTMENTS_PATH = "C:\\Users\\Dyn\\Desktop\\soft252_patientManagementSystem\\PMS\\PatientManagementSystem\\src\\json\\appointments.json";
//    public static final String PRESCRIPTIONS_PATH = "C:\\Users\\Dyn\\Desktop\\soft252_patientManagementSystem\\PMS\\PatientManagementSystem\\src\\json\\prescriptions.json";
//    public static final String DOCTOR_RATINGS_PATH = "C:\\Users\\Dyn\\Desktop\\soft252_patientManagementSystem\\PMS\\PatientManagementSystem\\src\\json\\doctor_ratings.json";
//    public static final String PATIENTS_PATH = "C:\\Users\\Dyn\\Desktop\\soft252_patientManagementSystem\\PMS\\PatientManagementSystem\\src\\json\\patients.json";
//    public static final String ADMINS_PATH = "C:\\Users\\Dyn\\Desktop\\soft252_patientManagementSystem\\PMS\\PatientManagementSystem\\src\\json\\admin.json";
//    public static final String SECRETARIES_PATH = "C:\\Users\\Dyn\\Desktop\\soft252_patientManagementSystem\\PMS\\PatientManagementSystem\\src\\json\\secretary.json";
//    public static final String DOCTORS_PATH = "C:\\Users\\Dyn\\Desktop\\soft252_patientManagementSystem\\PMS\\PatientManagementSystem\\src\\json\\doctors.json";
//    public static final String STOCK_PATH = "C:\\Users\\Dyn\\Desktop\\soft252_patientManagementSystem\\PMS\\PatientManagementSystem\\src\\json\\stock.json";

    private static final File appointments   = new File("src\\json\\appointments.json");
    private static final File prescriptions  = new File("src\\json\\prescriptions.json");
    private static final File doctor_ratings = new File("src\\json\\doctor_ratings.json");
    private static final File patients       = new File("src\\json\\patients.json");
    private static final File admins         = new File("src\\json\\admin.json");
    private static final File secretaries    = new File("src\\json\\secretary.json");
    private static final File doctors        = new File("src\\json\\doctors.json");
    private static final File stock          = new File("src\\json\\stock.json");
    
    public static String APPOINTMENTS_PATH;
    public static String PRESCRIPTIONS_PATH;
    public static String DOCTOR_RATINGS_PATH;
    public static String PATIENTS_PATH;
    public static String ADMINS_PATH;
    public static String SECRETARIES_PATH;
    public static String DOCTORS_PATH;
    public static String STOCK_PATH;
    
    public static void initPaths() {
        APPOINTMENTS_PATH = appointments.getAbsolutePath();
        PRESCRIPTIONS_PATH = prescriptions.getAbsolutePath();
        DOCTOR_RATINGS_PATH = doctor_ratings.getAbsolutePath();
        PATIENTS_PATH = patients.getAbsolutePath();
        ADMINS_PATH = admins.getAbsolutePath();
        SECRETARIES_PATH = secretaries.getAbsolutePath();
        DOCTORS_PATH = doctors.getAbsolutePath();
        STOCK_PATH = stock.getAbsolutePath();
    }
    
}
