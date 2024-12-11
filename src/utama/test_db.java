import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class test_db {
    private static final String URL = "jdbc:mysql://localhost:3306/aplikasi_absensi";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            if (conn != null) {
                System.out.println("Connected to the database.");
            }
        } catch (SQLException e) {
            System.out.println("Connection failed: " + e.getMessage());
        }
    }
}
