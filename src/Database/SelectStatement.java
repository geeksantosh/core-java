package Database;
import java.sql.PreparedStatement;
public class SelectStatement {

    public void select(){
        String query = "SELECT * FROM user";
        DatabaseConnection db = new DatabaseConnection();
        PreparedStatement pstm;
    }
}
