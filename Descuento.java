import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner cs=new Scanner(System.in);
        System.out.println("ingrese el precio del Producto");
        Double producto= cs.nextDouble();
        System.out.println("Ingrese el descuento ");
        Double porcentaje=cs.nextDouble();
        
    Double precio=producto - (producto*porcentaje/100);
        System.out.println("El precio al final a pagar con descuento es  : "+precio);
    }
}