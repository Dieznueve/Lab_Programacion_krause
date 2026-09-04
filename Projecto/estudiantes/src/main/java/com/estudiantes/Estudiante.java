package com.estudiantes;

public class Estudiante {

    private int id;
    private String nombre;
    private String apellido;
    private String dni;
    private String curso;

    public Estudiante(int id, String nombre, String apellido, String dni, String curso) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.curso = curso;
    }

        public Estudiante(String nombre, String apellido, String dni, String curso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.curso = curso;
    }
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public String getCurso() {
        return curso;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}