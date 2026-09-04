package com.estudiantes;


import java.util.List;

public interface  EstudianteDao {

    void insertar(Estudiante e) ;

    List<Estudiante> consultar() ;

    void actualizar(Estudiante e) ;

    void eliminar(int id);
}