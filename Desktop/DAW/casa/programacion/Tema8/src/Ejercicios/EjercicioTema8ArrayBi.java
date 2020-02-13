package Ejercicios;

import Funciones.arraysbidimensionales;
import java.util.Scanner;

public class EjercicioTema8ArrayBi {

    public static void main(String[] args) {

        System.out.println("Introduce tamaño n");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println("Introduce tamaño m");
        int m = s.nextInt();
        System.out.println("Introduce minimo");
        int min = s.nextInt();
        System.out.println("Introduce maximo");
        int max = s.nextInt();

        //Ejercicio1
        //  int [][] arrayres=arraysbidimensionales.generaArrayBiInt(n,m,min,max);
        //Ejercicio2
        /*
        System.out.println("Introduce fila para buscar");
        int numero = s.nextInt();
        int res = 0;
        int[][] arraybi = arraysbidimensionales.generaArrayBiInt(n, m, min, max);
        int[] array = arraysbidimensionales.filaDeArrayBiInt(n, m, min, max, arraybi, numero);
          System.out.print("La fila "+ numero+" tiene de valores: ");
        for (int i = 0; i < m; i++) {
            res = array[i];
               
            System.out.print(res+ " ");
        }
        */
        //Ejercicio3
        /*
        System.out.println("Introduce columna para buscar");
        int numero = s.nextInt();
        int res = 0;
        int[][] arraybi = arraysbidimensionales.generaArrayBiInt(n, m, min, max);
        int[] array = arraysbidimensionales.filaDeArrayBiInt(n, m, min, max, arraybi, numero);
          System.out.print("La columna "+ numero+" tiene de valores: ");
        for (int i = 0; i < m; i++) {
            res = array[i];
               
            System.out.print(res+ " ");
        }
*/
        
        //ejercicio4 poner resultado entre llaves, coordenadas
        //ejercicio5 minimo en su fila y max en su columna, es dificil llegar a la solucion
        //ejercicio poner coordenadas desde donde empezar y sacar la diagonal,si es posible en caso de cualquier lado, cae en examen(este o recuperacion), el año pasado cayo rey y torre
        /*switch para neso o nose,fila es array.length, para columnas es array[0].length*/
    }
    

}
