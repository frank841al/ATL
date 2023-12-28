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
         int numeroMayor = numeros[0];
        int numeroMenor = numeros[0];

        for (int i = 1; i < 5; i++) {
            if (numeros[i] > numeroMayor) {
                numeroMayor = numeros[i];
            }

            if (numeros[i] < numeroMenor) {
                numeroMenor = numeros[i];
            }
        }

        
        System.out.println("\nNumero mayor: " + numeroMayor);
        System.out.println("Numero menor: " + numeroMenor);
        
        int promedio=0;
        int resul=0;
        
         for (int i = 0; i < 5; i++) {
            promedio =numeros[i]+promedio;
            resul=promedio/5;
            }
            
          System.out.println("El promedio es : " + resul); 
    }
}