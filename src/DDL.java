import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DDL {

    public static Connection connection() throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:h2:./main");
        return conn;
    }

    public static void createDatabase(Connection conn)throws SQLException{
        Statement statement = conn.createStatement();
        statement.execute("CREATE TABLE IF NOT EXISTS expenses(id IDENTITY expense VARCHAR amount INTEGER payment_source VARCHAR expense_type INTEGER)");
    }
}
