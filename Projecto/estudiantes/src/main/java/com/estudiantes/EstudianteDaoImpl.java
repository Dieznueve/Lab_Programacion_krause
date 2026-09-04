package com.estudiantes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EstudianteDaoImpl implements EstudianteDao {

    private static final String URL = "jdbc:mysql://localhost:3306/estudiantes";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";

    public Connection conexion() throws SQLException {
        return DriverManager.getConnection(URL, USUARIO, PASSWORD);
    }

    @Override
    public void insertar(Estudiante e) {

        String sql = "INSERT INTO estudiante (nombre, apellido, dni, curso) VALUES (?, ?, ?, ?)";

        try (PreparedStatement ps = conexion().prepareStatement(sql)) {

            ps.setString(1, e.getNombre());
            ps.setString(2, e.getApellido());
            ps.setString(3, e.getDni());
            ps.setString(4, e.getCurso());

            int filasAfectadas = ps.executeUpdate();

            System.out.println("Filas insertadas: " + filasAfectadas);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public List<Estudiante> consultar() {

        List<Estudiante> estudiantes = new ArrayList<>();

        String query = "SELECT * FROM estudiante";

        try (PreparedStatement ps = conexion().prepareStatement(query)) {

            try (ResultSet rs = ps.executeQuery()) {

                while (rs.next()) {

                    int id = rs.getInt("id");
                    String nombre = rs.getString("nombre");
                    String apellido = rs.getString("apellido");
                    String dni = rs.getString("dni");
                    String curso = rs.getString("curso");

                    estudiantes.add(
                        new Estudiante(id, nombre, apellido, dni, curso)
                    );

                    System.out.println(
                        "ID: " + id +
                        " | Nombre: " + nombre +
                        " | Apellido: " + apellido +
                        " | DNI: " + dni +
                        " | Curso: " + curso
                    );
                }
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return estudiantes;
    }

    @Override
    public void actualizar(Estudiante e) {

        String sql = "UPDATE estudiante SET curso = ? WHERE id = ?";

        try (PreparedStatement ps = conexion().prepareStatement(sql)) {

            ps.setString(1, e.getCurso());
            ps.setInt(2, e.getId());

            int filasAfectadas = ps.executeUpdate();

            System.out.println("Filas actualizadas: " + filasAfectadas);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void eliminar(int id) {

        String sql = "DELETE FROM estudiante WHERE id = ?";

        try (PreparedStatement ps = conexion().prepareStatement(sql)) {

            ps.setInt(1, id);

            int filasAfectadas = ps.executeUpdate();

            System.out.println("Filas eliminadas: " + filasAfectadas);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}