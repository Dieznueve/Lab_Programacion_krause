public class Producto {
    private String nombre;
    private String codigo;
    private double precio;


    public Producto (String nombre, String codigo, double precio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
    }
    public void mostrarProducto(){
        System.out.println("Nombre: " + this.nombre +
         "Codigo: " + this.codigo +
         "Precio: "+ this.precio);
    }


}
