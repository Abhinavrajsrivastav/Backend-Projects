package Students;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class App {

    //database credentials
    private static final String url = "jdbc:mysql://localhost:3306/students";
    private static final String username = "root";
    private static final String password = "Abhinav123";


    public static void main(String[] args) throws Exception {

        //flag is usede here to again ask user if they want to continue or not...
        boolean flag = true;
         try{
            //Load the JDBC driver for MySQL.
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        try{
            //Get a connection to the database...
            Connection connection = DriverManager.getConnection(url, username, password);
            Scanner scanner =  new Scanner(System.in);

            //create objects of all the classes or operations(3) we can perform on table!
            AddStudent add = new AddStudent(connection, scanner);
            RemoveStudent remove = new RemoveStudent(connection, scanner);
            View view = new View(connection, scanner);
            Update update = new Update(connection,scanner);



        //ask user what they want to do with StudentData table...
        while(flag){
        System.out.println("Sir what do you want to do with StudentData table?");
        System.out.println("1. Add a student");
        System.out.println("2. Remove a student");
        System.out.println("3. View all students");
        System.out.println("4. Update a student");
        System.out.println("5. No I don't want to do anything");

        //get user input
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        
        if(choice == 5){
            System.out.println("Thank you for using our Student Management system");
            return;
        }

        //switch statement to handle user input
        switch(choice){
            case 1:
                add.addStudent();
                break;
            case 2:
                remove.removeStudent();
                break;
            case 3:
                view.viewStudents();
                break;
            case 4:
                update.updateStudent();
                break;
            default:
                System.out.println("Invalid choice");
                break;   
        }
        System.out.println("--------------------------------------------------");
    System.out.println("Do you want to continue? (1/0)");
    int ch = input.nextInt();
    if(ch == 0){
        flag = false;
        System.out.println("Thank you for using our Student Management system:");
        System.out.println("------------------------------");
    }
}
connection.close();
        }
    catch(Exception e){
        e.printStackTrace();
    }

}
}
