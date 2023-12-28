import java.util.*;
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        String pais="";
        Scanner cs =new Scanner(System.in);
        System.out.println("ingresa el pais");
        pais =cs.nextLine();
        String url="https://www.google.com/maps/search/"+pais;
        System.out.println("El enlace del google maps es : "+url);
       
  
    }
}
