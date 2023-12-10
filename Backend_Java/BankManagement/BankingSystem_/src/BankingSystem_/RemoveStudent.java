package BankingSystem_;

// RemoveStudent.java
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class RemoveStudent {
   static Connection connection;
    Scanner scanner;

    public RemoveStudent(Connection connection, Scanner scanner) {
        this.connection = connection;
        this.scanner = scanner;
    }

    public static void removeStudent() {
       try{
        System.out.println("Enter the roll_no of student");
        Scanner sc = new Scanner(System.in);
        int ro = sc.nextInt();

        String query = "DELETE FROM STUDENTDATA WHERE ROLL_NO = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1,ro);

        int effected = preparedStatement.executeUpdate();
        if(effected>0){
            System.out.println("Student removed successfully");
        }
        else{
            System.out.println("Something went wrong");
        }
       }
         catch(SQLException e){
              e.printStackTrace();
         }

    }
}
