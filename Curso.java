import java.util.ArrayList;

public class Curso {
    private String nombre;
    private ArrayList<Estudiante> alumnos;

    public Curso(String nombre) {
        this.nombre = nombre;
        this.alumnos = new ArrayList<>();
    }

    public void inscribir(Estudiante e) {
        alumnos.add(e);
    }

    public void darDeBaja(int indice) {
        alumnos.remove(indice);
    }

    public void listarAlumnos() {
        System.out.println("Alumnos inscritos en el curso " + nombre + ":");
        for (Estudiante e : alumnos) {
            e.mostrarFicha();
        }
    }

    public int cantidadAlumnos() {
        return alumnos.size();
    }
}