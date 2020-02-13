
package String2;
import java.util.Scanner;
public class Ejercicio4 {

    
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
        System.out.println("Introduce frase");
        String texto=s.nextLine();
        int esp=texto.indexOf(" ");
        String pala=texto.substring(0,esp);
        boolean acaba=texto.endsWith(pala);
        if(acaba){
        System.out.println("La palabra "+ pala+" es la misma al inicar y acabar");
        }
        else{
        System.out.println("La palabra es distinta");
        }
        
        
    }
    
}
