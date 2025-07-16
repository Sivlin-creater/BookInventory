package bookinventory;

//import com.sun.jdi.connect.spi.Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/testdb";
    private static final String USER = "root";
    private static final String PASS = "";
    
    public static Connection connectDb(){
        Connection conn = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Database connected successfully!");
        }catch(ClassNotFoundException | SQLException e){
            System.err.println("Database connection failed: " + e.getMessage());
        }
        return conn;
    }
}

