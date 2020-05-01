package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseConnection {
    private final String userName = "root";
    private final String password = "";
    private final String url = "jdbc:mysql://localhost:3306/demo?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    Connection connection = null;



    public void DatabaseConnection() {
        try {
            connection = DriverManager.getConnection(url, userName, password);

            System.out.println("Connected!!!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

/*    final public PreparedStatement getPreparedStatement(String query) {
        try{
            PreparedStatement pstm = connection.prepareStatement(query);
           }catch (SQLException e){
            e.printStackTrace();
        }
    }*/
    final public void closeConnection(){
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ;
    }
}
