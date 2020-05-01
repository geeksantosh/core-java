package Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;
public class UpdateQuery {
    String userName = "root";
    String password = "";
    String url = "jdbc:mysql://localhost:3306/demo?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    Connection connection = null;



    public void testConnection() {
        try {
            connection = DriverManager.getConnection(url, userName, password);

            System.out.println("Connected!!!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void update(){
    try{
        String query = "update user set name = ? , password = ? , role = ? ";
        PreparedStatement pstm = connection.prepareStatement(query);
        pstm.setString(1, "Shyam");
        pstm.setString(2, "Pass");
        pstm.setString(3, "test");
        pstm.execute();
        System.out.println("Data Updated!!!!");
    }catch (SQLException e){
        e.printStackTrace();
    }
    }

    public static void main(String[] args) {

            UpdateQuery updateQuery = new UpdateQuery();
            updateQuery.testConnection();
            updateQuery.update();



    }
}


