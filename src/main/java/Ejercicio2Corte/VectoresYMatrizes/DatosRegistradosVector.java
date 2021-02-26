package Ejercicio2Corte.VectoresYMatrizes;


import java.util.Scanner;

public class DatosRegistradosVector {  //Ingresa datos A y B en forma de vector y muestra los registrados
    
    public static void llamada(int vector[]){
        Scanner datos = new Scanner(System.in);
        for(int i=0; i<vector.length;i++){
            System.out.println(" Valor["+i+"]");
            vector[i]=datos.nextInt();
        }
    }

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int [] A = new int[4];
        int [] B = new int [4];
        System.out.println(" Valores A ");
        llamada(A);
        System.out.println(" Valores A ");
        llamada(B);
        System.out.println(" Valores registrados en A " );
        for(int i=0 ;i < A.length;i++){
            System.out.println(A[i]+"\t");
        }
            System.out.println(" Valore Registrado en B ");
            for(int i=0 ; i<B.length;i++){
                System.out.println(B[i]+"\t");
            }
    }
    }
