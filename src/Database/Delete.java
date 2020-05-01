package Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Delete {
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

    public void deleteDataQuery(int id){

        try {
            String query = "delete from user where id = ?";
            PreparedStatement pstm = connection.prepareStatement(query);
            pstm.setInt(1, id);

            pstm.executeUpdate();
            System.out.println("Data Deleted Successfully !!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        Delete deleteQuery = new Delete();
        deleteQuery.testConnection();
        deleteQuery.deleteDataQuery(3);

    }
}
