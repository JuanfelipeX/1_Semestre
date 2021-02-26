package Ejercicio2Corte.VectoresYMatrizes;


import java.util.Scanner;

public class MatrizConOperacionMetodoPro { //2Matrizes hace operaciones ingresa filas columnas con switch
    
    public static void datos(){
        Scanner datos = new Scanner(System.in);
          int filas, columnas;
          System.out.println(" Cuantas filas desea");
          filas = datos.nextInt();
          System.out.println(" Cuantas columnas desea");
          columnas = datos.nextInt();
          int matriz [][] = new int [filas][columnas];
          int matriz2 [][] = new int [filas][columnas];
          opciones(matriz,matriz2);
          
    }
    
     public static void suma(int [][] matriz , int [][] matriz2  ){
         for(int i=0; i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
         int suma=matriz[i][j]+matriz2[i][j];
                System.out.print(suma + "\t" );
        }
             System.out.println("");
     }
     }
     
      public static void resta(int [][] matriz , int [][] matriz2  ){
         for(int i=0; i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
         int resta=matriz[i][j]+matriz2[i][j];
                System.out.print(resta + "\t" );
        }
             System.out.println("");
     }
     }
      
       public static void multiplica(int [][] matriz , int [][] matriz2  ){
         for(int i=0; i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
         int multiplicacion=matriz[i][j]+matriz2[i][j];
                System.out.print(multiplicacion  + "\t" );
        }
             System.out.println("");
     }
     }
       
   public static void mostrar(int [][] matriz){
        for(int i=0; i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
    public static void llenar(int [][] matriz ){
        Scanner datos = new Scanner(System.in);
         for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                System.out.println(" Ingrese valor:" + "["+i+"]" + "["+j+"]: " );
                matriz[i][j]=datos.nextInt();
            }
        }
    }
    
    public static int op(){
        Scanner datos = new Scanner (System.in);
        System.out.println(" 1. Llenar datos ");
        System.out.println(" 2. Mostrar Datos ");
        System.out.println(" 3. Operaciones ");
        System.out.println(" 4. Salir ");
        System.out.print(" Digite la opcion ");
        int opcion = datos.nextInt();
        return opcion;
    }
    
    public static int op2(){
        Scanner datos = new Scanner (System.in);
        System.out.println(" OPERACIONES ");
        System.out.println(" 1. Suma ");
        System.out.println(" 2. Resta ");
        System.out.println(" 3. Multiplica ");
        System.out.println(" 4. Salir ");
        System.out.print(" Digite la opcion ");
        int opcion = datos.nextInt();
        return opcion;
    }
    
 
    
    public static void opciones(int  matriz [][] , int  matriz2 [][] ){
        int opc;
        do{
             opc=op();
        switch (opc){
            
            case 1:
          System.out.println(" Digite datos de la matriz 1");
          llenar(matriz);
          System.out.println(" Digite datos de la matriz 2");
          llenar(matriz2);
            break;
            case 2:
                System.out.println(" Datos Matriz 1");
                mostrar(matriz);
                System.out.println(" Datos de Matriz 2");
                mostrar(matriz2);
                
                break;
            case 3:
                int opci=op2();
                
                switch(opci){
                    case 1:
                        suma(matriz,matriz2);
                       
                        break;
                    case 2:
                        resta(matriz,matriz2);
                  
                        break;
                    case 3:
                        multiplica(matriz,matriz2);
                
                        break;
                    case 4:
                        System.out.println(" Regresar al menu princinpal... ");
                        break;
                    default:
                        System.out.println(" Error: Opcion no existente... ");
                        System.exit(0);
                    }
                    break;
            case 4:
                System.out.println(" Programa Terminado... ");
                break;
            default:
                System.out.println(" Error: Opcion no existente... ");
                System.exit(0);
               
    }
        }while(opc!=4);
    }

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        datos();
    }    
}
