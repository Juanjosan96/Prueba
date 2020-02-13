package String2;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce una palabra o frase");
        String texto = s.nextLine();
        int con=texto.length();

        for (int i = texto.length(); i >0; i--) {
                             con--;
                 String cambio = texto.substring(con,i);
                 System.out.print(cambio);
        }
    }

}
