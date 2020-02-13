package String2;

import java.util.Scanner;

public class Ejercicio3 {
//index of nbo vale
    //seguir
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce una frase");
        String texto = s.nextLine();
        String fin = ".";

        int esp = texto.indexOf("");
        boolean salir = true;
        while (salir) {
            esp = texto.indexOf(" ");
            if (texto.endsWith(fin)) {
                System.out.println("La frase ha acabado");
               
                if (esp == -1) {
                    System.out.println("Esta frase tiene " + 1 + " palabra");
                    salir=false;
                }

                
                if(esp >0)
                 
                {
                    System.out.println("Esta frase tiene " + esp + " palabras");
                   esp++;
                    salir=false;
                }
            } else {
                System.out.println("Esta frase aun no ha acabado, introduce una frase que termine");
               
                texto = s.nextLine();
            }
        }
    }

}
