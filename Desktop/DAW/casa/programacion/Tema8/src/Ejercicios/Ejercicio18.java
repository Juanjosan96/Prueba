
package Ejercicios;
import java.util.Scanner;
public class Ejercicio18 {

   
    public static void main(String[] args) {
        System.out.println("Introduce nº");
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       int resultado=0;
       int aux=0;
       resultado=n;
      int contador=0;
      
       for(int i=0;i<=aux;i++){
           aux=n/2;
       n=n%2;
       resultado=n;
           System.out.print(resultado);
       n=aux;
       }
       System.out.print(aux);
    }
    
}
