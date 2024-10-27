//package java.jdbc.demo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnector{
    public static void main(String[] args) {
        // Database URL, Username, and Password
        String JDBC_URL = "jdbc:mysql://localhost:3306/students";
        String JDBC_USER = "root";
        String JDBC_PASSWORD = "Amit@3007";

        //Establish connection
        try(Connection connection= DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)){
            System.out.println("Connection to MySQL database established successfully!");

            // Your database operations go here...

        } catch (SQLException e ) {
            System.err.println("connection failed"+ e.getMessage());

        }
    }
}