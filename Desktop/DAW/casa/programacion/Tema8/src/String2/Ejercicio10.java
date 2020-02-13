package String2;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce nombre y apellidos");
        String texto = s.nextLine();
        int num = 0;
        char caracter = texto.charAt(0);
            System.out.print("Las iniciales son: "+caracter);
        for (int i = 0; i < texto.length(); i++) {
            num = texto.indexOf(" ", num + 1);
            caracter = texto.charAt(num + 1);
            if (num < 0) {
                i = 90;
            }
            else{
            System.out.print(" "+caracter);
            }
        }

    }

}
