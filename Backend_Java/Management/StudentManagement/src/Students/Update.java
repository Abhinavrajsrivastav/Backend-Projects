package Students;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Update {
      static Connection connection;
      Scanner scanner;

    public Update(Connection connection, Scanner scanner){
         this.connection = connection;
         this.scanner = scanner;
     }

     public static void updateStudent(){
        try{
            System.out.println("Enter the roll_no of student");
            Scanner sc = new Scanner(System.in);
            int ro = sc.nextInt();

            String query = "Update STUDENTDATA SET NAME = ? WHERE ROLL_NO = ?";

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,"Archit");
            preparedStatement.setInt(2,ro);

            int effected = preparedStatement.executeUpdate();

            if(effected > 0){
                System.out.println("Student updated successfully");
            }
            else{
                System.out.println("Student with roll_no " + ro + " does not exist");
            }
            System.out.println("Thankyou for using our student management system");
        }
        catch(Exception e){
            e.printStackTrace();
        }
     }

}
