public class Paciente {
    private String nombre;
    private String dni;
    private int edad;
    private double peso;
    private boolean estaHospitalizado;

    public Paciente(String nombre, String dni, int edad, double peso, boolean estaHospitalizado) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.peso = peso;
        this.estaHospitalizado = estaHospitalizado;
    }

    public void mostrarPaciente(){
        System.out.println("Nombre: " + this.nombre +
        "dni: " + this.dni +
        "Edad: "+ this.edad +
        "Peso: "+ this.peso +
        "Esta hospitalizado: "+ this.estaHospitalizado);
    }

    public int getEdad() {
        return this.edad;
    }

    public boolean getEstaHospitalizado() {
        return this.estaHospitalizado;
    }
}
