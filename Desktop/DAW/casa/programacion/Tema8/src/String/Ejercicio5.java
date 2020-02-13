package String;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String p;
        String c = "";
        String texto = "Lorem nam ipsum dolor sit amet consectetur adipiscing elit "
                + "non suscipit aliquam sem maecenas potenti nam cum,"
                + " fringilla purus quis suspendisse rutrum risus ac "
                + "tristique natoque montes proin tempus integer."
                + " At eu etiam volutpat pharetra nam ornare torquent aliquam, "
                + "tempor elementum ultrices commodo phasellus nulla mus.\n"
                + "";

        boolean salir = true;

        while (salir) {

            for (int i = 0; i < 1; i++) {
                System.out.println("¿Quieres salir? para salir pulse s, de lo contrario pulse otra tecla");
                p = s.nextLine();
                if (p.equals("s")) {
                    salir = false;
                } else {
                    System.out.println("Escribe la palabra a extraer");
                    p = s.nextLine();
                    String rem = texto.replace(p, c);
                    System.out.println(rem);
                }

            }

        }
    }
}
