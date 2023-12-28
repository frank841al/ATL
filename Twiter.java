import java.util.*;
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        String nombre="";
        Scanner cs =new Scanner(System.in);
<<<<<<< HEAD
        System.out.println("ingresa el pais");
        nombre =cs.nextLine();
        System.out.println("https://twitter.com/search?q="+nombre);
       
  
    }
}
=======
        System.out.println("ingresa el nombre");
        nombre =cs.nextLine();
        String url="https://twitter.com/search?q="+nombre;
        System.out.println("El en twiter es : "+url);
       
  
    }
}
>>>>>>> dcf19a4ffd7c7a23997f1fe6ffa7b30514a5cce2
