
//1 Connection class is used to establish connection with the database.
import java.sql.Connection;

//2 DriverManager class manages the JDBC drivers.
import java.sql.DriverManager;

//3 PreparedStatement interface is used to execute parameterized query.
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//4 SQLException class handles SQL errors.
import java.sql.SQLException;

//5 Statement interface is used to execute SQL queries.
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;
//Prepare Statement is used to execute parameterized query.
import com.mysql.cj.x.protobuf.MysqlxPrepare.Prepare;

//Create class Create_DB...
public class Create_DB {

    // JDBC driver name, database URL and credentials...
    static final String DB_URL = "jdbc:mysql://localhost:3306/";
    static final String DB_Name = "apple";
    static final String USER = "root";
    static final String PASS = "###";

    // Create_Table method...
    public static void Create_Table() {
    
        // Createing an object of Connection class...
        try (Connection conn = DriverManager.getConnection(DB_URL+DB_Name, USER, PASS);

        // Create a statement using connection object...
             Statement stmt = conn.createStatement();) 
        {
            // String sql = "insert into friends values('Abhinav',21)";
            //sql queries String...
            // String sql = "insert into friends values(?,?)";
            String sql = "insert into friends values('Archit',22)";

            //psmt is an object of PreparedStatement class...
            PreparedStatement pstmt = conn.prepareStatement(sql);

            // pstmt.setString(1, "Abhinav");
            // pstmt.setString(1, "Aman");
            // pstmt.setInt(2, 20);

            //executeUpdate method is used to execute the sql query...
            // ResultSet result =   pstmt.executeQuery(sql);

            // while(result.next()){
            //     System.out.print(result.getString(1));
            //     System.out.println(result.getInt(2));
            // }

            stmt.executeUpdate(sql);

            //close the connection object...
            conn.close();

            //print the message...
            System.out.println("Data inserted successfully...");
        } 

        //catch block...
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }
}
