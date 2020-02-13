package Funciones;

import static java.lang.Integer.MAX_VALUE;

public class arrays {

    public static int[] generaarrayInt(int n, int max, int min) {

        int[] array = new int[n];
int res=max-min;
        int azar;
        int i = 0;
        for (; i < n; i++) {
            azar = (int) (Math.random() * res +min);
            array[i] = azar;
            System.out.print(azar+" ");
        }
        return array;
    }

    public static int minimoArrayInt(int n, int[] array) {
        int minimo = MAX_VALUE;

        int i = 0;
        for (; i < n; i++) {

            if (array[i] < minimo) {
                minimo = array[i];

            }

        }

        return minimo;
    }

    public static int maximoArrayInt(int n, int[] array) {
        int maximo = Integer.MIN_VALUE;

        int i = 0;
        for (; i < n; i++) {

            if (array[i] > maximo) {
                maximo = array[i];

            }

        }

        return maximo;
    }

    public static int mediaArrayInt(int n, int[] array) {
        int i = 0;
        int suma = 0;
        int media = 0;
        for (; i < n; i++) {
            suma = array[i] + suma;

        }
        media = suma / n;
        return media;
    }

    public static boolean estaEnArrayInt(int n, int numero, int[] array) {
        boolean estado = false;
        int i = 0;
        for (; i < n; i++) {
            if (array[i] == numero) {
                estado = true;

            }

        }
        return estado;
    }

    public static int[] posicionEnArray(int n, int numero, int[] array) {
        int[] arrayposi = new int[n];
        int i = 0;

        for (; i < n; i++) {
            if (array[i] == numero) {
                arrayposi[i] = array[i];

            }

        }
        return arrayposi;
    }

    public static int[] volteaarrayInt(int n, int[] array) {
        int i = 0;
        int[] arrayvol = new int[n];
        int res = 0;
        int cont = 0;
        for (i = n + (-1); i >= 0; i--) {
            arrayvol[cont] = array[i];
            res = arrayvol[cont];
            cont++;
        }
        return arrayvol;
    }

    public static int[] rotaDerechaArrayInt(int n,int num, int[] array) {
        int[] arrayaux = new int[n];
        int i = 0;
       int cont=n-num;
       
        for(i=0;i<n;i++){
            if(i+num<n){
             arrayaux[i+num]=array[i];
            }
            else if(i+num>=n){
            arrayaux[i+(-cont)]=array[i];
            }
          
        
        }
        return arrayaux;
    }
     public static int[] rotaIzquierdaArrayInt(int n,int num, int[] array) {
        int[] arrayaux = new int[n];
        int i = 0;
       int cont=n-num;
       
        for(i=n+(-1);i>=0;i--){
            if(i-num<0){
             arrayaux[cont+i]=array[(i)];
            }
            else if(i-num<n){
            arrayaux[i+(-num)]=array[i];
            }
          
        
        }
        return arrayaux;
    }
}
