import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner cs=new Scanner(System.in);
        System.out.println("ingrese la edad de su perro");
        Integer cal=7;
        Integer edad = cs.nextInt();
        
    
        System.out.println("la edad real del perro es : "+edad*cal);
    }
}