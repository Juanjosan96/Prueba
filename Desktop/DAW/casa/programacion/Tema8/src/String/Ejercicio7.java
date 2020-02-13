package String;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String palabra = s.nextLine();

        int longtexto = palabra.length();
        String mayus = palabra.toUpperCase();
       String min = palabra.toLowerCase();
        String quitarmin = min.substring(1, longtexto);
        String quitarmayu = mayus.substring(0, 1);
        System.out.println(quitarmayu + quitarmin);
    }

}
