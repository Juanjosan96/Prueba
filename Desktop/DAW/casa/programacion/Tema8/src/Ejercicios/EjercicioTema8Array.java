package Ejercicios;

import Funciones.arrays;
import java.util.Scanner;

public class EjercicioTema8Array {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce cantidad de array");
        int n = s.nextInt();
        System.out.println("Introduce valor máximo del array");
        int max = s.nextInt();
        System.out.println("Introduce valor mínimo del array");
        int min = s.nextInt();
        /*
    //Ejercicio1
        int contador=0;
        for(int m:arrays.generaarrayInt(n,max,min)){
            System.out.println("Posicion "+contador +" el valor es: "+m);
            contador++;
        }
    }
    
         */

        //Ejercicio2
/*
      int[] array=arrays.generaarrayInt(n,max,min);
       int arraymin=arrays.minimoArrayInt(n,array);
          System.out.println("El mínimo es: " + arraymin);
         
    }
         */
 /*
        //Ejercicio3
        int[] array = arrays.generaarrayInt(n, max, min);
        int arraymax = arrays.maximoArrayInt(n, array);
         System.out.println("El Máximo es: " + arraymax);
         */
 /*
        //Ejercicio4
        int[] array = arrays.generaarrayInt(n, max, min);

        int arraymed=arrays.mediaArrayInt(n, array);
        System.out.println("La media es: "+ arraymed);
         */
 /*
        //Ejercicio5
        System.out.println("Introduce número a buscar");
        int numero = s.nextInt();
        int[] array = arrays.generaarrayInt(n, max, min);
        boolean estafuera = arrays.estaEnArrayInt(n, numero, array);
        if (estafuera) {
              System.out.println("El número se ha encontrado");
            System.out.println(estafuera);
        } else {
            System.out.print(estafuera);
            System.out.println(" No se ha encontrado el valor");
        }
         */
//Ejercicio6
/*
System.out.println("Introduce número a buscar");
        int numero = s.nextInt();
        int res=0;
        int[] array = arrays.generaarrayInt(n, max, min);
        int[] posicion = arrays.posicionEnArray(n, numero, array);

        for(int i=0;i<n;i++){
            
            if(posicion[i]==array[i]){
                if(posicion[i]!=0){
                 res=posicion[i];
             System.out.println("El número encontrado se encuentra en la posición: " + i);
                }
            
            }
       
        }
         */
//Ejercicio7
/*
        int res = 0;
        int[] array = arrays.generaarrayInt(n, max, min);
        int[] posicion = arrays.volteaarrayInt(n, array);
        for (int i = 0; i < n; i++) {
            res=posicion[i];
            System.out.print("El array volteado es: "+res);
        }
    
         */
//Ejercicio8
/*
        System.out.println("Introduce el número de desplazamientos a la derecha");
        int num = s.nextInt();
        while (n < num) {
            System.out.println("El número de desplazamiento no debe ser mayor a la cantidad del array");
            num = s.nextInt();

        }
        int[] array = arrays.generaarrayInt(n, max, min);
        int[] posicion = arrays.rotaDerechaArrayInt(n, num, array);
        int res = 0;
        System.out.println(" ");
        System.out.println("El resultado del giro es: ");
        for (int i = 0; i < n; i++) {
            res = posicion[i];

            System.out.print(res + " ");
        }
*/
//Ejercicio9
 System.out.println("Introduce el número de desplazamientos a la izquierda");
        int num = s.nextInt();
        while (n < num) {
            System.out.println("El número de desplazamiento no debe ser mayor a la cantidad del array");
            num = s.nextInt();

        }
        int[] array = arrays.generaarrayInt(n, max, min);
        int[] posicion = arrays.rotaIzquierdaArrayInt(n, num, array);
        int res = 0;
        System.out.println(" ");
        System.out.println("El resultado del giro es: ");
        for (int i = 0; i < n; i++) {
            res = posicion[i];

            System.out.print(res + " ");
        }
    }
}
