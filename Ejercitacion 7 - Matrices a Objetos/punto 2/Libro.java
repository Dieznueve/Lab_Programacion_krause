public class Libro {
    private String titulo;
    private String isbn;
    private String cantidadpaginas;




    public Libro (String titulo, String isbn, String cantidadpaginas) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.cantidadpaginas = cantidadpaginas;
    }


    public void mostrarLibros(){
        System.out.println("Nombre: " + this.titulo +
         "Codigo: " + this.isbn +
         "Precio: "+ this.cantidadpaginas);
    }

    public String getCantidadPaginas() {
    return this.cantidadpaginas;
    }

}
