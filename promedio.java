import java.util.*;
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        
         Scanner cs =new Scanner(System.in);
        
        System.out.println("Ingresa 3 numeros");
       Double num=cs.nextDouble();
       Double num1=cs.nextDouble();
       Double num2=cs.nextDouble();
       Double promedio=(num+num1+num2)/3;
  System.out.println("el promedio es :"+promedio);
    }
}