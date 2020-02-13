package Funciones;

import sun.security.util.Length;

public class arraysbidimensionales {

    public static int[][] generaArrayBiInt(int n, int m, int min, int max) {
        int[][] arraybi = new int[n][m];
        int j = 0;
        int azar;
        int i = 0;
        int res = max - min;
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                arraybi[i][j] = (int) ((Math.random() * res + min));
                azar = arraybi[i][j];
                System.out.print(azar + " ");
                if (j == m + (-1)) {
                    System.out.println(" ");

                }
            }
        }
        return arraybi;
    }

    public static int[] filaDeArrayBiInt(int n, int m, int min, int max, int[][] arraybi, int numero) {
        int[] array = new int[arraybi[0].length];
        int i = 0;

        for (; i < arraybi[0].length; i++) {
            array[i] = arraybi[numero][i];
        }
        return array;
    }
    
     public static int[] columnaDeArrayBiInt(int n, int m, int min, int max, int[][] arraybi, int numero) {
        int[] array = new int[arraybi[0].length];
        int i = 0;

        for (; i < arraybi[0].length; i++) {
            array[i] = arraybi[i][numero];
        }
        return array;
    }
  
}
