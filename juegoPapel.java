import java.util.*;
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        
  Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Bienvenido al juego Piedra, Papel o Tijeras!");
        System.out.print("Ingresa tu eleccion (piedra, papel o tijeras): ");
        String eleccionUsuario = scanner.nextLine().toLowerCase();

        if (eleccionUsuario.equals("piedra") || eleccionUsuario.equals("papel") || eleccionUsuario.equals("tijeras")) {
            
            String[] opciones = {"piedra", "papel", "tijeras"};
            int indiceComputadora = random.nextInt(opciones.length);
            String eleccionComputadora = opciones[indiceComputadora];

            System.out.println("La computadora elige: " + eleccionComputadora);

            // Determinar el ganador
            if (eleccionUsuario.equals(eleccionComputadora)) {
                System.out.println("Empate");
            } else if ((eleccionUsuario.equals("piedra") && eleccionComputadora.equals("tijeras"))
                    || (eleccionUsuario.equals("papel") && eleccionComputadora.equals("piedra"))
                    || (eleccionUsuario.equals("tijeras") && eleccionComputadora.equals("papel"))) {
                System.out.println("Ganaste");
            } else {
                System.out.println("La computadora gana");
            }
        } else {
            System.out.println("Eleccion no valida. Por favor, ingresa piedra, papel o tijeras.");
        }
      
    }
}