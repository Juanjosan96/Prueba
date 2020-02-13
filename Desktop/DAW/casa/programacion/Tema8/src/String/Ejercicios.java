package String;

import java.util.Scanner;

public class Ejercicios {

    public static void main(String[] args) {
        /*1-leer dos cadenas de texto e imprimir la mayor de ellas y su longitud
        2-crear array con muchos nombres,pedir texto como filtro y mostrar todos los nombres que empiecen por ese texto
        3-completar el ejercicio anterior añafiendo otro filtro con la terminacion del nombre.si se introduce el texto vacio ignorar el filtro
        
         */
        Scanner s = new Scanner(System.in);

        System.out.println("Introduce palabra nº1");
        String texto = s.nextLine();
        int longtexto = texto.length();
        System.out.println("Introduce palabra nº2");
        String texto2 = s.nextLine();
        int longtexto2 = texto2.length();

        if (longtexto > longtexto2) {
            System.out.println(texto + " su longitud es: " + longtexto);
        } else {
            System.out.println(texto2 + " su longitud es: " + longtexto2);
        }

        int[] array = new int[10];
          System.out.println("Introduce 10 nombres");
        for (int i = 0; i < 10; i++) {
            array[i] = s.nextInt();
        }
    }

}
