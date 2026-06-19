public class Usuario {
    private String nombre;
    private boolean esPremium;
    private int limiteCanciones;

    public Usuario(String nombre, boolean esPremium) {
        this.nombre = nombre;
        this.esPremium = esPremium;
        this.limiteCanciones = esPremium ? 9999 : 3;
    }

    public void reproducirCancion(Cancion c) throws ReproduccionException {
        
        if (!this.esPremium && c.esPremium()) {
            throw new ReproduccionException("Contenido exclusivo. El usuario " + this.nombre + "no tiene cuenta Premium" );
        }

        if (!this.esPremium && this.limiteCanciones <= 0){
            throw new ReproduccionException("Limite alcanzado. Al usuario " + this.nombre + "no le quedan creditos de reproduccion");
        }

        if (!this.esPremium) {
            this.limiteCanciones--;
        }

        System.out.println("Reproduciendo ahora: " + c.getTitulo() + " - [Quedan: " + (this.esPremium ? "Ilimitado" : this.limiteCanciones) + "]");

    }
}