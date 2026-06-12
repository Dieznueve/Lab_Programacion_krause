public class Jugador {
    private String nombre;
    private String posicion;
    private int edad;
    private String club;
    private boolean convocado;

    public Jugador(String nombre, String posicion, int edad, String club, boolean convocado) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.edad = edad;
        this.club = club;
        this.convocado = convocado;
    }
    
    public String getNombre() {
        return nombre; 
    }

    public String getPosicion() {
        return posicion; 
    }

    public int getEdad() { 
        return edad;
    }

    public String getClub() {
        return club; 
    }

    public boolean getConvocado() { 
        return convocado; 
    }

    public void setConvocado(boolean convocado) {
        this.convocado = convocado; 
    }

    public void mostrarJugador() {
        System.out.println("Jugador: " + this.nombre +
            "Posicion: " + this.posicion +
            "Edad: " + this.edad +
            "Club: " + this.club +
            "Convocado: " + this.convocado);
    }
}