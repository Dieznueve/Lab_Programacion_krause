public class Main {

    public static void main(String[] args) {
        Curso curso = new Curso("5°2°");

        Estudiante e1 = new Estudiante("Pepe", "23529", 2);
        Estudiante e2 = new Estudiante("Montes", "36346", 10);
        Estudiante e3 = new Estudiante("Fernando", "92453", 7);

        curso.inscribir(e1);
        curso.inscribir(e2);
        curso.inscribir(e3);

        System.out.println("Cantidad de alumnos: " + curso.cantidadAlumnos());
        curso.darDeBaja(1);
        curso.listarAlumnos();
    }
}