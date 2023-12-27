Java code online
import java.util.*;
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        int numUsu =0;
        Scanner cs =new Scanner(System.in);
        int numAlea=(int) Math.floor(Math.random()*100);
        System.out.println("cual es el numero aleatorio");
        numUsu=cs.nextInt();
        if(numUsu==numAlea){
            System.out.println("El numero es correcto");
        }else{
            System.out.println("El numero es incorrecto");
        }
  
    }
}