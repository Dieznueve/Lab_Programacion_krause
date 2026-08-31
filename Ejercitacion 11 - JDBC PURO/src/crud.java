
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public interface crud {

    public static void insertar() throws SQLException {

        String sql = "INSERT INTO vendedores (nombre, apellido, dni, rubro, actual) VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement ps = ConexionBD.conexion().prepareStatement(sql)) {

            ps.setString(1, "Thiago");
            ps.setString(2, "Llano");
            ps.setString(3, "12345678");
            ps.setString(4, "Tecnologia");
            ps.setBoolean(5, true);

            int filasAfectadas = ps.executeUpdate();

            System.out.println("Filas insertadas: " + filasAfectadas);
        }
    }

    public static void consultar() throws SQLException {

        String query = "SELECT * FROM vendedores WHERE actual = ?";

        try (PreparedStatement ps = ConexionBD.conexion().prepareStatement(query)) {

            ps.setBoolean(1, true);

            try (ResultSet rs = ps.executeQuery()) {

                while (rs.next()) {

                    int id = rs.getInt("id");
                    String nombre = rs.getString("nombre");
                    String apellido = rs.getString("apellido");
                    String dni = rs.getString("dni");
                    String rubro = rs.getString("rubro");
                    boolean actual = rs.getBoolean("actual");

                    System.out.println(
                        "ID: " + id +
                        " | Nombre: " + nombre +
                        " | Apellido: " + apellido +
                        " | DNI: " + dni +
                        " | Rubro: " + rubro +
                        " | Actual: " + actual
                    );
                }
            }
        }
    }

    public static void actualizar() throws SQLException {

        String sql = "UPDATE vendedores SET rubro = ? WHERE nombre = ?";

        try (PreparedStatement ps = ConexionBD.conexion().prepareStatement(sql)) {

            ps.setString(1, "Informatica");
            ps.setString(2, "Thiago");

            int filasAfectadas = ps.executeUpdate();

            System.out.println("Filas actualizadas: " + filasAfectadas);
        }
    }

    public static void eliminar() throws SQLException {

        String sql = "DELETE FROM vendedores WHERE nombre = ?";

        try (PreparedStatement ps = ConexionBD.conexion().prepareStatement(sql)) {

            ps.setString(1, "Thiago");

            int filasAfectadas = ps.executeUpdate();

            System.out.println("Filas eliminadas: " + filasAfectadas);
        }
    }
}

