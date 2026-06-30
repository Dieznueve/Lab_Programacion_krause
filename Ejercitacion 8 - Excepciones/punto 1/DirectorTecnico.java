public class DirectorTecnico {

    private String nombre;
    private String nacionalidad;

    public DirectorTecnico(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getNacionalidad() {
        return this.nacionalidad;
    }

    public void mostrarDirectorTecnico() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Nacionalidad: " + this.nacionalidad);
    }
}