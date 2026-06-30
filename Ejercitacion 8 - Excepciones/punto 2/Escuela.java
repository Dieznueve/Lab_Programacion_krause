import java.util.ArrayList;

public class Escuela {

    private ArrayList<Alumno> alumnos;

    public Escuela() {
        this.alumnos = new ArrayList<Alumno>();
    }

    public void agregarAlumno(Alumno alumno) {
        this.alumnos.add(alumno);
    }

    public void consultarAlumnoPorPosicion(int posicion) {
        try {
            Alumno alumno = this.alumnos.get(posicion);
            alumno.mostrarAlumno();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: La posicion " + posicion + " no existe en la lista.");
        } finally {
            System.out.println("Consulta por posicion finalizada.");
        }
    }

    public void registrarInasistencias(int posicion, String valorIngresado) {
        try {
            int nuevasInasistencias = Integer.parseInt(valorIngresado);
            Alumno alumno = this.alumnos.get(posicion);
            alumno.validarInasistencias(nuevasInasistencias);
            alumno.setInasistencias(alumno.getInasistencias() + nuevasInasistencias);
            System.out.println("Inasistencias registradas correctamente. Total: " + alumno.getInasistencias());
        } catch (NumberFormatException e) {
            System.out.println("Error: El valor ingresado no es numerico: \"" + valorIngresado + "\"");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: La posicion " + posicion + " no existe en la lista.");
        } finally {
            System.out.println("Registro de inasistencias finalizado.");
        }
    }

    public void consultarTutor(int posicion) {
        try {
            Alumno alumno = this.alumnos.get(posicion);
            Tutor tutor = alumno.getTutor();
            tutor.mostrarTutor();
        } catch (NullPointerException e) {
            System.out.println("Error: Este alumno no tiene tutor registrado.");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: La posicion " + posicion + " no existe en la lista.");
        } finally {
            System.out.println("Consulta de tutor finalizada.");
        }
    }

    public void ejecutarOperacionAcademica(int posicion) {
        try {
            Alumno alumno = this.alumnos.get(posicion);
            alumno.realizarOperacionAcademica();
        } catch (AlumnoLibreException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: La posicion " + posicion + " no existe en la lista.");
        } finally {
            System.out.println("Operacion academica finalizada.");
        }
    }
}