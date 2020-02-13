
package String;

import java.util.Scanner;


public class Ejercicio3 {

   
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
        System.out.println("Introduce nombre inicial");
        String in = s.nextLine();
        System.out.println("Introduce nombre final");
        String f = s.nextLine();

        boolean resultado=false;
        for (i = 0; i < n; i++) {
              if(f.equals("")){
               resultado=true;
            }
            else if(resultado = array[i].endsWith(f)&&(array[i].startsWith(in))) {
                res = array[i];
                System.out.println(res);
                resultado=false;
                
            }

        }
        if(resultado)System.out.println("no hay filtro");
    }
    
}
