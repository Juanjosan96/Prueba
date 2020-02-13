package String2;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int igual = 0;
        System.out.println("Introduce una frase");
        String texto = s.nextLine();
        boolean salir = true;

        System.out.println("Introduce palabra a buscar");
        String palabra = s.nextLine();
        while (salir) {
            if (palabra.equals(" ")) {
                System.out.println("Introduce una palabra correcta");
                palabra = s.nextLine();
            }
            else{
            salir=false;
            }
        }
        igual = texto.indexOf(palabra, 0);

        if (igual >= 0) {
            System.out.println("esta frase tiene esa palabra");
        } else {

            System.out.println("esta frase no tiene esa palabra");
        }

    }

}
