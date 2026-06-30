import java.util.ArrayList;
import java.util.Scanner;

public class Mundial {

    private ArrayList<Seleccion> selecciones;

    public Mundial() {
        this.selecciones = new ArrayList<Seleccion>();
    }

    public void agregarSeleccion(Seleccion seleccion) {
        this.selecciones.add(seleccion);
    }

    public void consultarSeleccionPorPosicion(int posicion) {
        try {
            Seleccion seleccion = this.selecciones.get(posicion);
            seleccion.mostrarSeleccion();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: La posicion " + posicion + " no existe en la lista");
        } finally {
            System.out.println("Consulta por posicion finalizada.");
        }
    }

    public void actualizarPuntos(int posicion, String valorIngresado) {
        try {
            int nuevosPuntos = Integer.parseInt(valorIngresado);
            this.selecciones.get(posicion).setPuntos(nuevosPuntos);
            System.out.println("Puntos actualizados correctamente a: " + nuevosPuntos);
        } catch (NumberFormatException e) {
            System.out.println("Error: El valor ingresado no es numérico: \"" + valorIngresado + "\"");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: La posicion " + posicion + " no existe en la lista.");
        } finally {
            System.out.println("Actualización de puntos finalizada.");
        }
    }

    public void consultarDirectorTecnico(int posicion) {
        try {
            Seleccion seleccion = this.selecciones.get(posicion);
            DirectorTecnico dt = seleccion.getDirectorTecnico();
            dt.mostrarDirectorTecnico();
        } catch (NullPointerException e) {
            System.out.println("Error: Esta seleccion no tiene Director Tecnico asignado.");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: La posicion " + posicion + " no existe en la lista.");
        } finally {
            System.out.println("Consulta de Director Tecnico finalizada.");
        }
    }

    public void iniciarPartido(int posicion) {
        try {
            Seleccion seleccion = this.selecciones.get(posicion);
            seleccion.disputarPartido();
        } catch (JugadoresInsuficientesException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: La posicion " + posicion + " no existe en la lista.");
        } finally {
            System.out.println("Intento de inicio de partido finalizado.");
        }
    }
}