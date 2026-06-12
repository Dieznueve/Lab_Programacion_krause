public class Main {
    public static void main(String[] args) {
        String [ ] [ ] datos = {
            // Argentina
            {"Emiliano Martinez", "Arquero", "33", "Aston Villa", "true"},
            {"Cristian Romero", "Defensor", "28", "Tottenham", "true"},
            {"Nicolas Otamendi", "Defensor", "38", "Benfica", "true"},
            {"Nahuel Molina", "Defensor", "28", "Atletico Madrid", "true"},
            {"Enzo Fernandez", "Mediocampista", "25", "Chelsea", "true"},
            {"Rodrigo De Paul", "Mediocampista", "32", "Inter Miami", "true"},
            {"Alexis Mac Allister", "Mediocampista", "27", "Liverpool", "true"},
            {"Lionel Messi", "Delantero", "39", "Inter Miami", "true"},
            {"Julian Alvarez", "Delantero", "26", "Atletico Madrid", "true"},
            {"Lautaro Martinez", "Delantero", "29", "Inter Milan", "true"},
            {"Paulo Dybala", "Delantero", "33", "Roma", "false"},
            // Francia
            {"Mike Maignan", "Arquero", "31", "Milan", "true"},
            {"William Saliba", "Defensor", "25", "Arsenal", "true"},
            {"Theo Hernandez", "Defensor", "29", "Milan", "true"},
            {"Jules Kounde", "Defensor", "28", "Barcelona", "true"},
            {"Aurelien Tchouameni", "Mediocampista", "26", "Real Madrid", "true"},
            {"Eduardo Camavinga", "Mediocampista", "24", "Real Madrid", "true"},
            {"Adrien Rabiot", "Mediocampista", "31", "Marseille", "true"},
            {"Kylian Mbappe", "Delantero", "28", "Real Madrid", "true"},
            {"Ousmane Dembele", "Delantero", "29", "PSG", "true"},
            {"Marcus Thuram", "Delantero", "29", "Inter Milan", "true"},
            {"Antoine Griezmann", "Delantero", "35", "Atletico Madrid", "false"}
            };

        Jugador[] jugadores = new Jugador[datos.length];
        
        for (int i = 0; i < datos.length; i++) {
            String nombre = datos[i][0];
            String posicion = datos[i][1];
            int edad = Integer.parseInt(datos[i][2]);
            String equipo = datos[i][3];
            boolean convocado = Boolean.parseBoolean(datos[i][4]);

            jugadores[i] = new Jugador(nombre, posicion, edad, equipo, convocado);
        }

        Seleccion seleccion = new Seleccion();
        for (Jugador j : jugadores) {
            seleccion.agregarJugador(j);
        }

        System.out.println("\n--------- convocados ---------");
        seleccion.mostrarConvocados();

        System.out.println("\n--------- no convocados ---------");
        seleccion.mostrarNoConvocados();

        System.out.println("\n--------- busqueda por posicion: Delantero ---------");
        seleccion.buscarPorPosicion("Delantero");

        System.out.println("\n--------- contar por ---------");
        seleccion.contarPorSeleccion();

        System.out.println("\n--------- jugador mas joven ---------");
        seleccion.jugadorMasJoven();

        System.out.println("\n--------- JUGADOR MAS VETERANO ---------");
        seleccion.jugadorMasVeterano();

        System.out.println("\n--------- busqueda por club: Real Madrid ---------");
        seleccion.buscarPorEquipo("Real Madrid");

        System.out.println("\n--------- orden por edad ---------");
        seleccion.ordenarPorEdad();

        System.out.println("\n--------- contar por posicion ---------");
        seleccion.contarPorPosicion();

        System.out.println("\n--------- verificar convocatoria ---------");
        seleccion.estaConvocado("Lionel Messi");
        seleccion.estaConvocado("Paulo Dybala");

        System.out.println("\n--------- promedio de edades ---------");
        seleccion.promedioEdad();

        System.out.println("\n--------- eliminar jugador ---------");
        seleccion.eliminarJugador("Antoine Griezmann");
    }
}
