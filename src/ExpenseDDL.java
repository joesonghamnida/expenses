import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ExpenseDDL {

    public static void createExpensesDatabase(Connection conn)throws SQLException {
        Statement statement = conn.createStatement();
        statement.execute("CREATE TABLE IF NOT EXISTS expenses(id IDENTITY income VARCHAR amount INTEGER payDate VARCHAR payment_source VARCHAR)");
    }
    

}
