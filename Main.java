import java.sql.Connection;
import java.sql.SQLException;

public class Main {
        public static void main(String[] args) {
            try (Connection conn = DBConnection.getConnection()) {
                if (conn != null) {
                    System.out.println("Connection established!");
                    GUI GUI = new GUI();
                    GUI.checkUser();
                }
            } catch (SQLException e) {
                System.out.println("Connection failed: " + e.getMessage());
            }
        }


}

