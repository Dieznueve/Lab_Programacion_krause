public class Cantante implements Contratable {

    private String nombre;
    private String generoMusical;
    private int cachet;
    private int cantCanciones;
    private String representante;
    private String escenario;
    private double honorarioLiquidado;

    public Cantante(String nombre, String generoMusical, int cachet, int cantidadCanciones, String representante) {
        this.nombre = nombre;
        this.generoMusical = generoMusical;
        this.cachet = cachet;
        this.cantCanciones = cantidadCanciones;
        this.representante = representante;
    }

    public String getNombre() {
        return nombre;
    }

        public String getGeneroMusical() {
        return generoMusical;
    }

        public int getCachet() {
        return cachet;
    }

            public int getCantCanciones() {
        return cantCanciones;
    }

        public String getRepresentante() {
        return representante;
    }

        public String getEscenario() {
        return escenario;
    }

        public double getHonorarioLiquidado() {
        return honorarioLiquidado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
    }

    public void setCachet(int cachet) {
        this.cachet = cachet;
    }

    public void setCantCanciones(int cantCanciones) {
        this.cantCanciones = cantCanciones;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public void setEscenario(String escenario) {
        this.escenario = escenario;
    }

    public void setHonorarioLiquidado(double honorarioLiquidado) {
        this.honorarioLiquidado = honorarioLiquidado;
    }

    public void liquidarHonorarios(double impuestos) throws IllegalArgumentException {
        if (impuestos < 0 || impuestos > 100) {
            throw new IllegalArgumentException("El porcentaje de impuestos ingresado no es valido para " + nombre);
        }
        double descuento = cachet * (impuestos / 100);
        honorarioLiquidado = cachet - descuento;
    }

    public void asignarEscenario(String nombreEscenario) throws NullPointerException {
        if (nombreEscenario == null) {
            throw new NullPointerException("El nombre del escenario no puede ser nulo");
        }
        escenario = nombreEscenario;
    }

    public void mostrarCantante() {
        System.out.println("Cantante:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Genero musical: " + generoMusical);
        System.out.println("Cachet: " + cachet);
        System.out.println("Cantidad de canciones: " + cantCanciones);
        System.out.println("Escenario asignado: " + escenario);
        System.out.println("Honorario liquidado: " + honorarioLiquidado);
        System.out.println("---------------------");
    }
}