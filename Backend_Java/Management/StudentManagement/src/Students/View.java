package Students;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class View {
    static Connection connection;
    Scanner scanner;
    
    public View(Connection connection,Scanner scanner){
        this.connection = connection;
        this.scanner = scanner;
    }

    public static void viewStudents(){
        System.out.println("--------------------------------");
        System.out.println("Viewing all students...");

        String query = "SELECT * FROM STUDENTDATA";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet res = preparedStatement.executeQuery();
           if(res.next()){
            do {
            System.out.println("Roll No: " + res.getInt("ROLL_NO"));
            System.out.println("Name: " + res.getString("NAME"));
            System.out.println("Age: " + res.getInt("AGE"));
            System.out.println("------------------------------");
            } while (res.next());
           }
           else{
               System.out.println("No students found");
               System.out.println("------------------------------");
           }      
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
