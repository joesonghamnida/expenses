import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DDL {

    public static Connection connection() throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:h2:./main");
        return conn;
    }

    public static void createDatabase(Connection connection){

    }
}
