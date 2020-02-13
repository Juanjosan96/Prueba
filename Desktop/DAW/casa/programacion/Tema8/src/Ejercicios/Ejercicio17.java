package Ejercicios;

import Funciones.Funciones1a14;
import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {
        boolean salir = true;
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce el nº de digitos");

        int n = s.nextInt();
        int resultado = 0;
        int b = 0;
        int contador = 0;
        int i = 0;
        int[] arrayauxiliar = new int[n];
        int[] array = new int[n];
        // crear bucle para N numeros de binario, usando asi array y despues sacarlo en el otro for 
        //sacare numero a numero, en caso de ser distinto de 0 o 1, volvera a empezar, luego segundo bucle lo ira calculando con el tamaño maximo acordado
        //podria probar con, cantidad de digitos que tendra el numero binario, e introducirlo
        System.out.println("Introduce el nº binario a digitos");
        do {
            //empezar maximo por aqui
            for (i=n+(-1); i >=0; i--) {
                b = s.nextInt();
                if (b == 1) {
                    contador++;
                    array[i] = b;
                } else if (b == 0) {
                    contador++;
                } else {
                    System.out.println("Introduce digito binario correcto");
                    i = 0;
                }

            }
           
            for (int j = contador; j >0; j--) {

                array[j + (-1)] = Funciones1a14.potencia(2, j + (-1));

                resultado = array[j + (-1)] + resultado;
               //si es 0 no tenerlo en cuenta
            }
             System.out.println(resultado);
            /*
            
            for(;contador<=0;){
                for(int i=0;i>=0;i++){
                
                }
            }
             */
            salir = false;
        } while (salir == true);

    }

}