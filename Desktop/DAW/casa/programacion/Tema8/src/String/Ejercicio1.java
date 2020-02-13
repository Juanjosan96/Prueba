package String;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
       
        Scanner s = new Scanner(System.in);

        System.out.println("Introduce palabra nº1");
        String texto = s.nextLine();
        int longtexto = texto.length();
        System.out.println("Introduce palabra nº2");
        String texto2 = s.nextLine();
        int longtexto2 = texto2.length();

        if (longtexto > longtexto2) {
            System.out.println(texto + " su longitud es: " + longtexto);
        } 
        else if(longtexto == longtexto2)
        {System.out.println("ambos tienen misma longitud, su longitud es: " + longtexto);
                }
        
        else {
            System.out.println(texto2 + " su longitud es: " + longtexto2);
        }

       
    }

}
