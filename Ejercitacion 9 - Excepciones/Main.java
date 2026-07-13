public class Main {

    public static void main(String[] args) {

        String[][] datosCantantes = {
            {"Taylor Swift", "Pop", "1500000", "18", "Tree Paine"},
            {"Bad Bunny", "Reggaeton", "RECHAZADO", "12", "Noah Assad"},
            {"Coldplay", "Rock", "1200000", "3", "Phil Harvey"},
            {"Duki", "Trap", "500000", "14", null}
        };

        Festival festival = new Festival();

        for (int i = 0; i < datosCantantes.length; i++) {

            String nombre = datosCantantes[i][0];
            String generoMusical = datosCantantes[i][1];
            int cachet = Integer.parseInt(datosCantantes[i][2]);
            int cantidadCanciones = Integer.parseInt(datosCantantes[i][3]);
            String representante = datosCantantes[i][4];

                try {


                Cantante cantante = new Cantante(nombre, generoMusical, cachet, cantidadCanciones, representante);
                festival.agregarCantante(cantante);

                festival.realizarSoundcheck(cantante);

                cantante.asignarEscenario("Escenario Principal");

                cantante.liquidarHonorarios(15);

                if (representante == null) {
                    throw new NullPointerException("El cantante " + nombre + " no posee un manager registrado");
                }

                cantante.mostrarCantante();

            } catch (NumberFormatException e) {
                System.out.println("Error numerico en los datos de " + nombre + ": el valor ingresado no es valido");
                System.out.println("---------------------");

            } catch (EspectaculoCortoException e) {
                System.out.println(e.getMessage());
                System.out.println("---------------------");

            } catch (NullPointerException e) {
                System.out.println(e.getMessage());
                System.out.println("---------------------");

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                System.out.println("---------------------");

            } finally {
                System.out.println("Finalizo el procesamiento del cantante " + nombre);
                System.out.println("---------------------");
            }
        }
    }
}