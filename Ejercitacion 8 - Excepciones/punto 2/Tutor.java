public class Tutor {

    private String nombre;
    private String telefono;

    public Tutor(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void mostrarTutor() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Telefono: " + this.telefono);
    }
}