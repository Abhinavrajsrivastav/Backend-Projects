import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class App {
    public static void main(String[] args) throws Exception {
        
        try{
            String url = "jdbc:mysql://localhost:3306";
            String user = "root";
            String pass = "Abhinav123";

            Connection conn = DriverManager.getConnection(url,user,pass);
            System.out.println("Successfully connected");
        } 
        
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
