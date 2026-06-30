public class Seleccion {

    private String nombre;
    private String continente;
    private int puntos;
    private int jugadoresConvocados;
    private boolean clasificado;
    private DirectorTecnico directorTecnico;

    public Seleccion(String nombre, String continente, int puntos, int cantidadJugadores, boolean clasificada) throws IllegalArgumentException {
        this.nombre = nombre;
        this.continente = continente;
        this.puntos = puntos;
        this.clasificado = clasificada;
        validarJugadores(cantidadJugadores);
        this.jugadoresConvocados = cantidadJugadores;
        this.directorTecnico = null;
    }

    public void validarJugadores(int cantidad) throws IllegalArgumentException {
        if (cantidad < 1 || cantidad > 26) {
            throw new IllegalArgumentException("La cantidad de jugadores debe ser entre 1 y 26, ingresaste: " + cantidad);
        }
    }

    public void disputarPartido() throws JugadoresInsuficientesException {
        if (this.jugadoresConvocados < 11) {
            throw new JugadoresInsuficientesException("La seleccion " + this.nombre + " no puede disputar el partido, jugadores habilitados: " + this.jugadoresConvocados);
        }
        System.out.println("La seleccion " + this.nombre + " está lista para disputar el partido");
    }

    public String getNombre() {
        return nombre;
    }

    public String getContinente() {
        return continente;
    }

    public int getPuntos() {
        return puntos;
    }

    public int getJugadoresConvocados() {
        return jugadoresConvocados;
    }

    public boolean getClasificado() {
        return clasificado;
    }

    public DirectorTecnico getDirectorTecnico() {
        return directorTecnico;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public void setDirectorTecnico(DirectorTecnico directorTecnico) {
        this.directorTecnico = directorTecnico;
    }

    public void mostrarSeleccion() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Continente: " + this.continente);
        System.out.println("Puntos: " + this.puntos);
        System.out.println("Jugadores convocados: " + this.jugadoresConvocados);
        System.out.println("Clasificado: " + this.clasificado);
    }
}