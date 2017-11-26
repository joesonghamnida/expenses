import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class IncomeDML {

    //TODO: deal with timestamps and selecting a date
    public void insertIntoIncome(Connection conn, String incomeSource, int amount, String depositDate)throws SQLException{
        PreparedStatement statement = conn.prepareStatement("INSERT INTO income VALUES (NULL ,?,?,?)");
        statement.setString(1, incomeSource);
        statement.setInt(2, amount);
        statement.setString(3, depositDate);
    }

    public void updateIncome(Connection conn)throws SQLException{
        PreparedStatement statement = conn.prepareStatement("");

        //TODO: find something more elegrant than if / else

    }

    public void getIncome()throws SQLException{

    }

    public void removeIncome()throws SQLException{

    }
}
