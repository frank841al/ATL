import java.util.*;
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        String telefono="";
        Scanner cs =new Scanner(System.in);
        System.out.println("ingresa el numero de telefono");
        telefono =cs.nextLine();
        String url = "https://api.whatsapp.com/send?phone="+telefono;
        System.out.println("EL enlace para llamar al telefono es : "+url);
       
  
    }
}
