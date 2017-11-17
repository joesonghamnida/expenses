import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DML {

    //TODO: deal with timestamps and selecting a date
    public void insertIntoDatabase(Connection conn, String expense, int amount, String paymentSource, int expenseType)throws SQLException{
        PreparedStatement statement = conn.prepareStatement("INSERT INTO expenses VALUES (NULL ,?,?,?,?)");
        statement.setString(1, expense);
        statement.setInt(2,amount);
        statement.setString(3, paymentSource);
        statement.setInt(4, expenseType);
    }
}
