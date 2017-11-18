import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class IncomeDMLTests {

    //helper method
    public Connection startConnection() throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:h2:mem:test");
        IncomeDDL.createIncomeDatabase(conn);
        return conn;
    }

    @Test
    public void UpdateDB(){}

    @Test
    public void RemoveDataFromDB(){}

}
