package ejercicios1Corte.Parcial1Corte;

import java.util.Scanner;

public class HotelBreakFree {  //En un hotel hay tres tipos de acomodacion dependiendo de los dias y personas se les asigna un precio por la hospedada
    
     public static int sencilla (int personas , int dias ){
        return 120000*personas*dias;
     }
     
      public static int doble (int personas , int dias ){
        return 80000*personas*dias;
      }
      
       public static int multiple (int personas , int dias ){
        return 50000*personas*dias;
       }

    public static void main(String[] args) {
        
        Scanner datos = new Scanner (System.in);
        System.out.println(" Ingrese el nombre ");
        String nombre = datos.next();
        System.out.println(" Ingrese la cantidad de personas ");
        int personas = datos.nextInt();
        System.out.println(" Ingrese la cantidad de dias ");
        int dias = datos.nextInt();
        System.out.println(" Ingrese el tipo de acomodacion");
        System.out.println(" 1. Sencilla ");
        System.out.println(" 2. Doble ");
        System.out.println(" 3. Multiple ");
        int opcion = datos.nextInt();
        switch (opcion){
            case 1:
                int sencilla = sencilla(personas , dias);
                System.out.println(" Hotel Break Free " + "\n"
                + " Cliente: " + nombre + "\n"
                + " Personas: " + personas + "\n"
                + " Dias: " + dias + "\n"
                + " Acomodacion: Sencilla " + "\n"
                + " Valor a pagar: " + sencilla );
                break;
            case 2:
                int doble = doble(personas , dias);
                System.out.println(" Hotel Break Free " + "\n"
                + " Cliente: " + nombre + "\n"
                + " Personas: " + personas + "\n"
                + " Dias: " + dias + "\n"
                + " Acomodacion: Doble " + "\n"
                + " Valor a pagar: " + doble );
                break;
            case 3:
                int multiple = multiple(personas , dias);
                System.out.println(" Hotel Break Free " + "\n"
                + " Cliente: " + nombre + "\n"
                + " Personas: " + personas + "\n"
                + " Dias: " + dias + "\n"
                + " Acomodacion: Multiple " + "\n"
                + " Valor a pagar: " + multiple );
                break;
            default:
                System.out.println(" Error opcion: no existe ");
        }
    }  
}
