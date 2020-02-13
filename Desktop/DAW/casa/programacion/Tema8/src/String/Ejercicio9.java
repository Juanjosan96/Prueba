package String;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce un texto");
        String texto = s.nextLine();
        System.out.println("Introduce un numero entre 1 y 25");
        int valor = s.nextInt();

        int longitud = texto.length();

        char valorascii;
     
        int numero = 0;
        char letra;
//pasar texto  a ascii(numero),se le suma el valor pedido, se convierte el numero total en ascii
        for (int i = 0; i < longitud; i++) {

            valorascii = (char) (int) (valor + 80);
               int valornumero = (int) (char) valorascii;
            numero = valor + numero;
            letra = texto.charAt(i);
            letra = valorascii;
            System.out.print((char) letra);

        }
    }

}
