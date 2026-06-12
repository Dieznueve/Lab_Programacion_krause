import java.util.ArrayList;

public class Seleccion {
    private ArrayList<Jugador> jugadores = new ArrayList<Jugador>();

    public void agregarJugador(Jugador j) {
        jugadores.add(j);
    }

    public void eliminarJugador(String nombre) {
        for (int i = 0; i < jugadores.size(); i++) {
            if (jugadores.get(i).getNombre().equals(nombre)) {
                jugadores.remove(i);
                System.out.println(nombre + " eliminado del plantel.");
                return;
            }
        }
        System.out.println("Jugador no encontrado: " + nombre);
    }

    public void buscarPorPosicion(String posicion) {
        System.out.println("Jugadores en posicion " + posicion + ":");
        for (Jugador j : jugadores) {
            if (j.getPosicion().equals(posicion)) {
                j.mostrarJugador();
            }
        }
    }

    public void mostrarConvocados() {
        System.out.println("Jugadores convocados:");
        for (Jugador j : jugadores) {
            if (j.getConvocado()) {
                j.mostrarJugador();
            }
        }
    }

    public void mostrarNoConvocados() {
        System.out.println("Jugadores NO convocados:");
        for (Jugador j : jugadores) {
            if (!j.getConvocado()) {
                j.mostrarJugador();
            }
        }
    }

    public void contarPorSeleccion() {
        int argentina = 0, francia = 0;
        for (int i = 0; i < jugadores.size(); i++) {
            if (i < 11) argentina++;
            else francia++;
        }
        System.out.println("Jugadores de Argentina: " + argentina);
        System.out.println("Jugadores de Francia: " + francia);
    }

    public void jugadorMasJoven() {
        Jugador masJoven = jugadores.get(0);
        for (Jugador j : jugadores) {
            if (j.getEdad() < masJoven.getEdad()) {
                masJoven = j;
            }
        }
        System.out.println("Jugador mas joven:");
        masJoven.mostrarJugador();
    }

    public void jugadorMasVeterano() {
        Jugador masVeterano = jugadores.get(0);
        for (Jugador j : jugadores) {
            if (j.getEdad() > masVeterano.getEdad()) {
                masVeterano = j;
            }
        }
        System.out.println("Jugador mas veterano:");
        masVeterano.mostrarJugador();
    }

    public void buscarPorEquipo(String equipo) {
        System.out.println("Jugadores del club " + equipo + ":");
        for (Jugador j : jugadores) {
            if (j.getClub().equals(equipo)) {
                j.mostrarJugador();
            }
        }
    }

    public void ordenarPorEdad() {
        Jugador[] js = new Jugador[jugadores.size()];
        js = jugadores.toArray(js);
        Jugador aux;
        for (int i = 0; i < js.length; i++) {
            for (int j = 0; j < js.length; j++) {
                if (js[j].getEdad() > js[i].getEdad()) {
                    aux = js[j];
                    js[j] = js[i];
                    js[i] = aux;
                }
            }
        }
        System.out.println("Plantel ordenado por edad:");
        for (int i = 0; i < js.length; i++) {
            js[i].mostrarJugador();
        }
    }

    public void contarPorPosicion() {
        int arqueros = 0, defensores = 0, mediocampistas = 0, delanteros = 0;
        for (Jugador j : jugadores) {
            if (j.getPosicion().equals("Arquero")) {
                arqueros++;
            } else if (j.getPosicion().equals("Defensor")) {
                defensores++;
            } else if (j.getPosicion().equals("Mediocampista")) {
                mediocampistas++;
            } else if (j.getPosicion().equals("Delantero")) {
                delanteros++;
            }
        }
        System.out.println("Arqueros: " + arqueros);
        System.out.println("Defensores: " + defensores);
        System.out.println("Mediocampistas: " + mediocampistas);
        System.out.println("Delanteros: " + delanteros);
    }

    public void estaConvocado(String nombre) {
        for (Jugador j : jugadores) {
            if (j.getNombre().equals(nombre)) {
                System.out.println(nombre + (j.getConvocado() ? "Si esta convocado" : "No esta convocado"));
                return;
            }
        }
        System.out.println("Jugador no encontrado: " + nombre);
    }

    public void promedioEdad() {
        int suma = 0;
        for (Jugador j : jugadores) {
            suma += j.getEdad();
        }
        double promedio = (double) suma / jugadores.size();
        System.out.println("Promedio de edad del plantel: " + promedio);
    }
}