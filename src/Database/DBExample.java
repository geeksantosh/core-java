package Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBExample {
    String userName = "root";
    String password = "";
    String url ="jdbc:mysql://localhost:3306/demo?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    Connection connection = null;
    public void testConnection(){
        try {
            connection = DriverManager.getConnection(url,userName,password);

            System.out.println("Connected!!!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insert(){
        try {
            String query = "INSERT INTO user(name,password,role) values(?,?,?)";
            PreparedStatement pstm = connection.prepareStatement(query);
            pstm.setString(1,"Rameshor");
            pstm.setString(2,"P@ssw0rd");
            pstm.setString(3,"admin");

            pstm.execute();
            System.out.println("Data inserted!!!!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        DBExample db = new DBExample();
        db.testConnection();
        db.insert();

    }
}
