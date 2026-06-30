public class Main {

    public static void main(String[] args) {

        Mundial mundial = new Mundial();

        try {
            Seleccion argentina = new Seleccion("Argentina", "America del Sur", 9, 26, true);
            DirectorTecnico dtArgentina = new DirectorTecnico("Lionel Scaloni", "Argentina");
            argentina.setDirectorTecnico(dtArgentina);
            mundial.agregarSeleccion(argentina);

            Seleccion brasil = new Seleccion("Brasil", "America del Sur", 6, 25, true);
            mundial.agregarSeleccion(brasil);

            Seleccion francia = new Seleccion("Francia", "Europa", 7, 8, true);
            mundial.agregarSeleccion(francia);

            Seleccion invalida = new Seleccion("p1", "Europa", 0, 30, false);
            mundial.agregarSeleccion(invalida);

        } catch (IllegalArgumentException e) {
            System.out.println("Error al crear seleccion: " + e.getMessage());
        }

        System.out.println("---------------------------");

        System.out.println("-- Consulta por posicion 0 --");
        mundial.consultarSeleccionPorPosicion(0);

        System.out.println("-- Consulta por posicion 99 (invalida) --");
        mundial.consultarSeleccionPorPosicion(99);

        System.out.println("---------------------------");

        System.out.println("-- Actualizar puntos con valor valido --");
        mundial.actualizarPuntos(1, "9");

        System.out.println("-- Actualizar puntos con valor invalido --");
        mundial.actualizarPuntos(1, "mucho");

        System.out.println("---------------------------");

        System.out.println("-- Director Tecnico de Argentina (posicion 0) --");
        mundial.consultarDirectorTecnico(0);

        System.out.println("-- Director Tecnico de Brasil (posicion 1, sin DT) --");
        mundial.consultarDirectorTecnico(1);

        System.out.println("---------------------------");

        System.out.println("-- Partido Argentina (26 jugadores) --");
        mundial.iniciarPartido(0);

        System.out.println("-- Partido España (8 jugadores, insuficientes) --");
        mundial.iniciarPartido(2);
    }
}