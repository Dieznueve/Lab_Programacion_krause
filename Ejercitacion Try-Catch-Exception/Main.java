public class Main {
    public static void main(String[] args) {

        Cancion tema1 = new Cancion("Perfecta", "Airbag", 230, false);
        Cancion tema2 = new Cancion("Dákiti", "Bad Bunny", 205, false);
        Cancion tema3 = new Cancion("Propuesta Indecente", "Romeo Santos", 215, false);
        Cancion tema4 = new Cancion("La Bachata", "Manuel Turizo", 180, false);
        Cancion temaPremium = new Cancion("Live Forever", "Oasis", 300, true);

        Usuario usuarioComun = new Usuario("Lucas", false);
        System.out.println("--- INICIANDO SIMULADOR DE STREAMING ---\n");

        try {
            usuarioComun.reproducirCancion(tema1);
            usuarioComun.reproducirCancion(tema2);
            usuarioComun.reproducirCancion(tema3);

            System.out.println("\n> Intentando escuchar una cuarta canción común...");
            usuarioComun.reproducirCancion(tema4);
        } catch (ReproduccionException e) {
            System.out.println("ERROR LOG: " + e.getMessage());
            System.out.println("PANTALLA: ¡Pasate a Premium para seguir disfrutando de tu música sin límites!");
        }

        System.out.println("\n------------------------------------------------");

        System.out.println("\n> Intentando escuchar una canción Premium...");
        try {
            usuarioComun.reproducirCancion(temaPremium);
        } catch (ReproduccionException e) {
            System.out.println("ERROR LOG: " + e.getMessage());
            System.out.println("PANTALLA: Esta canción requiere suscripción Premium. ¡Activá tu mes de prueba gratis!");
        }

        System.out.println("\n--- FIN DE LA SIMULACIÓN (El programa finalizó a salvo) ---");
    }
}