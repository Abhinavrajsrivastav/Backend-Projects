package Students;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AddStudent {

    //connection and scanner objects
    static Connection connection;
    Scanner scanner;

    //constructor to initialize connection and scanner objects from App.java
    public AddStudent(Connection connection, Scanner scanner) {
        this.connection = connection;
        this.scanner = scanner;
    }

    //add students...
    public static void addStudent() {

        //entering student details... 
        System.out.println("Enter the roll_no of student");
        Scanner sc = new Scanner(System.in);
        int ro = sc.nextInt();
        System.out.println("Enter full the name of student");
        String name = sc.next();
        System.out.println("Enter the age of student");
        int age = sc.nextInt();

        //check if user already exists...
        if(user_exist(ro)) {
            System.out.println("User Already Exists for this Email Address!!");
            return;
        }

        //if user do not exist...

        //query to insert data into database...
        String query = "INSERT INTO STUDENTData(ROLL_NO, NAME, AGE) VALUES(?,?,?)";
        try{
        
        //prepared statement to execute query...
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1,ro);
        preparedStatement.setString(2,name);
        preparedStatement.setInt(3,age);
        //execute update query...
        int affectedRow = preparedStatement.executeUpdate();

        //if affected = 1, then student added successfully...
        if(affectedRow>0){
            System.out.println("Student added successfully");
        }
        else{
            System.out.println("Something went wrong");
        }
        }
         catch(SQLException e){
        e.printStackTrace();
    }
}

//check if user already exists...
    public static boolean user_exist(int si){
        String query = "SELECT *FROM studentData WHERE ROLL_NO = ?";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1,si);
            ResultSet result = preparedStatement.executeQuery();

            if(result.next()){
                return true;
            }
            else{
                return false;
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    return false;
    }


}