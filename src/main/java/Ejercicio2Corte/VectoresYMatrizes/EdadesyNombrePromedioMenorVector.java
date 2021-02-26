package Ejercicio2Corte.VectoresYMatrizes;

import java.util.Scanner;

public class EdadesyNombrePromedioMenorVector {  
    
//Ingresa el nombre y edad de personas muestra los datos y muestra el promedio de edad y el menor de edad.
// Y busca edad y edad de persona y muestra datos   
    
    public static void menor(String nombres[] , int edades[] ){
         int menor ;
         String  nombre = nombres[0];
         menor=edades[0];
         for(int i=0;i<nombres.length;i++){
             if(edades[i]<menor){
                 menor=edades[i];
                 nombre = nombres[i];
             }
         }
          System.out.println(nombre+ " con " + menor + " años ");
     }
    
     public static void menores( String nombres[] , int edades[]){
        int m;
        String q;
        for(int i=0;i<edades.length;i++){
        if(edades[i]<18){
           m=edades[i];
            System.out.println(nombres[i]+"\t"+ m );
        }
    }
    }
     
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
    
    public static void mostrar(String nombres[] , int edades [] ){
        Scanner datos = new Scanner (System.in);
        for(int i=0;i<nombres.length;i++){
            System.out.println(nombres[i]+ "\t"+ edades[i]);
        }
    }
    
    public static void dato(String nombres[] , int edades [] ){
        Scanner datos = new Scanner (System.in);
        for (int i=0; i<edades.length;i++){
            System.out.println(" Ingrese el nombre: ");
            nombres[i]=datos.next();
            System.out.println(" Ingrese la edad ");
            edades[i]=datos.nextInt();
        }
    }
    public static void promedio(int edades [] ){
        float promedio=0;
        int suma=0;
        for(int i=0;i<edades.length;i++){
            suma+=edades[i];
            promedio=suma/4;
        }
        System.out.println(promedio);
    }
    
    public static void main(String[] args) {
        Scanner datos = new Scanner (System.in);
        String [] nombres = new String [4];
        int [] edades = new int [4];
        dato(nombres,edades);
        System.out.println(" Nombres y edades registradas ");
        mostrar(nombres,edades);
        System.out.println(" El promedio de edades es: ");
        promedio(edades);
        System.out.println(" El menor de edad es: ");
        menor(nombres,edades);
        System.out.println(" Las personas menores de 18 años son: ");
         menores(nombres,edades);
         BuscarNombre(edades,nombres);
         BuscarEdades(edades,nombres);
        
    }
}
