package simulacro;

import java.util.Scanner;

public class Ejericcio3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String texto = "Carlos Javier Alonso Vergara,"
                + " Rocio Alors Barrera, Ruben Campanario Dieguez, "
                + "Victor Del Ojo Galvan, Alberto Jose Estevez Garcia, "
                + "Antonio Javier Fajardo Garrido, Rafael Enrique Gabriel Navarro, "
                + "Jaime Hidalgo Sanchez-Noriega, Cristobal Jaene Marrero, Jesus Lobato Romero, "
                + "Alvaro Lopez Alvarez, Luis Martinez Pardillo, Manuel Moreno Garcia,"
                + " Manuel Muñiz Doblado, Luis Fernando Rollan Parrado, Cristina Segura Matute,"
                + " Jorge Juan Suarez Fernandez, Juan Manuel Verdugo Pedrero";
        //18nombres
        String sal = "";
        int[] array = new int[17];
        String[] arraytexto = new String[19];
        System.out.println("Introduce numero de alumnos");
        int alumnos = s.nextInt();
        int contador = alumnos;

        int comas = 0;
        int comasdos = 0;
        int azar;
        int lente = texto.length();
        boolean nulo = true;
        comasdos = texto.indexOf(",", comasdos + 1);
        String inicio = texto.substring(0, comasdos);

        for (int i = 1; i <= alumnos - 2; i++) {
            if (comas < texto.length() - 30 || comasdos < texto.length() - 30) {
                comasdos = texto.indexOf(",", comasdos + 1);
                comas = texto.indexOf(",", comas + 1);
                comas = comas + 2;

                String sacar = texto.substring(comas, comasdos);
                arraytexto[i] = sacar;

                System.out.println(sacar);
                array[i] = comas;

            }

        }
        String finali = texto.substring(comasdos, texto.length());
        arraytexto[0] = inicio;
        arraytexto[alumnos] = finali;

        azar = (int) (Math.random() * alumnos);

        System.out.println("Ha salido " + arraytexto[azar]);
        String rep = texto.replace(arraytexto[azar], "");
        System.out.println(rep);
        boolean salir = true;
        while (salir) {

            if (sal.equalsIgnoreCase("salir")) {
                salir = false;

            } else {

                azar = (int) (Math.random() * (alumnos + 1));
                if (rep != null) {
                    nulo = true;

                }
                if (arraytexto[azar] != null) {
                    rep = rep.replace(arraytexto[azar], "");
                    System.out.println(rep);
                    System.out.println("Ha salido " + arraytexto[azar]);
                    arraytexto[azar] = null;
                    contador--;

                    if (contador <= 0) {
                        salir = false;
                    } else {
                        System.out.println("¿Desea continuar?");
                        sal = s.next();
                        
                    }
                }

            }

        }
    }

}
