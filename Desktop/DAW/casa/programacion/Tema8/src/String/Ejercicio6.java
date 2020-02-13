package String;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String p;
        String t;
        String texto = "Lorem nam ipsum dolor sit amet consectetur adipiscing elit "
                + "non suscipit aliquam sem maecenas potenti nam cum,"
                + " fringilla purus quis suspendisse rutrum risus ac "
                + "tristique natoque montes proin tempus integer."
                + " At eu etiam volutpat pharetra nam ornare torquent aliquam, "
                + "tempor elementum ultrices commodo phasellus nulla mus.\n"
                + "";

        for (int i = 0; i < 1; i++) {

           

            System.out.println("Escribe la palabra a extraer");
            p = s.nextLine();
              System.out.println("Escribe la palabra a cambiar");
            t = s.nextLine();
            String rem = texto.replace(p,t);
            System.out.println(rem);

        }
    }

}
