
package String2;
import java.util.Scanner;
public class Ejercicio5 {
//seguir
 
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
        System.out.println("Introduce una frase");
        String texto=s.nextLine();
       String letra="";
      String sacar=texto.substring(0);
        for(int i=1;i<=texto.length();i++){
        // letra=texto.substring(i, i+1);
        char letrant=sacar.charAt(i);
        char letrdes=sacar.charAt(i+1);
         char ultimaletra=sacar.charAt(texto.length()-1);
           char primeraletra=sacar.charAt(0);
                 String cambio=sacar.replace(letrant, letrdes);
                 String cambioinicio=cambio.replace(ultimaletra,primeraletra);
        System.out.println(cambioinicio);
        }
        
        
    }
    
}
