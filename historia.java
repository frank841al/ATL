import java.util.*;
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        
         Scanner cs =new Scanner(System.in);
        
        System.out.println("Es una noche estrellada, te encuentras en un bosque misterioso: (escoge una opcion)");
        System.out.println("1) Exploras la oscuridad en busca de la fuente de un susurro escalofriante.\n2)Sigues el sendero iluminado hacia una pequena cabana acogedora");    
        Integer num=cs.nextInt();
        if(num==1){
          System.out.println("Exploras la oscuridad en busca de la fuente de un susurro escalofriante ");  
        }else{
            System.out.println("Decides seguir el sendero iluminado hacia la pequena cabana acogedora. Al llegar a la cabana, te das cuenta de que hay dos puertas: "); 
        }
       System.out.println("1) Entras por la puerta de la izquierda \n2) Optas por la puerta de la derecha"); 
       Integer nume=cs.nextInt();
       if(nume==1){
          System.out.println("Al abrir la puerta de la izquierda, te encuentras con una habitacion llena de tesoros brillantes y magicos. Te maravillas con las joyas y los objetos preciosos que llenan la sala. Te das cuenta de que has encontrado el legendario tesoro perdido del bosque. Con tu corazon lleno de emocion y riquezas, decides regresar a casa para compartir tu increible aventura con el mundo. Felicidades, has tenido un final exitoso en tu busqueda! ");  
        }
  
    }
}