import java.util.*;
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        
         Scanner cs =new Scanner(System.in);
        
        System.out.println("Ingresa 3 numeros");
       Integer num=cs.nextInt();
       Integer num1=cs.nextInt();
       Integer num2=cs.nextInt();
      
    if(num>num1 && num>num2){
  System.out.println("el numero mayor es :"+num);
        
    }
  if(num1>num && num1>num2){
  System.out.println("el numero mayor es :"+num1);
      
  }
  if(num2>num && num2>num1){
  System.out.println("el numero mayor es :"+num2);
      
  }
   if(num<num1 && num<num2){
  System.out.println("\nel numero menor es :"+num);
        
    }
  if(num1<num && num1<num2){
  System.out.println("\nel numero menor es :"+num1);
      
  }
  if(num2<num && num2<num1){
  System.out.println("\nel numero menor es :"+num2);
      
  }
    }
}