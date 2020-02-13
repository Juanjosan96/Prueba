
package String2;
import java.util.Scanner;
public class Ejercicio1 {

  
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
        System.out.println("Introduce un texto");
        String texto=s.nextLine();
        int longtexto=texto.length();
        String ext;
        for(int i=0;i<longtexto;i++){
        ext=texto.substring(i,i+1);
            System.out.println(ext);
        }
    }
    
}
