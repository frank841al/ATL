import java.util.*;
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        String nombre="";
        Scanner cs =new Scanner(System.in);
        System.out.println("ingresa el nombre");
        nombre =cs.nextLine();
        String url="https://twitter.com/search?q="+nombre;
        System.out.println("El en twiter es : "+url);
       
  
    }
}
