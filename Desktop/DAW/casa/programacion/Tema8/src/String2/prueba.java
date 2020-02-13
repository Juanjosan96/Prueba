package String2;

import java.util.Scanner;

public class prueba {
//seguir
//usar solo un for,cambiar todas las posiciones, tambien probando un segundo auxiliar para que no se borre, en la ultima parte crear otro del pincipio y del final
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce una frase");
        String texto = s.nextLine();
        String cambio = "";
        String cambioinicio = "";
        String sacar = texto.substring(0);
        int letraf = texto.length();
        letraf--;
        for (int i = 1; i <= texto.length(); i++) {
            // letra=texto.substring(i, i+1);

            System.out.println(cambioinicio);
            for (int j = 0; j <= texto.length(); j++) {
                if (letraf <= j) {
                    char ultimaletra = sacar.charAt(texto.length() - 1);
                    char primeraletra = sacar.charAt(0);
                    String cambiofinal = sacar.replace(ultimaletra, primeraletra);
                    cambio=cambiofinal;
                } else {
                    char letrant = sacar.charAt(j);
                    char letrdes = sacar.charAt(j + 1);

                    cambio = texto.replace(letrant, 'c');

                }
                System.out.println(cambio);

            }
        }

    }

}
