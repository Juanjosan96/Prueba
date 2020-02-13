
package String2;

import java.util.Scanner;
public class Ejercicio2 {

   
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
        System.out.println("Introduce vocal a cambiar");
        String vocal=s.nextLine();
        String texto="“Tengo una hormiguita en la patita, que me esta haciendo\n" +
"cosquillitas y no me puedo aguantar";
        

        String cambio=texto.replace("a",vocal);
        cambio=cambio.replace("e", vocal);
        cambio=cambio.replace("i", vocal);
        cambio=cambio.replace("o", vocal);
        cambio=cambio.replace("u", vocal);
        System.out.println(cambio);
    }
    
}
