import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        
        int[] numeros = new int[5];

        System.out.println("Ingrese 5 numeros:");

        
        for (int i = 0; i < 5; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        
        System.out.println("\nLos numeros ingresados son:");
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}