import java.sql.SQLException;
import java.sql.Connection;

public class Main {
    public static void main (String[]args){
        try{
            Connection conexion = ConexionBD.conexion();
            System.out.println("Conexion exitosa de la bdd");
            conexion.close();

        }catch(SQLException e){
            System.out.println("ERROR");
            e.printStackTrace();
        }
        try {
            crud.insertar(); 
            crud.consultar();
            crud.actualizar();
            crud.eliminar();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}