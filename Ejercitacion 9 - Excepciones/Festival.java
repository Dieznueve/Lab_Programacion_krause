import java.util.ArrayList;

public class Festival {

    private ArrayList<Cantante> cantantes;

    public Festival() {
        cantantes = new ArrayList<Cantante>();
    }

    public ArrayList<Cantante> getCantantes() {
        return cantantes;
    }

    public void setCantantes(ArrayList<Cantante> cantantes) {
        this.cantantes = cantantes;
    }

    public void agregarCantante(Cantante cantante) {
        cantantes.add(cantante);
    }

    public void realizarSoundcheck(Cantante cantante) throws EspectaculoCortoException {
        if (cantante.getCantCanciones() < 5) {
            throw new EspectaculoCortoException("El cantante " + cantante.getNombre() + " no puede realizar el show, tiene menos de 5 canciones programadas");
        }
        System.out.println("El cantante " + cantante.getNombre() + " supero el soundcheck correctamente");
    }
}