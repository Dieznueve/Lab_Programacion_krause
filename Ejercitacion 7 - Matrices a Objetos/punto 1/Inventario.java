import java.util.ArrayList;


public class Inventario {
    private ArrayList<Producto> productos;


    public Inventario(){
        this.productos = new ArrayList<>();
    }


    public void listarlos() {
        for (Producto p : productos){
            p.mostrarProducto();
        }
    }
   
    public void cantidadP() {
        productos.size();
    }


    public void agregarP(Producto p) {
        productos.add(p);
    }
}
