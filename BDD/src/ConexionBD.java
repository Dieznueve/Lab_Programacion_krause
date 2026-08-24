import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConexionBD{
    private static String url="jdbc:mysql://localhost:3307/bdd?useSSL=false&serverTimezone=UTC";
    private static String user="root";
    private static String password = "";

    public static Connection conexion() throws SQLException {
    return DriverManager.getConnection(url, user, password);
    }
}