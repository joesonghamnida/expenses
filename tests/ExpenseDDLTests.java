import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ExpenseDDLTests {

    //helper method
    public Connection startConnection() throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:h2:mem:test");
        IncomeDDL.createExpensesDatabase(conn);
        return conn;
    }

}
