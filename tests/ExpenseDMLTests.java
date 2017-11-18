import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ExpenseDMLTests {

    //helper method
    public Connection startConnection() throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:h2:mem:test");
        IncomeDDL.createExpensesDatabase(conn);
        return conn;
    }

    @Test
    public void GetAllExpenses(){}

    @Test
    public void GetExepensesByDateRange(){}

    @Test
    public void GetExpensesByAmount(){}

    @Test
    public void GetExpensesByType(){}

    @Test
    public void GetExpensesByBank(){}
}
