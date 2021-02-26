package Ejercicio2Corte.VectoresYMatrizes;


import java.util.Scanner;

public class ListadoProductosVector {   //Ingresa la cantidad de productos, Nombre,Precio,Cantidad y recopila los datos y los muestra
    
    public static void llenar(String Vn[], double P[] , int vector[] ){
        Scanner datos = new Scanner (System.in);
        for(int i=0; i<vector.length; i++){
             System.out.println(" Ingrese el nombre del producto["+i+"]");
            Vn[i]=datos.next();
             System.out.println(" Ingrese el precio del producto["+i+"]");
            P[i]=datos.nextDouble();
            System.out.println(" Ingrese la cantidad["+i+"]");
            vector[i]=datos.nextInt();
        }
    }

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int p;
        System.out.println(" Ingrese la cantidad de productos ");
        p = datos.nextInt();
        String [] A = new String[p];
        double [] B = new double[p];
        int [] C = new int[p];
        llenar(A,B,C);
        System.out.println(" LISTADO DE PRODUCTOS "+"\n"+"Producto"+"\t"+"Precio"+"\t"+"\t"+"Cantidad");
        for(int i=0 ;i < A.length;i++){
            System.out.println(A[i]+"\t"+"\t"+B[i]+"\t"+"\t"+C[i]);
            }
        
    }
}
