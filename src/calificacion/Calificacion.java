
package calificacion;

import java.util.Scanner;
/**
 * @author KARLA
 */
public class Calificacion {

    public static void main(String[] args) {
         Scanner entrada=new Scanner(System.in);
        String nombre;
        int nota;
       
       System.out.print("INGRESE EL NOMBRE DEL ESTUDIANTE:");
       nombre=entrada.next();
       System.out.print("INGRESE LA NOTA DEL ESTUDIANTE:");
       nota=entrada.nextInt();
       
       if(nota<70){
           System.out.println("EL ESTUDIANTE ESTA REPROBADO");
       }else{
           System.out.println("EL ESTUDIANTE ESTA APROBADO");
       }
    }
    
}
