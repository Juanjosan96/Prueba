package Funciones;

public class Funciones1a14 {

    /*2. esPrimo: Devuelve verdadero si el número que se pasa como parámetro
es primo y falso en caso contrario.*/
    public static boolean capicua(int n) {
        boolean capicua = false;

        if ((n < 10) && (n >= 0)) {
            capicua = true;
        } else if ((n >= 10) && (n < 100)) {
            if ((n / 10) == (n % 10)) {
                capicua = true;
            }
        } else if ((n >= 100) && (n < 1000)) {
            if ((n / 100) == (n % 10)) {
                capicua = true;
            }
        } else if ((n >= 1000) && (n < 10000)) {
            if (((n / 1000) == (n % 10)) && (((n / 100) % 10) == ((n / 10) % 10))) {
                capicua = true;
            }
        } else if (n >= 10000) {
            if (((n / 10000) == (n % 10)) && ((((n / 1000) % 10)) == ((n / 10) % 10))) {
                capicua = true;

            } else if (n > 100000) {
                System.out.println(" El número es superior a 5 dígitos");
            }
        } else if (n < 0) {
            System.out.println(" El número es inferior a 0");

        }

        if (capicua) {
       
            return true;
        } else {
           
            return false;
        }

    }

    public static boolean esPrimo(int x) {
        for (int i = 2; i < x; i++) {
            if ((x % i) == 0) {
                return false;
            }
        }
        return true;
    }

    /*3. siguientePrimo: Devuelve el menor primo que es mayor al número que
se pasa como parámetro.*/
    public static int nextprimo(int pri) {
 while (!esPrimo(++pri)) {};

    return pri;
        
    }
    //4. potencia: Dada una base y un exponente devuelve la potencia.

    public static int potencia(int n, int i) {
        int resul = 1;
        for (; i > 0; i--) {

            resul = n * resul;

        }

        return resul;
    }

    //5. digitos: Cuenta el número de dígitos de un número entero.
    public static int digitos(int n) {

        int r = 10;
       int i=1;

        for (; i < n; i++) {

            if (n / r == 0) {

               
                n=0;
              
               
            } else {
                r = r * 10;
            }

        }
        return i-1;
    }
    //6. voltea: Le da la vuelta a un número.   REPASAR
    
   public static int voltea(int x){
   if (x < 0) {
      return -voltea(-x);
    }

    int volteado = 0;

    while(x > 0) {
      volteado = (volteado * 10) + (x % 10);
      x = x / 10;
    }

    return volteado;
  }
    
    //7. digitoN: Devuelve el dígito que está en la posición n de un número
//entero. Se empieza contando por el 0 y de izquierda a derecha
   
   public static int digitoN(int n,int d){
     n = voltea(n);

    while (n-- > 0) {
      n = n / 10;
    }

    return (int)n % 10;
  }

    
    // 8. posicionDeDigito: Da la posición de la primera ocurrencia de un dígito
    //dentro de un número entero. Si no se encuentra, devuelve -1.
    public static int posicionDeDigito(int n){
   int j=1;
   int r=n;
   
        for(;j<digitos(n);j++){
        r/=10;
        }
        if(digitos(n)==j){
        r=-1;
        }
   
   return r;
    }
    
    /*
    
    */
}

