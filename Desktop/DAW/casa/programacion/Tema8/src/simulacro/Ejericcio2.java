
package simulacro;

import java.util.Scanner;
public class Ejericcio2 {


    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
        System.out.println("Introduce una palabra");
        String texto=s.nextLine();
        
        int azaruno;
        int azardos;
  String fina="";
  String prueba="";
        for(int i=0;i<texto.length();i++){
        azaruno=(int)(Math.random()*texto.length());
          azardos=(int)(Math.random()*texto.length());
        //sacar dos num azar, replace uno con el otro sin machacar resultado
        //array de enteros, convertir string en entero
         char extraer=texto.charAt(azaruno);
         char cambio=texto.charAt(azardos);
         char aux=extraer;
          fina=texto.replace(extraer,cambio);
          
           prueba=fina.replace(cambio,aux);
            
        
            
        }
        System.out.print(fina);
    }
    
}
