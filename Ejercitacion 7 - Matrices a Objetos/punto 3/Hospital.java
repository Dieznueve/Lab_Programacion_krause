import java.util.ArrayList;

public class Hospital {
    private ArrayList<Paciente> pacientes;

    public Hospital() {
        this.pacientes = new ArrayList<>();
    }

    public void agregarPaciente(Paciente p) {
        pacientes.add(p);
    }

    public void listarPacientes() {
        for (Paciente p : pacientes) {
            p.mostrarPaciente();
        }
    }

    public void cantidadPacientes() {
        System.out.println("Cantidad de pacientes: " + pacientes.size());
    }
}