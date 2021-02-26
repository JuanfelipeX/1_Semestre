package Ejercicio2Corte.VectoresYMatrizes;

import java.util.Scanner;

public class BusquedaNombreyEdadVector {   //Busca un nombre,edad y muestra sus datos
    
    public static void BuscarNombre(int edades[] , String nombres[]){
        Scanner datos = new Scanner (System.in);
        int b=0;
        String g;
         System.out.println(" Ingrese el nombre a buscar ");
         g =datos.next();
         for(int i=0; i<nombres.length;i++){
             if(g.equals(nombres[i])){
             System.out.println("Posicion"+"\t"+"Nombre"+"\t"+"Edad");
             System.out.println(i+"\t"+"\t"+nombres[i]+"\t"+edades[i]);
             b=1;
             }
         }
         if (b==0){
             System.out.println(" Persona no registrada ");
         }
        }
    
    public static void BuscarEdades(int edades[] , String nombres[]){
        int b=0 ,g;
        Scanner datos = new Scanner (System.in);
         System.out.println(" Ingrese la edad a buscar ");
         g =datos.nextInt();
            
         for(int i=0;i<edades.length;i++){
             if(g==edades[i]){
             System.out.println("Posicion"+"\t"+"Nombre"+"\t"+"Edad");
             System.out.println(i+"\t"+"\t"+nombres[i]+"\t"+edades[i]);
             b=1;
             }
         }
         if (b==0){
                     System.out.println(" Edad no registrada ");
         }
    }

    public static void main(String[] args) {
        int edades [] = {17, 17 , 18 , 16 , 19};
        String nombres [] = {"Maria" , "Pedro" , "Juan" , "Sofia" , "Ana" };
        BuscarNombre(edades,nombres);
        BuscarEdades(edades,nombres);
    }
}
