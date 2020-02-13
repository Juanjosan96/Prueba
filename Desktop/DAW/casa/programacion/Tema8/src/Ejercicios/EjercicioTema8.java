package Ejercicios;

import Funciones.Funciones1a14;
import java.util.Scanner;

public class EjercicioTema8 {
/*
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
         System.out.println("1. esCapicua:");
         System.out.println("2. esPrimo:");
         System.out.println("3. siguientePrimo:");
         System.out.println("4. potencia:");
         System.out.println("5. digitos:");
         System.out.println("6. voltea:");
         System.out.println("7. digitoN:");
         System.out.println("8. posicionDeDigito:");
         System.out.println("9. quitaPorDetras:");
         System.out.println("10. quitaPorDelante:");
         System.out.println("11. pegaPorDetras:");
         System.out.println("12. pegaPorDelante:");
         System.out.println("13. trozoDeNumero:");
         System.out.println("14. juntaNumeros:");
         
        System.out.println("Introduce número");
        int i = 0;
        int n = s.nextInt();
        switch (n) {
            case 1:
                System.out.println("Introduce número");
                n = s.nextInt();
                boolean resul = Funciones1a14.capicua(n);
                if (resul) {
                    System.out.println("El número " + Math.abs(n) + " es capicua");
                } else {
                    System.out.println("El número " + Math.abs(n) + " no es capicua");
                }

                break;
            case 2:
               
                 n = s.nextInt();

                 resul = Funciones1a14.esPrimo(n);
                if (resul) {
                    System.out.println("El número " + n + " es primo");
                } else {
                    System.out.println("El número " + n + " no es primo");
                }
                break;
           
            case 4: 
                 int b=s.nextInt();
     int e=s.nextInt();
     

     int result= Funciones1a14.potencia(b,e);
     
      System.out.println("La base es "+b + " el exponente es "+ e+ " cuya potencia es: "+ result);
      
     
             
            case 5:
                 
   
      n=s.nextInt();
     int r=Funciones1a14.digitos(n);
      System.out.println("El número "+ n+ " tiene "+ r +" dígitos");
break;

/*
            case 6.
                voltea: 
            case 7.
                digitoN: 
            case 8:
              
  System.out.print("Introduce nº");
     int n=s.nextInt();
     System.out.print("Introduce nº posicion");
     int j=s.nextInt();
        int r=Funciones1a14.posicionDeDigito(n);
     System.out.print(r);
     }
break;
            case 9.
                quitaPorDetras: 
            case 10.
                quitaPorDelante: 
            case 11.
                pegaPorDetras: 
            case 12.
                pegaPorDelante:
            case 13.
                trozoDeNumero: 
            case 14.
                juntaNumeros:
                 */
    
    
//ejercicio1
/* public static void main(String[] args) {
   Scanner s=new Scanner(System.in);
     System.out.println("Introduce número");
   int n=s.nextInt();
   boolean resul=Funciones1a14.capicua(n);
    if(resul){
      System.out.println("El número "+ Math.abs(n)+" es capicua");
      }
      else{
        System.out.println("El número "+ Math.abs(n)+" no es capicua");
      }
    }
   }
 */
 /*
    //ejercicionext(tiene que poner un numero, luego tiene que sacar el primo proximo, con while
    n.nextint
    while(salir==0)
    n++;
    if(x.esprimo(y))){
    print n)
    salir=1
    else salir=0
    }
    salir=0
    break
    
    
    
   public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
   
      boolean resul=Funciones1a14.esPrimo(n);
      if(resul){
      System.out.println("El número "+ n+" es primo");
      }
      else{
        System.out.println("El número "+ n+" no es primo");
      }
    }
//ejercicio2
   public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
   
      boolean resul=Funciones1a14.esPrimo(n);
      if(resul){
      System.out.println("El número "+ n+" es primo");
      }
      else{
        System.out.println("El número "+ n+" no es primo");
      }
    }
    
 */

//ejercicio3 
//ejercicio4
 /*public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
     int b=s.nextInt();
     int e=s.nextInt();
     

     int resul= Funciones1a14.potencia(b,e);
     
      System.out.println("La base es "+b + " el exponente es "+ e+ " cuya potencia es: "+ resul);
      
     }
    */
/*
    //ejercicio5
    
     public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     int n=s.nextInt();
     int r=Funciones1a14.digitos(n);
      System.out.println("El número "+ n+ " tiene "+ r +" dígitos");
     
     }
 */
//ejercicio6
/*
        public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int r=Funciones1a14.voltea(n);
        System.out.println(r);
        }
 */
  //ejercicio7 
    
          public static void main(String[] args) {
          Scanner s=new Scanner(System.in);
          int r=s.nextInt();
          r=Funciones1a14.digitoN(0, 0);
              System.out.println(r);
          
          }
 
//ejercicio8

    /*
     public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
      System.out.print("Introduce nº");
     int n=s.nextInt();
     System.out.print("Introduce nº posicion");
     int j=s.nextInt();
        int r=Funciones1a14.posicionDeDigito(n);
     System.out.print(r);
     }
*/
}






