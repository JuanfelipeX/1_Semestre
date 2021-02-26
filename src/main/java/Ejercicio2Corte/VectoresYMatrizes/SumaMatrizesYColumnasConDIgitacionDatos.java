package Ejercicio2Corte.VectoresYMatrizes;


import java.util.Scanner;


public class SumaMatrizesYColumnasConDIgitacionDatos {  //Hace suma de matrizes y suma de columnas

     public static void suma(int [][] matriz , int [][] matriz2  ){
         for(int i=0; i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
         int suma=matriz[i][j]+matriz2[i][j];
                System.out.print(suma  + "\t" );
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

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int filas, columnas;
        System.out.println(" Cuantas filas desea");
        filas = datos.nextInt();
        System.out.println(" Cuantas columnas desea");
        columnas = datos.nextInt();
        int matriz [][] = new int [filas][columnas];
        int matriz2 [][] = new int [filas][columnas];
        System.out.println(" Digite datos de la matriz 1");
        llenar(matriz);
        System.out.println(" Digite datos de la matriz 2");
        llenar(matriz2);
        System.out.println(" Datos Matriz 1");
        mostrar(matriz);
        System.out.println(" Datos de Matriz 2");
        mostrar(matriz2);
        System.out.println(" Suma de Matrizes");
        suma(matriz,matriz2);
        System.out.println(" Suma de fila matriz");
        mostrar(matriz);
        System.out.println(" Suma de filas matriz1");
        for(int i=0;i<matriz.length;i++){
            int sum=0;
            for(int j=0;j<matriz[0].length;j++){
                System.out.print(matriz[i][j]+"\t");
                sum+=matriz[i][j];
            }
            System.out.println("\t" + sum );
        }
    } 
}
