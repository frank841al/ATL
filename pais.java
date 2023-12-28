import java.util.*;
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        String pais="";
        Scanner cs =new Scanner(System.in);
        System.out.println("ingresa el pais");
        pais =cs.nextLine();
<<<<<<< HEAD
        System.out.println("https://www.google.com/maps/search/"+pais);
       
  
    }
}
=======
        String url="https://www.google.com/maps/search/"+pais;
        System.out.println("El enlace del google maps es : "+url);
       
  
    }
}
>>>>>>> dcf19a4ffd7c7a23997f1fe6ffa7b30514a5cce2
