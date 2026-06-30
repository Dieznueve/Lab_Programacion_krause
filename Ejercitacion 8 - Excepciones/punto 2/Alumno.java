public class Alumno {

    private int dni;
    private String nombre;
    private String curso;
    private int inasistencias;
    private String estadoAcademico;
    private Tutor tutor;

    private static final int LIMITE_INASISTENCIAS = 15;

    public Alumno(int dni, String nombre, String curso, int inasistencias, String estadoAcademico) throws IllegalArgumentException {
        this.dni = dni;
        this.nombre = nombre;
        this.curso = curso;
        this.estadoAcademico = estadoAcademico;
        this.tutor = null;
        validarInasistencias(inasistencias);
        this.inasistencias = inasistencias;
    }

    public void validarInasistencias(int cantidad) throws IllegalArgumentException {
        if (cantidad < 0) {
            throw new IllegalArgumentException("La cantidad de inasistencias no puede ser negativa, se ingreso: " + cantidad);
        }
    }

    public void realizarOperacionAcademica() throws AlumnoLibreException {
        if (this.inasistencias > LIMITE_INASISTENCIAS) {
            throw new AlumnoLibreException("El alumno " + this.nombre + " esta libre por superar el limite de " + LIMITE_INASISTENCIAS + " inasistencias. Inasistencias actuales: " + this.inasistencias);
        }
        System.out.println("Operacion academica realizada correctamente para: " + this.nombre);
    }

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCurso() {
        return curso;
    }

    public int getInasistencias() {
        return inasistencias;
    }

    public String getEstadoAcademico() {
        return estadoAcademico;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setInasistencias(int inasistencias) {
        this.inasistencias = inasistencias;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

    public void mostrarAlumno() {
        System.out.println("DNI: " + this.dni);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Curso: " + this.curso);
        System.out.println("Inasistencias: " + this.inasistencias);
        System.out.println("Estado academico: " + this.estadoAcademico);
    }
}