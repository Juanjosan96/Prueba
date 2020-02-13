package String;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Introduce cantidad de nombres");
        int n = s.nextInt();
        String[] array = new String[n];
        int i = 0;
        String res;
        System.out.println("Introduce nombres");
        s.nextLine();
        for (; i < n; i++) {
            array[i] = s.nextLine();
        }
        System.out.println("Introduce nombre a buscar");
        String b = s.nextLine();

        boolean resultado;
        for (i = 0; i < n; i++) {
            if (resultado = array[i].startsWith(b)) {
                res = array[i];
                System.out.println(res);
            }

        }

    }

}
