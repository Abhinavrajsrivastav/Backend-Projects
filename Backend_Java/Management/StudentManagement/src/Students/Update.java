package Students;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

//Update class to update the student details...
public class Update {
      static Connection connection;
      Scanner scanner;

      //Update constructor...
    public Update(Connection connection, Scanner scanner){
         this.connection = connection;
         this.scanner = scanner;
     }

        //updateStudent method...
     public static void updateStudent(){
        //  Connection connection = null;
        try{
            //detatils of student which we want to updata...
            System.out.println("Enter the roll_no of student");
            Scanner sc = new Scanner(System.in);
            int ro = sc.nextInt();
              
            System.out.println("Enter the name of student you want to update");
            String name = sc.nextLine();


            //SQL query...
            String query = "Update STUDENTDATA SET NAME = ? WHERE ROLL_NO = ?";

            //preparedStatement is an object which basically compiled the given query...
            PreparedStatement preparedStatement = connection.prepareStatement(query);

            //setString method is used to set the value of the query...
            preparedStatement.setString(1,name);
            //setInt method is used to set the value of the query...
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
