import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ExpenseDML {

    //TODO: deal with timestamps and selecting a date
    public void insertIntoExpenses(Connection conn, String expense, int amount, String dueDate, String paymentSource, int expenseType)throws SQLException {
        PreparedStatement statement = conn.prepareStatement("INSERT INTO expenses VALUES (NULL ,?,?,?,?,?)");
        statement.setString(1, expense);
        statement.setInt(2,amount);
        statement.setString(3, dueDate);
        statement.setString(4, paymentSource);
        statement.setInt(5, expenseType);
    }

    public void updateExpenses(Connection conn)throws SQLException{
        PreparedStatement statement = conn.prepareStatement("");

        //TODO: find something more elegant than if / else

    }

    public void getExpenses()throws SQLException{

    }

    public void removeExpense()throws SQLException{

    }
}
