import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
        private static final String URL = "jdbc:postgresql://pgserver.mau.se/";
        private static final String USER = "an9342";
        private static final String PASSWORD = "ja9gujqr";

        public static Connection getConnection() throws SQLException {
            return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
