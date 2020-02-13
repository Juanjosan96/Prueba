
package simulacro;
import java.util.Scanner;
public class Ejercicio1 {


    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
        System.out.println("Introduce una frase");
      String texto=s.nextLine();
      boolean norte=texto.startsWith("Javalin, javalon");
       boolean sur=texto.endsWith("javalen, len, len");
       String extraer;
       if(sur&&norte){
           extraer=texto.substring(0,texto.length()-17);
         extraer=extraer.substring(17,texto.length()-17);  
               System.out.println("Usted habla Javalandia");
         System.out.println(extraer);
           
        }
       else if(norte){
             extraer=texto.substring(17,texto.length());
             extraer=extraer.trim();
              System.out.println("Usted habla Javalandia");
           System.out.println(extraer);
           
        }
        else if(sur){
            extraer=texto.substring(0,texto.length()-17);
               System.out.println("Usted habla Javalandia");
         System.out.println(extraer);
        }
        
        else{
         System.out.println("No es idioma de Javalandia");
        }
        
        
    }
    
}
//Javalin, javalon esto es frase javalen, len, len
