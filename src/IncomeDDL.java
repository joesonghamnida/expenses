import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class IncomeDDL {

    public static Connection connection() throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:h2:./main");
        return conn;
    }

    //TODO: deal with timestamps
    public static void createIncomeDatabase(Connection conn)throws SQLException{
        Statement statement = conn.createStatement();
        statement.execute("CREATE TABLE IF NOT EXISTS income(id IDENTITY income VARCHAR amount INTEGER depositDate VARCHAR)");
    }

}
