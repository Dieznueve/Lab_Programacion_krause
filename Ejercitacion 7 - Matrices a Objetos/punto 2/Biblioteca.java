import java.util.ArrayList;




public class Biblioteca {

    private ArrayList<Libro> libros;

    public Biblioteca(){
        this.libros = new ArrayList <>();
    }

    public void listarlos() {
        for (Libro l : libros){
            l.mostrarLibros();
        }
    }


    public void cantidadL() {
        libros.size();
    }


    public void agregarP(Libro l) {
        libros.add(l);
    }
}
