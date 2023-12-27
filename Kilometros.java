import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner cs=new Scanner(System.in);
        System.out.println("ingrese distancia en millas");
        Double milla= cs.nextDouble();
        
        
    
        System.out.println("los kilometros son  : "+milla*1.60939);
    }
}