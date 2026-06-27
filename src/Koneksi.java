import java.sql.Connection;
import java.sql.DriverManager;

public class Koneksi {

    private static Connection conn;

    public static Connection getConnection() {
        try {
            if (conn == null || conn.isClosed()) {
                String url = "jdbc:mysql://localhost:3306/gamevault_db";
                String user = "root";
                String password = "Qyko1508";

                conn = DriverManager.getConnection(url, user, password);
                System.out.println("Koneksi berhasil!");
            }
        } catch (Exception e) {
            System.out.println("Koneksi gagal: " + e.getMessage());
        }

        return conn;
    }

    public static void main(String[] args) {
        Koneksi.getConnection();
    }
}