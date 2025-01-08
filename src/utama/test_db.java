import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Random;

public class test_db {
    private static final String URL = "jdbc:mysql://localhost:3306/aplikasi_absensi";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = 10000000 + random.nextInt(90000000); // Angka 8 digit (10000000-99999999)
        System.out.println("Angka random 8 digit: " + randomNumber);
    }
}
