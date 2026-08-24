
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public interface crud {

    public static void insertar() throws SQLException{
        String sql = "INSERT INTO usuarios (nombre, gmail, activo) VALUES (?, ?, ?)";
            try (PreparedStatement ps = ConexionBD.conexion().prepareStatement(sql)) {
            ps.setString(1, "Thiago3");
            ps.setString(2, "thiago@mail.com");
            ps.setBoolean(3, true);
            int filasAfectadas = ps.executeUpdate();
            System.out.println("Filas insertadas: " + filasAfectadas);
            }
        }
    
    public static void consultar() throws SQLException{
        String query = "SELECT nombre, gmail FROM usuarios WHERE activo = ?";

            try (PreparedStatement ps = ConexionBD.conexion().prepareStatement(query)) {
            ps.setBoolean(1, true);
            try (ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
            String nombre = rs.getString("nombre");
            String correo = rs.getString("gmail");
            System.out.println( " - " + nombre + " - " + correo);
                    }
                }
            } 
    }


    public static void actualizar() throws SQLException{
        String sql = "UPDATE usuarios SET gmail = ? WHERE nombre = ?";

            try (PreparedStatement ps = ConexionBD.conexion().prepareStatement(sql)) {
            ps.setString(1, "nuevo_correo@mail.com");
            ps.setString(2, "Thiago");
            int filasAfectadas = ps.executeUpdate();
            System.out.println("Filas actualizadas: " + filasAfectadas);
            }
    }

    public static void eliminar() throws SQLException {
        String sql = "DELETE FROM usuarios WHERE nombre = ?";

            try (PreparedStatement ps = ConexionBD.conexion().prepareStatement(sql)) {
            ps.setString(1, "Thiago3");
            int filasAfectadas = ps.executeUpdate();
            System.out.println("Filas eliminadas: " + filasAfectadas);
            }
    }
}