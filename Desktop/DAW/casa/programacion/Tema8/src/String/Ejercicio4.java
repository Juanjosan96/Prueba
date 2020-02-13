package String;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Escribe la palabra a buscar");
        String p = s.nextLine();
        
        String texto = "Lorem ipsum dolor sit amet consectetur adipiscing elit "
                + "non suscipit aliquam sem maecenas potenti nam cum,"
                + " fringilla purus quis suspendisse rutrum risus ac nam"
                + "tristique natoque montes proin tempus integer."
                + " At eu etiam volutpat pharetra nam ornare torquent aliquam, "
                + "tempor elementum ultrices commodo phasellus nulla mus.\n"
                + "";
        int pos = 0;
       
        for (int i = 0; i < texto.length(); i++) {

            pos = texto.indexOf(p, pos + 1);
            if (pos == -1) {

                i = texto.length();
            } else {

                System.out.println("la posición se encuentra en la posición nº"+pos);
            }

        }

    }

}
