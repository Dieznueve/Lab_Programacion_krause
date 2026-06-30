public class Main {

    public static void main(String[] args) {

        Escuela escuela = new Escuela();

        try {
            Alumno alumno1 = new Alumno(12345678, "Juan Perez", "3A", 5, "Regular");
            Tutor tutor1 = new Tutor("Maria Perez", "1122334455");
            alumno1.setTutor(tutor1);
            escuela.agregarAlumno(alumno1);

            Alumno alumno2 = new Alumno(87654321, "Ana Garcia", "2B", 16, "Libre");
            escuela.agregarAlumno(alumno2);

            Alumno alumno3 = new Alumno(11223344, "Carlos Lopez", "1C", 3, "Regular");
            escuela.agregarAlumno(alumno3);

            Alumno invalido = new Alumno(99999999, "p1", "1A", -5, "Regular");
            escuela.agregarAlumno(invalido);

        } catch (IllegalArgumentException e) {
            System.out.println("Error al crear alumno: " + e.getMessage());
        }

        System.out.println("---------------------");

        System.out.println("-- Consulta por posicion 0 --");
        escuela.consultarAlumnoPorPosicion(0);

        System.out.println("-- Consulta por posicion 99 invalida --");
        escuela.consultarAlumnoPorPosicion(99);

        System.out.println("---------------------");

        System.out.println("-- Registrar inasistencias con valor valido --");
        escuela.registrarInasistencias(2, "4");

        System.out.println("-- Registrar inasistencias con valor invalido --");
        escuela.registrarInasistencias(2, "muchas");

        System.out.println("-- Registrar inasistencias negativas --");
        escuela.registrarInasistencias(2, "-3");

        System.out.println("---------------------");

        System.out.println("-- Tutor de Juan Perez posicion 0 con tutor --");
        escuela.consultarTutor(0);

        System.out.println("-- Tutor de Ana Garcia posicion 1 sin tutor --");
        escuela.consultarTutor(1);

        System.out.println("---------------------");

        System.out.println("-- Operacion academica Juan Perez 5 inasistencias --");
        escuela.ejecutarOperacionAcademica(0);

        System.out.println("-- Operacion academica Ana Garcia 16 inasistencias libre --");
        escuela.ejecutarOperacionAcademica(1);
    }
}