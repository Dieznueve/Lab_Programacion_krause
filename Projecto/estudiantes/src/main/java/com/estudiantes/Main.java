package com.estudiantes;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {

        try {

            EstudianteDaoImpl dao = new EstudianteDaoImpl();

            Connection conexion = dao.conexion();

            System.out.println("Conexion exitosa de la bdd");

            conexion.close();

            dao.insertar(new Estudiante("Luca", "Barrientos", "12345678", "5°2"));
            dao.insertar(new Estudiante("Ignacio", "Gutierrez", "23456789", "5°2"));
            dao.insertar(new Estudiante("Octavio", "Solorza", "34567890", "5°2"));
            dao.insertar(new Estudiante("Elena", "Torres", "45678901", "5°2"));
            dao.insertar(new Estudiante("Lucas", "Perez", "56789012", "5°2"));
            dao.insertar(new Estudiante("Juan", "Gomez", "67890123", "5°2"));
            dao.insertar(new Estudiante("Martin", "Rodriguez", "78901234", "5°2"));
            dao.insertar(new Estudiante("Mateo", "Fernandez", "89012345", "5°2"));
            dao.insertar(new Estudiante("Santiago", "Lopez", "90123456", "5°2"));
            dao.insertar(new Estudiante("Nicolas", "Martinez", "01234567", "5°2"));

            dao.consultar();

            dao.actualizar(
                new Estudiante(1,"Thiago","Llano","12345678","Programacion")
            );

            dao.eliminar(1);

        } catch (SQLException e) {
            System.out.println("ERROR");
            e.printStackTrace();
        }
    }
}