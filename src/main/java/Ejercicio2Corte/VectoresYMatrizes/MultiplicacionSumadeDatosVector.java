package Ejercicio2Corte.VectoresYMatrizes;


import java.util.Scanner;

public class MultiplicacionSumadeDatosVector {  //Multiplicacion,Suma A y B en forma vector
    
      public static void multiplicacion(int vA[] , int vB[]){
         Scanner datos = new Scanner(System.in);
        int suma[] = new int [vA.length];
        System.out.println(" \n Multiplicacion de A y B ");
        for(int i=0 ; i < suma.length;i++){
            suma[i] = vA[i] * vB[i];
            System.out.println(suma[i]);
        }
      }
      
      public static void suma(int vA[] , int vB[]){
         Scanner datos = new Scanner(System.in);
        int suma[] = new int [vA.length];
        System.out.println(" \n Suma de A y B ");
        for(int i=0 ; i < suma.length;i++){
            suma[i] = vA[i] + vB[i];
            System.out.println(suma[i]);
        }
        
    }
    
    public static void llenarV(int vector[]){
        Scanner datos = new Scanner(System.in);
        for(int i=0; i<vector.length;i++){
            System.out.println(" Valor{"+i+"]");
            vector[i]=datos.nextInt();
        }
    }

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int [] A = new int[4];
        int [] B = new int [4];
        System.out.println(" Valores A ");
        llenarV(A);
        System.out.println(" Valores B ");
        llenarV(B);
        System.out.println(" Valores registrados en A " );
        for(int i=0 ;i < A.length;i++){
            System.out.println(A[i]+"\t");
        }
            System.out.println(" Valore Registrado en B ");
            for(int i=0 ; i<B.length;i++){
                System.out.println(B[i]+"\t");
            }
            multiplicacion(A,B);
            suma(A,B);
    }
}
