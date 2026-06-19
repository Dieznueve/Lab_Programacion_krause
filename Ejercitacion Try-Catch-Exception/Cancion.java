public class Cancion {
    private String titulo;
    private String artista;
    private double duracionEnSegundos;
    private boolean esPremium;

    public Cancion(String titulo, String artista, double duracionEnSegundos, boolean esPremium) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracionEnSegundos = duracionEnSegundos;
        this.esPremium = esPremium;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean esPremium() {
        return esPremium;
    }
}
