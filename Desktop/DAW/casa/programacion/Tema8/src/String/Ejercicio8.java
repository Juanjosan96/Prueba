package String;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String uno = s.nextLine();
        String dos = s.nextLine();

        String esp = uno.trim();
        String es = dos.trim();
        boolean comp = esp.equalsIgnoreCase(es);

        if (comp) {
            System.out.println("Son iguales");
        } else {
            System.out.println("Son distintos");
        }
    }

}
