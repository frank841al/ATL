import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner cs=new Scanner(System.in);
        System.out.println("Total de la cuenta del restaurant");
        Double Tcuenta= cs.nextDouble();
        System.out.println("Ingrese el porcentaje que va dejar al mozo ");
        Double porcentaje=cs.nextDouble();
        
    Double propina=Tcuenta * (porcentaje/100);
        System.out.println("El monto de la propina es   : "+propina);
    }
}