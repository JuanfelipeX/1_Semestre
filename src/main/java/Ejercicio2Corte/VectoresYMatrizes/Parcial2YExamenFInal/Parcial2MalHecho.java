package Ejercicio2Corte.VectoresYMatrizes.Parcial2YExamenFInal;

import java.util.Scanner;

public class Parcial2MalHecho {
    
    // Nota 28 No entendi muy bien 
    
    // file:///home/juan/Descargas/Parcial%20Arreglos%20Unidimensionales.pdf
    
    public static int opciones1(){
       Scanner datos = new Scanner (System.in);
        System.out.println(" 1. Ingresar informacion ");
        System.out.println(" 2. Mostrar Datos ");
        System.out.println(" 3. Modificar ");
        System.out.println(" 4. Salir ");
        System.out.print(" \033[31mDigite opcion ");
        int opcion = datos.nextInt();
        return opcion;
     }
    
    public static int opciones2(){
       Scanner datos = new Scanner (System.in);
        System.out.println(" 1. Texto ");
        System.out.println(" 2. Valor ");
        System.out.print(" Digite opcion ");
        int opcion = datos.nextInt();
        return opcion;
     }
     
     public static void texto3(){
        String a= "     \033[31mListado De Datos     ";
        int p = a.length();
    for(int i=0; i < p-1; i++){
                System.out.print("\033[31m*");
            }
            System.out.println();
            
            for(int i=0; i < 1;i++){
                System.out.print("\033[31m*");
                System.out.print("\033[31m " + a.toUpperCase() + "\033[31m ");
                for(int j=0;j < p; j++){
                }
                System.out.println("\033[31m*");
            }
        int i=0;
            do{
                System.out.print("\033[31m*");
                i++;
            }while(i<p-1);
            System.out.println("\033[31m");
    }
     
    public static void datos(int registro[] , String texto[] , int valor []){
        System.out.println( " TEXTOS " + "\t" + " Valor ");
        for(int i=0;i<registro.length;i++){
        System.out.println(texto[i] + " \t " + " \t " + valor[i]);
    }
    }
    
     public static void mostrar(int registro[] , String texto[] , int valor []){
        Scanner datos = new Scanner (System.in);
        for(int i=0;i<registro.length;i++){
             System.out.println(" Ingrese registro: ");
            registro[i]=datos.nextInt();
            System.out.println(" Ingrese el texto ");
            texto[i]=datos.next();
            System.out.println(" Ingrese valor");
            valor[i]=datos.nextInt();
        }
    }
     
     
     
     public static void texto(){
        String a= " \033[31m Menu principal ";
        int p = a.length();
    for(int i=0; i < p-1; i++){
                System.out.print("\033[31m*");
            }
            System.out.println();
            
            for(int i=0; i < 1;i++){
                System.out.print("\033[31m*");
                System.out.print(" " + a.toUpperCase() + " ");
                for(int j=0;j < p; j++){
                }
                System.out.println("\033[31m*");
            }
        int i=0;
            do{
                System.out.print("\033[31m*");
                i++;
            }while(i<p-1);
            System.out.println("\033[341m");
    }
     
     public static void texto2(){
        String a= "     \033[31mRegistro Informacion     ";
        int p = a.length();
    for(int i=0; i < p-1; i++){
                System.out.print("\033[31m*");
            }
            System.out.println();
            
            for(int i=0; i < 1;i++){
                System.out.print("\033[31m*");
                System.out.print("\033[31m " + a.toUpperCase() + "\033[31m ");
                for(int j=0;j < p; j++){
                }
                System.out.println("\033[31m*");
            }
        int i=0;
            do{
                System.out.print("\033[31m*");
                i++;
            }while(i<p-1);
            System.out.println("\033[31m");
    }
     public static void texto4(){
        String a= "     \033[31mModificar datos   ";
        int p = a.length();
    for(int i=0; i < p-1; i++){
                System.out.print("\033[31m*");
            }
            System.out.println();
            
            for(int i=0; i < 1;i++){
                System.out.print("\033[31m*");
                System.out.print("\033[31m " + a.toUpperCase() + "\033[31m ");
                for(int j=0;j < p; j++){
                }
                System.out.println("\033[31m*");
            }
        int i=0;
            do{
                System.out.print("\033[31m*");
                i++;
            }while(i<p-1);
            System.out.println("\033[31m");
    }
     
     public static void modificar(int registro[] , String texto[] , int valores[] ){
        Scanner datos = new Scanner (System.in);
        int  b=0 , m , suma=0;
        String y;
        System.out.println(" Digite el dato a buscar [0 para terminar]:");
        y=datos.next();
        for (int i=0; i<registro.length;i++){
            if(datos.equals(texto[i])){
                System.out.println(texto[i] + "\t" + "=>" + valores[i]);
                System.out.println(" Que desea modificar: ");
            }
            if(datos.equals(0)){
                System.out.println(" Saliendo de modificar");
                opciones1();
            }
            else{
                System.out.println(" Dato no existente ");
            }
        } 
    }
     
     public static void opciones2(int registro[],String texto[] , int valor[]){
         Scanner datos = new Scanner(System.in);
        switch (opciones2()){
            case 1:
                String g;
                System.out.println(" Digite nuevo texto ");
                g = datos.next();
                System.out.println(" Registro  ha sido actualizado ");
                for (int i=0; i<registro.length;i++){
                    System.out.println(g + " => " + valor[i]);
                }
                break;
            case 2:
                int r;
                System.out.println(" Digite nuevo valor");
                r = datos.nextInt();
                System.out.println(" Registro  ha sido actualizado ");
                for (int i=0; i<registro.length;i++){
                    System.out.println(texto[i] + " => " + r);
                break;
                }
            default:
                System.out.println(" Opcion no existente");
                System.exit(0);
        }
     }
   
     
     public static void opciones(int registro[],String texto[] , int valor[]){
        switch (opciones1()){
            case 1:
                texto2();
                mostrar(registro,texto,valor);
                texto3();
                datos(registro,texto,valor);
                opciones1();
                break;
            case 2:
                texto3();
                datos(registro,texto,valor);
                opciones1();
                break;
            case 3:
                texto4();
                modificar(registro,texto,valor);
                opciones2();
                break;
            case 4:
                System.out.println(" Programa terminado... ");
                break;
            default:
                System.out.println(" Error: Opcion no existente... ");
                System.exit(0);
        }
     }

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
       int [] registro = new int[4];
       String [] texto = new String[4];
       int [] valor = new int [4]; 
       texto();
       //opciones1();
       opciones(registro,texto,valor);
    }
}
